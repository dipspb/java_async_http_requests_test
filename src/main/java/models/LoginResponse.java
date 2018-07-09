package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {

    @JsonProperty("record_count")
    private int recordCount;

    @JsonProperty("driver")
    private Driver driver;

    @JsonProperty("refresh_interval")
    private int refreshInterval;

    @JsonProperty("access_token")
    private String accessToken;


    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getRefreshInterval() {
        return refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "recordCount=" + recordCount +
                ", driver=" + driver +
                ", refreshInterval=" + refreshInterval +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoginResponse response = (LoginResponse) o;

        if (recordCount != response.recordCount) return false;
        if (refreshInterval != response.refreshInterval) return false;
        if (driver != null ? !driver.equals(response.driver) : response.driver != null) return false;
        return accessToken != null ? accessToken.equals(response.accessToken) : response.accessToken == null;
    }

    @Override
    public int hashCode() {
        int result = recordCount;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + refreshInterval;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        return result;
    }
}


