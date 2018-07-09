package models;

public enum ProductTag
{
    GUARANTEE_DEPARTURE("Guarantee Departure"),
    GUARANTEED_ARRIVAL("Guaranteed Arrival"),
    HOURLY_DISPOSAL_2HRS("Hourly Disposal-2hrs"),
    ONE_WAY_TRANSFER("One Way Transfer"),
    STANDARD("STANDARD");

    private final String productText;

    ProductTag(final String productText)
    {
        this.productText = productText;
    }

    public String getProductText()
    {
        return productText;
    }

    @Override
    public String toString()
    {
        return "ProductTag{" +
                "productText='" + productText + '\'' +
                '}';
    }

    public static ProductTag getProductTagfromProductName(String productName)
    {
        for (ProductTag productTag : ProductTag.values())
        {
            if (productTag.name().equalsIgnoreCase(productName))
            {
                return productTag;
            }
        }
        return null;
    }
}
