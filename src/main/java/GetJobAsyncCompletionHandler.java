import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.socket.ChannelOutputShutdownException;
import models.ScheduledJobsResponse;
import models.User;
import org.asynchttpclient.AsyncCompletionHandler;
import org.asynchttpclient.Response;
import org.asynchttpclient.exception.RemotelyClosedException;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.concurrent.TimeoutException;

public class GetJobAsyncCompletionHandler extends AsyncCompletionHandler<Integer>
{

    private User user;

    public GetJobAsyncCompletionHandler(User user)
    {
        this.user = user;
    }

    @Override
    public Integer onCompleted(Response response)
    {
        try
        {
            ObjectMapper mapper = new ObjectMapper();
            ScheduledJobsResponse scheduledJobsResponse = mapper.readerFor(ScheduledJobsResponse.class).readValue(response.getResponseBody());
            System.out.println("Driver used = " + user.getDriverId() + " Job count = " + scheduledJobsResponse.getScheduledJobs().size());
        } catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("FOR RESPONSE : " + response.getResponseBody() + " T : " + System.currentTimeMillis());
            System.exit(0);
        }

        //asyncHttpClient.close(); //imp
        return 200;
    }

    @Override
    public void onThrowable(Throwable t)
    {
        if (t instanceof TimeoutException)
            System.out.println("TimeoutException");
        else if (t instanceof ConnectException)
            System.out.println("ConnectException");
        else if (t instanceof ChannelOutputShutdownException)
            System.out.println("ChannelOutputShutdownException");
        else if (t instanceof RemotelyClosedException)
            System.out.println("RemotelyClosedException");
        else if (t instanceof UnknownHostException)
            System.out.println("UnknownHostException");
        else if (t instanceof IOException)
            System.out.println("IOException");
        else
            t.printStackTrace();
    }
}

