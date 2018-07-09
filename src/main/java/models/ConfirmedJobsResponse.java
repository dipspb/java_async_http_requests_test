package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ConfirmedJobsResponse
{
    @JsonProperty("result")
    private List<ConfirmedJobs> confirmedJobs;

    public List<ConfirmedJobs> getConfirmedJobs()
    {
        return confirmedJobs;
    }

    public void setConfirmedJobs(List<ConfirmedJobs> confirmedJobs)
    {
        this.confirmedJobs = confirmedJobs;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConfirmedJobsResponse that = (ConfirmedJobsResponse) o;

        return confirmedJobs != null ? confirmedJobs.equals(that.confirmedJobs) : that.confirmedJobs == null;
    }

    @Override
    public int hashCode()
    {
        return confirmedJobs != null ? confirmedJobs.hashCode() : 0;
    }

    @Override
    public String toString()
    {
        return "ConfirmedJobsResponse{" +
                "confirmedJobs=" + confirmedJobs +
                '}';
    }
}
