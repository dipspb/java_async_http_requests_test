package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ScheduledJobsResponse {

    @JsonProperty("result")
    private List<ScheduledJobs> scheduledJobs;

    @JsonProperty("cursor")
    private String cursor;

    public List<ScheduledJobs> getScheduledJobs() {
        return scheduledJobs;
    }

    public void setScheduledJobs(List<ScheduledJobs> scheduledJobs) {
        this.scheduledJobs = scheduledJobs;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    @Override
    public String toString() {
        return "ScheduledJobsResponse{" +
                "scheduledJobs=" + scheduledJobs +
                ", cursor='" + cursor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduledJobsResponse response = (ScheduledJobsResponse) o;

        if (scheduledJobs != null ? !scheduledJobs.equals(response.scheduledJobs) : response.scheduledJobs != null)
            return false;
        return cursor != null ? cursor.equals(response.cursor) : response.cursor == null;
    }

    @Override
    public int hashCode() {
        int result = scheduledJobs != null ? scheduledJobs.hashCode() : 0;
        result = 31 * result + (cursor != null ? cursor.hashCode() : 0);
        return result;
    }
}
