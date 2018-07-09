package models;

public enum PaymentModeTag
{
    NULL(null),
    INVOICE("INVOICE"),
    MASTERPASS("MASTERPASS");

    final String paymentModeText;

    PaymentModeTag(String paymentModeText)
    {
        this.paymentModeText = paymentModeText;
    }

    public String getPaymentModeText()
    {
        return paymentModeText;
    }

    @Override
    public String toString()
    {
        return "PaymentModeTag{" +
                "paymentModeText='" + paymentModeText + '\'' +
                '}';
    }

    public static PaymentModeTag getPaymentModeTagFromPaymentModeName(String paymentModeName)
    {
        for (PaymentModeTag paymentModeTag : PaymentModeTag.values())
        {
            if (paymentModeTag.name().equalsIgnoreCase(paymentModeName))
            {
                return paymentModeTag;
            }
        }
        return null;
    }
}
