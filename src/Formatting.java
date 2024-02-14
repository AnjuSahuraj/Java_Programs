public class Formatting
{

    public static void main(String args[])
    {
        int n=10;
        System.out.printf("Number is %d",n);
        String name="Sid";
        System.out.println();
        System.out.printf("Name is %s",name);
        System.out.println();
        final String s1="STR";
        //s1="ABC"; Cannot assign value to final variable.Value of final variable cannot be changed.
        System.out.println(s1);

        char s2='\n';//New Line
        char s3='\t';//New Tab
        System.out.println("Anju"+s2+"Sahuraj");
        String s4="Sid";
        int a=10;
        int b=45;
        //Concatenation-->String+other-->Concatenation happens from left to right
        System.out.println(a+b+s4);

        //All + are concatenation
        System.out.println(s4+a+b);

        b+=10;//Compound assignment
        System.out.println(b);

        //Interview Question
        System.out.println(10==10);
        System.out.println('A'==65);//ASCII Value

        System.out.println('A'==65.0);//Property of java

        System.out.println('A'==65.2);

        int k=10;
        byte b1=20;
        k=b1;//implicit casting
        System.out.println(k);
        int a5=300;
        byte l=(byte)a5;//Explicit casting

        //Ternary operator
        int t1=true?10:20;
        int t2=30<20?10:20;
        System.out.println(t1);
        System.out.println(t2);


    }

}
