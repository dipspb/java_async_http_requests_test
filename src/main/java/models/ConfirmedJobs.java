package models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class ConfirmedJobs
{
    @JsonProperty("surcharges")
    private List<Surcharge> surcharges;

    @JsonProperty("pax_contact")
    private String paxContact;

    @JsonProperty("product_type")
    private String productType;

    @JsonProperty("vehicle_id")
    private String vehicleId;

    @JsonProperty("notes_to_driver")
    private String notesToDriver;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("product")
    private String product;

    @JsonProperty("booking_fee")
    private int bookingFee;

    @JsonProperty("flight_info")
    private String flightInfo;

    @JsonProperty("company_name")
    private String companyName;

    @JsonProperty("job_no")
    private String jobNo;

    @JsonProperty("payment_mode")
    private String paymentMode;

    @JsonProperty("driver_id")
    private String driverId;

    @JsonProperty("pickup_location")
    private String pickupLocation;

    @JsonProperty("pickup_latlng")
    private Coordinates pickupCoordinates;

    @JsonProperty("pickup_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Singapore") // not SGT
    private Date pickupTime;

    @JsonProperty("pax_name")
    private String paxName;

    @JsonProperty("dest_latlng")
    private Coordinates destinationCoordinates;

    public List<Surcharge> getSurcharges()
    {
        return surcharges;
    }

    public void setSurcharges(List<Surcharge> surcharges)
    {
        this.surcharges = surcharges;
    }

    public String getPaxContact()
    {
        return paxContact;
    }

    public void setPaxContact(String paxContact)
    {
        this.paxContact = paxContact;
    }

    public String getProductType()
    {
        return productType;
    }

    public void setProductType(String productType)
    {
        this.productType = productType;
    }

    public String getVehicleId()
    {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId)
    {
        this.vehicleId = vehicleId;
    }

    public String getNotesToDriver()
    {
        return notesToDriver;
    }

    public void setNotesToDriver(String notesToDriver)
    {
        this.notesToDriver = notesToDriver;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    public int getBookingFee()
    {
        return bookingFee;
    }

    public void setBookingFee(int bookingFee)
    {
        this.bookingFee = bookingFee;
    }

    public String getFlightInfo()
    {
        return flightInfo;
    }

    public void setFlightInfo(String flightInfo)
    {
        this.flightInfo = flightInfo;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getJobNo()
    {
        return jobNo;
    }

    public void setJobNo(String jobNo)
    {
        this.jobNo = jobNo;
    }

    public String getPaymentMode()
    {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode)
    {
        this.paymentMode = paymentMode;
    }

    public String getDriverId()
    {
        return driverId;
    }

    public void setDriverId(String driverId)
    {
        this.driverId = driverId;
    }

    public String getPickupLocation()
    {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation)
    {
        this.pickupLocation = pickupLocation;
    }

    public Coordinates getPickupCoordinates()
    {
        return pickupCoordinates;
    }

    public void setPickupCoordinates(Coordinates pickupCoordinates)
    {
        this.pickupCoordinates = pickupCoordinates;
    }

    public Date getPickupTime()
    {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime)
    {
        this.pickupTime = pickupTime;
    }

    public String getPaxName()
    {
        return paxName;
    }

    public void setPaxName(String paxName)
    {
        this.paxName = paxName;
    }

    public Coordinates getDestinationCoordinates()
    {
        return destinationCoordinates;
    }

    public void setDestinationCoordinates(Coordinates destinationCoordinates)
    {
        this.destinationCoordinates = destinationCoordinates;
    }

    @Override
    public String toString()
    {
        return "ConfirmedJobs{" +
                "surcharges=" + surcharges +
                ", paxContact='" + paxContact + '\'' +
                ", productType='" + productType + '\'' +
                ", vehicleId='" + vehicleId + '\'' +
                ", notesToDriver='" + notesToDriver + '\'' +
                ", destination='" + destination + '\'' +
                ", product='" + product + '\'' +
                ", bookingFee=" + bookingFee +
                ", flightInfo='" + flightInfo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobNo='" + jobNo + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", driverId='" + driverId + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", pickupCoordinates=" + pickupCoordinates +
                ", pickupTime=" + pickupTime +
                ", paxName='" + paxName + '\'' +
                ", destinationCoordinates=" + destinationCoordinates +
                '}';
    }
}
