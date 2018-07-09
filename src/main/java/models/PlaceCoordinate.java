package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

public class PlaceCoordinate
{
    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    // TODO: once ready, an index should be created on it.
    @DatabaseField(columnName = "place_name", canBeNull = false)
    private String placeName;

    @DatabaseField(columnName = "place_latlng_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true, canBeNull = false)
    private Coordinates coordinates;

    @DatabaseField(columnName = "proximity_distance", canBeNull = false)
    private double proximityDistance;

    public PlaceCoordinate()
    {
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

    public double getProximityDistance()
    {
        return proximityDistance;
    }

    public void setProximityDistance(double proximityDistance)
    {
        this.proximityDistance = proximityDistance;
    }

    @Override
    public String toString()
    {
        return "PlaceCoordinate{" +
                "id=" + id +
                ", placeName='" + placeName + '\'' +
                ", coordinates=" + coordinates +
                ", proximityDistance=" + proximityDistance +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaceCoordinate that = (PlaceCoordinate) o;

        if (Double.compare(that.proximityDistance, proximityDistance) != 0) return false;
        if (placeName != null ? !placeName.equals(that.placeName) : that.placeName != null) return false;
        return coordinates != null ? coordinates.equals(that.coordinates) : that.coordinates == null;
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        result = placeName != null ? placeName.hashCode() : 0;
        result = 31 * result + (coordinates != null ? coordinates.hashCode() : 0);
        temp = Double.doubleToLongBits(proximityDistance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
