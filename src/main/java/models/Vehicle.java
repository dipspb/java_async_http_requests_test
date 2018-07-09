package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "vehicles")
public class Vehicle
{

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "user_id", foreign = true, canBeNull = false)
    private User user;

    @DatabaseField(columnName = "vehicle_type", canBeNull = false)
    @JsonProperty("vehicle_type")
    private String vehicleType;

    @DatabaseField(columnName = "vehicle_id", canBeNull = false)
    @JsonProperty("vehicle_id")
    private String vehicleId;

    public String getVehicleType()
    {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType)
    {
        this.vehicleType = vehicleType;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    @Override
    public String toString()
    {
        return "Vehicle{" +
                "id=" + id +
                ", user=" + user.getDriverId() +
                ", vehicleType='" + vehicleType + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (vehicleType != null ? !vehicleType.equals(vehicle.vehicleType) : vehicle.vehicleType != null) return false;
        return vehicleId != null ? vehicleId.equals(vehicle.vehicleId) : vehicle.vehicleId == null;
    }

    @Override
    public int hashCode()
    {
        int result = vehicleType != null ? vehicleType.hashCode() : 0;
        result = 31 * result + (vehicleId != null ? vehicleId.hashCode() : 0);
        return result;
    }
}
