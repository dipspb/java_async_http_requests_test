package models;


import java.sql.SQLException;

public interface TimeFilterTag
{
    public boolean matches(JobFilter jobFilter, ScheduledJobs job) throws SQLException;
}
