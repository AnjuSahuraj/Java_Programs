package Exception;

public class CostExcept {
    private Integer amount;
    private String currency;

    public CostExcept(Integer amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer add(CostExcept c)throws CustomException
    {
        if (!(c.currency.equalsIgnoreCase("INR")))
        {
            throw new CustomException("USD to INR not possible");
        }

            Integer sum = this.amount + c.amount;
            return sum;

    }

}
