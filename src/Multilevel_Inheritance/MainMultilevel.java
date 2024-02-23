package Multilevel_Inheritance;

public class MainMultilevel
{
    public static void main(String[] args)
    {
        Grandfather g=new Grandfather();
        Father f=new Father();
        Son s=new Son();

        System.out.println("Accesible for son");
        s.BHK3();
        s.BHK2();
        s.BHK1();

        System.out.println("Accessible for father");
        f.BHK2();
        f.BHK3();

        System.out.println("Accesible for Grandfather");
        g.BHK3();


        Grandfather gs=new Son();//possible
        //Son sg=new Grandfather();//Not possible

    }
}
