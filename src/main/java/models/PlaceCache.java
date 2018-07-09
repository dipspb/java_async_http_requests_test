package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "place_cache")
public class PlaceCache
{
    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    // TODO: if all is fine, this should be unique
    // TODO: if all ok, then create an index on it
    @DatabaseField(columnName = "place_name", canBeNull = false)
    private String placeName;

    @DatabaseField(columnName = "latlng_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    private Coordinates coordinates;

    @DatabaseField(columnName = "times_accessed")
    private int timesAccessed = 1;

    @DatabaseField(columnName = "created_on")
    private Date createdOn = new Date();

    public PlaceCache()
    {
    }

    public PlaceCache(String placeName, Coordinates coordinates)
    {
        this.placeName = placeName;
        this.coordinates = coordinates;
    }

    public int getId()
    {
        return id;
    }

    public String getPlaceName()
    {
        return placeName;
    }

    public void setPlaceName(String placeName)
    {
        this.placeName = placeName;
    }

    public Coordinates getCoordinates()
    {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates)
    {
        this.coordinates = coordinates;
    }

    public int getTimesAccessed()
    {
        return timesAccessed;
    }

    public void setTimesAccessed(int timesAccessed)
    {
        this.timesAccessed = timesAccessed;
    }

    public Date getCreatedOn()
    {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn)
    {
        this.createdOn = createdOn;
    }

    @Override
    public String toString()
    {
        return "PlaceCache{" +
                "id=" + id +
                ", placeName='" + placeName + '\'' +
                ", coordinates=" + coordinates +
                ", timesAccessed=" + timesAccessed +
                ", createdOn=" + createdOn +
                '}';
    }
}
