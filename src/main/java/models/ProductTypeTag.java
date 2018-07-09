package models;

public enum ProductTypeTag
{
    NORMAL("NORMAL"),
    PREMIER("PREMIER");

    private final String productTypeText;

    ProductTypeTag(final String productTypeText)
    {
        this.productTypeText = productTypeText;
    }

    public String getProductTypeText()
    {
        return productTypeText;
    }

    @Override
    public String toString()
    {
        return "ProductTypeTag{" +
                "productTypeText='" + productTypeText + '\'' +
                '}';
    }

    public static ProductTypeTag getProductTypeTagfromProductTypeName(String productTypeName)
    {
        for (ProductTypeTag productTypeTag : ProductTypeTag.values())
        {
            if (productTypeTag.name().equalsIgnoreCase(productTypeName))
            {
                return productTypeTag;
            }
        }
        return null;
    }
}


