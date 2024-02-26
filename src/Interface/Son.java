package Interface;

public class Son implements Father {
    @Override
    public void loan()
    {
        System.out.println(Father.a);
        System.out.println("I will pay the loan!!!");
    }
}
