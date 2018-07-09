package models;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;
import java.util.List;

public class JobFilter
{
    @DatabaseField(columnName = "id", generatedId = true)
    private int id;

    @DatabaseField(columnName = "user_id", foreign = true, canBeNull = false)
    private User user;

    @DatabaseField(columnName = "time_filter", canBeNull = false)
    private String timeFilter;

    private TimeFilterTag timeFilterTag;

    @DatabaseField(columnName = "from_time", canBeNull = false)
    private Date fromTime;

    @DatabaseField(columnName = "to_time", canBeNull = false)
    private Date toTime;

    @DatabaseField(columnName = "from_location_filter_tag")
    private LocationFilterTag fromLocationFilterTag;

    @DatabaseField(columnName = "from_place", canBeNull = false)
    private String fromPlaces;

    private List<PlaceCoordinate> fromPlaceCoordinates;

    @DatabaseField(columnName = "to_location_filter_tag")
    private LocationFilterTag toLocationFilterTag;

    @DatabaseField(columnName = "to_place", canBeNull = false)
    private String toPlaces;

    private List<PlaceCoordinate> toPlaceCoordinates;

    @DatabaseField(columnName = "product_type", canBeNull = false)
    private String productType;

    private List<ProductTypeTag> productTypeTags;

    @DatabaseField(columnName = "max_book_limit")
    private int maxBookLimit;

    // TODO: check what value comes if it is null in db.
    @DatabaseField(columnName = "min_time_interval_between_jobs")
    private int minTimeIntervalBetweenJobs;

    @DatabaseField(columnName = "max_time_interval_between_jobs")
    private int maxTimeIntervalBetweenJobs;

    // TODO: check what value comes if it is null in db.
    @DatabaseField(columnName = "min_trip_distance")
    private double minTripDistance;

    @DatabaseField(columnName = "max_trip_distance")
    private double maxTripDistance;

    @DatabaseField(columnName = "min_time_interval_from_job_creation_time_to_job_pickup_time")
    private int minTimeIntervalFromJobCreationTimeToJobPickupTime;

    @DatabaseField(columnName = "max_time_interval_from_job_creation_time_to_job_pickup_time")
    private int maxTimeIntervalFromJobCreationTimeToJobPickupTime;

    @DatabaseField(columnName = "payment_mode", canBeNull = false)
    private String paymentMode;

    private List<PaymentModeTag> paymentModeTags;

    @DatabaseField(columnName = "min_booking_fee")
    private double minBookingFee;

    @DatabaseField(columnName = "max_booking_fee")
    private double maxBookingFee;

    @DatabaseField(columnName = "product", canBeNull = false)
    private String product;

    private List<ProductTag> productTags;

    @DatabaseField(columnName = "is_active_by_user")
    private boolean isActiveByUser;

    @DatabaseField(columnName = "is_active_by_system")
    private boolean isActiveBySystem;

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String getTimeFilter()
    {
        return timeFilter;
    }

    public void setTimeFilter(String timeFilter)
    {
        this.timeFilter = timeFilter;
    }

    public TimeFilterTag getTimeFilterTag()
    {
        return timeFilterTag;
    }

    public void setTimeFilterTag(TimeFilterTag timeFilterTag)
    {
        this.timeFilterTag = timeFilterTag;
    }

    public Date getFromTime()
    {
        return fromTime;
    }

    public void setFromTime(Date fromTime)
    {
        this.fromTime = fromTime;
    }

    public Date getToTime()
    {
        return toTime;
    }

    public void setToTime(Date toTime)
    {
        this.toTime = toTime;
    }

    public LocationFilterTag getFromLocationFilterTag()
    {
        return fromLocationFilterTag;
    }

    public void setFromLocationFilterTag(LocationFilterTag fromLocationFilterTag)
    {
        this.fromLocationFilterTag = fromLocationFilterTag;
    }

    public String getFromPlaces()
    {
        return fromPlaces;
    }

    public void setFromPlaces(String fromPlaces)
    {
        this.fromPlaces = fromPlaces;
    }

    public List<PlaceCoordinate> getFromPlaceCoordinates()
    {
        return fromPlaceCoordinates;
    }

    public void setFromPlaceCoordinates(List<PlaceCoordinate> fromPlaceCoordinates)
    {
        this.fromPlaceCoordinates = fromPlaceCoordinates;
    }

    public LocationFilterTag getToLocationFilterTag()
    {
        return toLocationFilterTag;
    }

    public void setToLocationFilterTag(LocationFilterTag toLocationFilterTag)
    {
        this.toLocationFilterTag = toLocationFilterTag;
    }

    public String getToPlaces()
    {
        return toPlaces;
    }

    public void setToPlaces(String toPlaces)
    {
        this.toPlaces = toPlaces;
    }

    public List<PlaceCoordinate> getToPlaceCoordinates()
    {
        return toPlaceCoordinates;
    }

    public void setToPlaceCoordinates(List<PlaceCoordinate> toPlaceCoordinates)
    {
        this.toPlaceCoordinates = toPlaceCoordinates;
    }

    public String getProductType()
    {
        return productType;
    }

    public void setProductType(String productType)
    {
        this.productType = productType;
    }

    public List<ProductTypeTag> getProductTypeTags()
    {
        return productTypeTags;
    }

    public void setProductTypeTags(List<ProductTypeTag> productTypeTags)
    {
        this.productTypeTags = productTypeTags;
    }

    public int getMaxBookLimit()
    {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit)
    {
        this.maxBookLimit = maxBookLimit;
    }

    public int getMinTimeIntervalBetweenJobs()
    {
        return minTimeIntervalBetweenJobs;
    }

    public void setMinTimeIntervalBetweenJobs(int minTimeIntervalBetweenJobs)
    {
        this.minTimeIntervalBetweenJobs = minTimeIntervalBetweenJobs;
    }

    public int getMaxTimeIntervalBetweenJobs()
    {
        return maxTimeIntervalBetweenJobs;
    }

    public void setMaxTimeIntervalBetweenJobs(int maxTimeIntervalBetweenJobs)
    {
        this.maxTimeIntervalBetweenJobs = maxTimeIntervalBetweenJobs;
    }

    public double getMinTripDistance()
    {
        return minTripDistance;
    }

    public void setMinTripDistance(double minTripDistance)
    {
        this.minTripDistance = minTripDistance;
    }

    public double getMaxTripDistance()
    {
        return maxTripDistance;
    }

    public void setMaxTripDistance(double maxTripDistance)
    {
        this.maxTripDistance = maxTripDistance;
    }

    public int getMinTimeIntervalFromJobCreationTimeToJobPickupTime()
    {
        return minTimeIntervalFromJobCreationTimeToJobPickupTime;
    }

    public void setMinTimeIntervalFromJobCreationTimeToJobPickupTime(int minTimeIntervalFromJobCreationTimeToJobPickupTime)
    {
        this.minTimeIntervalFromJobCreationTimeToJobPickupTime = minTimeIntervalFromJobCreationTimeToJobPickupTime;
    }

    public int getMaxTimeIntervalFromJobCreationTimeToJobPickupTime()
    {
        return maxTimeIntervalFromJobCreationTimeToJobPickupTime;
    }

    public void setMaxTimeIntervalFromJobCreationTimeToJobPickupTime(int maxTimeIntervalFromJobCreationTimeToJobPickupTime)
    {
        this.maxTimeIntervalFromJobCreationTimeToJobPickupTime = maxTimeIntervalFromJobCreationTimeToJobPickupTime;
    }

    public String getPaymentMode()
    {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode)
    {
        this.paymentMode = paymentMode;
    }

    public List<PaymentModeTag> getPaymentModeTags()
    {
        return paymentModeTags;
    }

    public void setPaymentModeTags(List<PaymentModeTag> paymentModeTags)
    {
        this.paymentModeTags = paymentModeTags;
    }

    public double getMinBookingFee()
    {
        return minBookingFee;
    }

    public void setMinBookingFee(double minBookingFee)
    {
        this.minBookingFee = minBookingFee;
    }

    public double getMaxBookingFee()
    {
        return maxBookingFee;
    }

    public void setMaxBookingFee(double maxBookingFee)
    {
        this.maxBookingFee = maxBookingFee;
    }

    public String getProduct()
    {
        return product;
    }

    public void setProduct(String product)
    {
        this.product = product;
    }

    public List<ProductTag> getProductTags()
    {
        return productTags;
    }

    public void setProductTags(List<ProductTag> productTags)
    {
        this.productTags = productTags;
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

    @Override
    public String toString()
    {
        return "JobFilter{" +
                "id=" + id +
                ", user=" + user.getDriverId() +
                ", timeFilter='" + timeFilter + '\'' +
                ", timeFilterTag=" + timeFilterTag +
                ", fromTime=" + fromTime +
                ", toTime=" + toTime +
                ", fromLocationFilterTag=" + fromLocationFilterTag +
                ", fromPlaces='" + fromPlaces + '\'' +
                ", fromPlaceCoordinates=" + fromPlaceCoordinates +
                ", toLocationFilterTag=" + toLocationFilterTag +
                ", toPlaces='" + toPlaces + '\'' +
                ", toPlaceCoordinates=" + toPlaceCoordinates +
                ", productType='" + productType + '\'' +
                ", productTypeTags=" + productTypeTags +
                ", maxBookLimit=" + maxBookLimit +
                ", minTimeIntervalBetweenJobs=" + minTimeIntervalBetweenJobs +
                ", maxTimeIntervalBetweenJobs=" + maxTimeIntervalBetweenJobs +
                ", minTripDistance=" + minTripDistance +
                ", maxTripDistance=" + maxTripDistance +
                ", minTimeIntervalFromJobCreationTimeToJobPickupTime=" + minTimeIntervalFromJobCreationTimeToJobPickupTime +
                ", maxTimeIntervalFromJobCreationTimeToJobPickupTime=" + maxTimeIntervalFromJobCreationTimeToJobPickupTime +
                ", paymentMode='" + paymentMode + '\'' +
                ", paymentModeTags=" + paymentModeTags +
                ", minBookingFee=" + minBookingFee +
                ", maxBookingFee=" + maxBookingFee +
                ", product='" + product + '\'' +
                ", productTags=" + productTags +
                ", isActiveByUser=" + isActiveByUser +
                ", isActiveBySystem=" + isActiveBySystem +
                '}';
    }

}
