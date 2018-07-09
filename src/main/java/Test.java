
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import models.Driver;
import models.LoginResponse;
import models.RequestBody;
import models.User;
import org.apache.commons.io.output.TeeOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Param;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Future;

import static org.asynchttpclient.Dsl.asyncHttpClient;

public class Test
{
    public static void main(String args[]) throws Exception
    {
        setOutputPrintingToBothConsoleAndFile();
        Test test = new Test();
        test.work();
    }

    private AsyncHttpClient asyncHttpClient = asyncHttpClient();

    public void work() throws Exception
    {
        User user = new User();
        user.setDriverId("7528041");
        user.setPassword("22222");
        user.getRequestBody().setDriverId("7528041");
        user.getRequestBody().setPassword("22222");
        user.getRequestBody().setVehicleId("SHC8639U");


        createLoginRequestAndUpdateUser(user);


        while (true)
        {
            getScheduledJobs(user);
            try
            {
                Thread.sleep(100);
            } catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }

    public void createLoginRequestAndUpdateUser(User user) throws Exception
    {

        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost("https://citynet2.cdgtaxi.com.sg:8443/driverpda/auth.do");

        List<NameValuePair> params = new ArrayList<>(5);
        params.add(new BasicNameValuePair("app_version", "1.3.5"));
        params.add(new BasicNameValuePair("driver_id", user.getRequestBody().getDriverId()));
        params.add(new BasicNameValuePair("password", user.getRequestBody().getPassword()));
        params.add(new BasicNameValuePair("device", "ANDROID"));
        params.add(new BasicNameValuePair("method", "loginWithVersion"));

        httppost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));

        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();


        if (entity != null)
        {
            try (InputStream instream = entity.getContent())
            {
                BufferedReader r = new BufferedReader(new InputStreamReader(instream));
                StringBuilder total = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null)
                {
                    total.append(line);
                }
                r.close();
                String content = total.toString();
                parseLoginContentIntoUser(content, user);
            }
        }
    }

    private void parseLoginContentIntoUser(String content, User user) throws IOException
    {
        LoginResponse response;
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            response = mapper.readerFor(LoginResponse.class).readValue(content);
        } catch (UnrecognizedPropertyException e)
        {
            System.out.println(" UnrecognizedPropertyException : " + e.getMessage());
            // It means the response did not come properly.
            System.out.println("Content : " + content);
            System.out.println("User : " + user);
            System.exit(0);
            return;
            //Most probably it happened because the login driverID and Password is not correct.
        }


        String accessToken = response.getAccessToken();
        user.setAccessTokenInitial(accessToken);
        user.getRequestBody().setAccessToken(accessToken);

        Driver driver = response.getDriver();

        user.setEmail(driver.getEmail());
        user.setDriverName(driver.getDriverName());
        user.setDriverId(driver.getDriverId());
        user.setNric(driver.getNric());
        user.setIdentityCard(driver.getNric());
        user.setMobile(driver.getMobileNo());
        user.setVehicles(driver.getVehicles());


        System.out.println(user);
        System.out.println(System.currentTimeMillis());

    }

    private void getScheduledJobs(User user)
    {
        List<Param> paramList = new ArrayList<>(5);
        RequestBody requestBody = user.getRequestBody();
        paramList.add(new Param("access_token", requestBody.getAccessToken()));
        paramList.add(new Param("vehicle_id", requestBody.getVehicleId()));
        paramList.add(new Param("limit", "999"));
        paramList.add(new Param("filters", "[]"));
        paramList.add(new Param("method", "getJobsScheduled"));

        Future<Integer> whenStatusCode = asyncHttpClient.preparePost("https://citynet2.cdgtaxi.com.sg:8443/driverpda/job.do")
                .setQueryParams(paramList).execute(new GetJobAsyncCompletionHandler(user));
    }

    public static void setOutputPrintingToBothConsoleAndFile() throws IOException
    {
        String fileNamePrefix = "Test_";
        String fileNameSuffix = new Date().toString().replaceAll(" ", "_")
                .replaceAll(":", "-");
        String fileName = System.getProperty("user.home") + File.separator + "Desktop" +
                File.separator + "logs" + File.separator + fileNamePrefix + fileNameSuffix + ".txt";
        System.out.println("LOG FILE : " + fileName);

        File file = new File(fileName);
        FileOutputStream fos = new FileOutputStream(file);
        TeeOutputStream bothStream = new TeeOutputStream(System.out, fos);
        PrintStream ps = new PrintStream(bothStream);
        System.setOut(ps);
        System.setErr(ps);

    }

}
