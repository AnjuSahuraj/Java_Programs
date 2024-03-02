package Exception;

public class CustomMain
{
    public static void main(String[] args)throws CustomException
    {
        CostExcept bank=new CostExcept(100,"USD");
        CostExcept hdfc=new CostExcept(100,"INR");
        System.out.println(hdfc.add(bank));

    }
}
