package models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "scheduled_jobs")
public class ScheduledJobs
{

    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "product_type")
    @JsonProperty("product_type")
    private String productType;

    @DatabaseField(columnName = "notes_to_driver")
    @JsonProperty("notes_to_driver")
    private String notesToDriver;

    @DatabaseField(columnName = "destination")
    @JsonProperty("destination")
    private String destination;

    @DatabaseField(columnName = "product")
    @JsonProperty("product")
    private String product;

    @DatabaseField(columnName = "booking_fee")
    @JsonProperty("booking_fee")
    private double bookingFee;

    @DatabaseField(columnName = "flight_info")
    @JsonProperty("flight_info")
    private String flightInfo;

    @DatabaseField(columnName = "bid_token")
    @JsonProperty("bid_token")
    private String bidToken;

    // TODO : add index = true for this field when program is ready.
    @DatabaseField(columnName = "job_no", canBeNull = false)
    @JsonProperty("job_no")
    private String jobNo;

    @DatabaseField(columnName = "payment_mode")
    @JsonProperty("payment_mode")
    private String paymentMode;

    @DatabaseField(columnName = "pickup_location")
    @JsonProperty("pickup_location")
    private String pickupLocation;


    @DatabaseField(columnName = "pickup_latlng_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    @JsonProperty("pickup_latlng")
    private Coordinates pickupCoordinates;

    @DatabaseField(columnName = "pickup_time")
    @JsonProperty("pickup_time")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss", timezone = "Singapore") // not SGT
    private Date pickupTime;

    @DatabaseField(columnName = "pax_name")
    @JsonProperty("pax_name")
    private String personName;

    @DatabaseField(columnName = "dest_latlng_id", foreign = true, foreignAutoCreate = true, foreignAutoRefresh = true)
    @JsonProperty("dest_latlng")
    private Coordinates destinationCoordinates;

    @DatabaseField(columnName = "distance")
    private Double distance;

    @DatabaseField(columnName = "created_on")
    private Date createdOn = new Date();

    @DatabaseField(columnName = "removed_on")
    private Date removedOn;

    public String getProductType()
    {
        return productType;
    }

    public void setProductType(String productType)
    {
        this.productType = productType;
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

    public double getBookingFee()
    {
        return bookingFee;
    }

    public void setBookingFee(double bookingFee)
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

    public String getBidToken()
    {
        return bidToken;
    }

    public void setBidToken(String bidToken)
    {
        this.bidToken = bidToken;
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

    public String getPersonName()
    {
        return personName;
    }

    public void setPersonName(String personName)
    {
        this.personName = personName;
    }

    public Coordinates getDestinationCoordinates()
    {
        return destinationCoordinates;
    }

    public void setDestinationCoordinates(Coordinates destinationCoordinates)
    {
        this.destinationCoordinates = destinationCoordinates;
    }

    public Double getDistance()
    {
        return distance;
    }

    public void setDistance(Double distance)
    {
        this.distance = distance;
    }

    public Date getCreatedOn()
    {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn)
    {
        this.createdOn = createdOn;
    }

    public Date getRemovedOn()
    {
        return removedOn;
    }

    public void setRemovedOn(Date removedOn)
    {
        this.removedOn = removedOn;
    }

    @Override
    public String toString()
    {
        return "ScheduledJobs{" +
                "id=" + id +
                ", jobNo='" + jobNo + '\'' +
                ", productType='" + productType + '\'' +
                ", notesToDriver='" + notesToDriver + '\'' +
                ", destination='" + destination + '\'' +
                ", product='" + product + '\'' +
                ", bookingFee=" + bookingFee +
                ", flightInfo='" + flightInfo + '\'' +
                ", bidToken='" + bidToken + '\'' +
                ", paymentMode='" + paymentMode + '\'' +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", pickupCoordinates=" + pickupCoordinates +
                ", pickupTime=" + pickupTime +
                ", personName='" + personName + '\'' +
                ", destinationCoordinates=" + destinationCoordinates +
                ", distance=" + distance +
                ", createdOn=" + createdOn +
                ", removedOn=" + removedOn +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduledJobs that = (ScheduledJobs) o;


        return jobNo != null ? jobNo.equals(that.jobNo) : that.jobNo == null;
    }

    @Override
    public int hashCode()
    {
        int result;
        result = (jobNo != null ? jobNo.hashCode() : 0);
        return result;
    }

    public double getDistanceFromPickupToDestination()
    {
        return Coordinates.distanceBetweenCoordinates(pickupCoordinates, destinationCoordinates);
    }

}


