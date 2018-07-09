package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

public class Driver {

    @JsonProperty("email")
    private String email;

    @JsonProperty("driver_name")
    private String driverName;

    @JsonProperty("associated_vehicle")
    private List<Vehicle> vehicles;

    @JsonProperty("driver_id")
    private String driverId;

    @JsonProperty("nric")
    private String nric;

    @JsonProperty("mobile_no")
    private String mobileNo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getNric() {
        return nric;
    }

    public void setNric(String nric) {
        this.nric = nric;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "email='" + email + '\'' +
                ", driverName='" + driverName + '\'' +
                ", vehicles=" + Arrays.toString(vehicles.toArray()) +
                ", driverId='" + driverId + '\'' +
                ", nric='" + nric + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (email != null ? !email.equals(driver.email) : driver.email != null) return false;
        if (driverName != null ? !driverName.equals(driver.driverName) : driver.driverName != null) return false;
        if (vehicles != null ? !vehicles.equals(driver.vehicles) : driver.vehicles != null) return false;
        if (driverId != null ? !driverId.equals(driver.driverId) : driver.driverId != null) return false;
        if (nric != null ? !nric.equals(driver.nric) : driver.nric != null) return false;
        return mobileNo != null ? mobileNo.equals(driver.mobileNo) : driver.mobileNo == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (driverName != null ? driverName.hashCode() : 0);
        result = 31 * result + (vehicles != null ? vehicles.hashCode() : 0);
        result = 31 * result + (driverId != null ? driverId.hashCode() : 0);
        result = 31 * result + (nric != null ? nric.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        return result;
    }
}
