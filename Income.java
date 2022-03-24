public class Income {


    public double Income (double base_income, double gross_sales) throws ConversionExceptionHandler{


        if (base_income < 0)
            throw new ConversionExceptionHandler("Invalid (low) values");

        return -99;

    } //End Income


    // Attributes
    private double Sum;
    double gross_sales;


    public Income(double base_income) {

        Sum = base_income;
    }


    public String getDescription() {

        String description;

        if (Sum < 0)
            description = "Invalid (low) values";
        else if (gross_sales > 200)
            description = "Gross Sales added";
        else
            description = "invalid";

        return description;
    }

}
