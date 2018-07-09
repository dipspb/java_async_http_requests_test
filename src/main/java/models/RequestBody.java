package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import io.netty.handler.codec.http.cookie.Cookie;

import java.util.List;

@DatabaseTable(tableName = "request_body")
public class RequestBody
{

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    private String appVersion = "1.3.5";

    @DatabaseField(columnName = "driver_id", canBeNull = false)
    private String driverId;

    @DatabaseField(columnName = "password", canBeNull = false)
    private String password;

    private String device = "ANDROID";

    @DatabaseField(columnName = "vehicle_id", canBeNull = false)
    private String vehicleId;

    private int limit = 999;

    private String accessToken;

    private String filters = "[]";

    private String bidToken;

    private String method;

    private List<Cookie> cookies;

    public String getAppVersion()
    {
        return appVersion;
    }

    public void setAppVersion(String appVersion)
    {
        this.appVersion = appVersion;
    }

    public String getDriverId()
    {
        return driverId;
    }

    public void setDriverId(String driverId)
    {
        this.driverId = driverId;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getDevice()
    {
        return device;
    }

    public void setDevice(String device)
    {
        this.device = device;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public int getLimit()
    {
        return limit;
    }

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public String getAccessToken()
    {
        return accessToken;
    }

    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }

    public String getFilters()
    {
        return filters;
    }

    public void setFilters(String filters)
    {
        this.filters = filters;
    }

    public String getBidToken()
    {
        return bidToken;
    }

    public void setBidToken(String bidToken)
    {
        this.bidToken = bidToken;
    }

    public String getMethod()
    {
        return method;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public List<Cookie> getCookies()
    {
        return cookies;
    }

    public void setCookies(List<Cookie> cookies)
    {
        this.cookies = cookies;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RequestBody that = (RequestBody) o;

        if (limit != that.limit) return false;
        if (appVersion != null ? !appVersion.equals(that.appVersion) : that.appVersion != null) return false;
        if (driverId != null ? !driverId.equals(that.driverId) : that.driverId != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (device != null ? !device.equals(that.device) : that.device != null) return false;
        if (vehicleId != null ? !vehicleId.equals(that.vehicleId) : that.vehicleId != null) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (filters != null ? !filters.equals(that.filters) : that.filters != null) return false;
        if (bidToken != null ? !bidToken.equals(that.bidToken) : that.bidToken != null) return false;
        if (cookies != null ? !cookies.equals(that.cookies) : that.cookies != null) return false;
        return method != null ? method.equals(that.method) : that.method == null;
    }

    @Override
    public int hashCode()
    {
        int result = appVersion != null ? appVersion.hashCode() : 0;
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (device != null ? device.hashCode() : 0);
        result = 31 * result + (vehicleId != null ? vehicleId.hashCode() : 0);
        result = 31 * result + limit;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (filters != null ? filters.hashCode() : 0);
        result = 31 * result + (bidToken != null ? bidToken.hashCode() : 0);
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (cookies != null ? cookies.hashCode() : 0);
        return result;
    }

    @Override
    public String toString()
    {
        return "RequestBody{" +
                "id=" + id +
                ", appVersion='" + appVersion + '\'' +
                ", driverId='" + driverId + '\'' +
                ", password='" + password + '\'' +
                ", device='" + device + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", limit=" + limit +
                ", accessToken='" + accessToken + '\'' +
                ", filters='" + filters + '\'' +
                ", bidToken='" + bidToken + '\'' +
                ", method='" + method + '\'' +
                ", cookies=" + cookies +
                '}';
    }
}
