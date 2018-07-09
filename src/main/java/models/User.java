package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class User implements Comparable<User>
{

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "driver_id", canBeNull = false)
    private String driverId;

    @DatabaseField(columnName = "password", canBeNull = false)
    private String password;

    @DatabaseField(columnName = "driver_name")
    private String driverName;

    @DatabaseField(columnName = "alias_name")
    private String aliasName;

    @DatabaseField(columnName = "rank", canBeNull = false, defaultValue = "100")
    private int rank;

    @DatabaseField(columnName = "identity_card")
    private String identityCard;

    @DatabaseField(columnName = "mobile")
    private String mobile;

    @DatabaseField(columnName = "email")
    private String email;

    @DatabaseField(columnName = "nric")
    private String nric;

    @DatabaseField(columnName = "access_token")
    private String accessTokenInitial;

    @DatabaseField(columnName = "request_body_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private RequestBody requestBody;

    @ForeignCollectionField
    private Collection<Vehicle> vehicles;

    @ForeignCollectionField
    private Collection<JobFilter> jobFilters;

    @DatabaseField(columnName = "send_message")
    private boolean sendMessage;

    @DatabaseField(columnName = "send_email")
    private boolean sendEmail;

    @DatabaseField(columnName = "created_on")
    private Date createdOn = new Date();

    @DatabaseField(columnName = "updated_on", version = true)
    private Date updatedOn;

    @DatabaseField(columnName = "is_active_by_user")
    private boolean isActiveByUser;

    @DatabaseField(columnName = "is_active_by_system")
    private boolean isActiveBySystem;

    private Date recentAllotmentDate;


    public User()
    {
        vehicles = new ArrayList<Vehicle>();
        requestBody = new RequestBody();
    }

    public int getId()
    {
        return id;
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

    public String getDriverName()
    {
        return driverName;
    }

    public void setDriverName(String driverName)
    {
        this.driverName = driverName;
    }

    public String getAliasName()
    {
        return aliasName;
    }

    public void setAliasName(String aliasName)
    {
        this.aliasName = aliasName;
    }

    public int getRank()
    {
        return rank;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public String getIdentityCard()
    {
        return identityCard;
    }

    public void setIdentityCard(String identityCard)
    {
        this.identityCard = identityCard;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNric()
    {
        return nric;
    }

    public void setNric(String nric)
    {
        this.nric = nric;
    }

    public String getAccessTokenInitial()
    {
        return accessTokenInitial;
    }

    public void setAccessTokenInitial(String accessTokenInitial)
    {
        this.accessTokenInitial = accessTokenInitial;
    }

    public RequestBody getRequestBody()
    {
        return requestBody;
    }

    public void setRequestBody(RequestBody requestBody)
    {
        this.requestBody = requestBody;
    }

    public List<Vehicle> getVehicles()
    {
        return (List<Vehicle>) vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles)
    {
        this.vehicles = vehicles;
    }

    public void setJobFilters(List<JobFilter> jobFilters)
    {
        this.jobFilters = jobFilters;
    }

    public List<JobFilter> getJobFilters()
    {
        return (List<JobFilter>) jobFilters;
    }

    public boolean isSendMessage()
    {
        return sendMessage;
    }

    public void setSendMessage(boolean sendMessage)
    {
        this.sendMessage = sendMessage;
    }

    public boolean isSendEmail()
    {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail)
    {
        this.sendEmail = sendEmail;
    }

    public Date getCreatedOn()
    {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn)
    {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn()
    {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn)
    {
        this.updatedOn = updatedOn;
    }

    public boolean isActiveByUser()
    {
        return isActiveByUser;
    }

    public void setActiveByUser(boolean activeByUser)
    {
        isActiveByUser = activeByUser;
    }

    public boolean isActiveBySystem()
    {
        return isActiveBySystem;
    }

    public void setActiveBySystem(boolean activeBySystem)
    {
        isActiveBySystem = activeBySystem;
    }

    public Date getRecentAllotmentDate()
    {
        return recentAllotmentDate;
    }

    public void setRecentAllotmentDate(Date recentAllotmentDate)
    {
        this.recentAllotmentDate = recentAllotmentDate;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "id=" + id +
                ", driverId='" + driverId + '\'' +
                ", password='" + password + '\'' +
                ", driverName='" + driverName + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", rank=" + rank +
                ", identityCard='" + identityCard + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", nric='" + nric + '\'' +
                ", accessTokenInitial='" + accessTokenInitial + '\'' +
                ", requestBody=" + requestBody +
                ", vehicles=" + vehicles +
                ", jobFilters=" + jobFilters +
                ", sendMessage=" + sendMessage +
                ", sendEmail=" + sendEmail +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                ", isActiveByUser=" + isActiveByUser +
                ", isActiveBySystem=" + isActiveBySystem +
                ", recentAllotmentDate=" + recentAllotmentDate +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return driverId != null ? driverId.equals(user.driverId) : user.driverId == null;
    }

    @Override
    public int hashCode()
    {
        return driverId != null ? driverId.hashCode() : 0;
    }

    public int compareTo(User o)
    {
        if (this.getRank() - o.getRank() != 0)
            return this.getRank() - o.getRank();
        if (this.getRecentAllotmentDate() == null)
            return -1;
        if (o.getRecentAllotmentDate() == null)
            return 1;
        return Long.compare(this.getRecentAllotmentDate().getTime(), o.getRecentAllotmentDate().getTime());
    }
}