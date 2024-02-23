package BasicPrograms;

public class Blocker
{
    {
        System.out.printf("I am IIB");
        //Instance Initization Block-->This will be called only after object creation.
        //Only after IIB , DC will be executed(If SIB is not there)
        System.out.printf("\n");
    }

    Blocker()//default constructor
    {
        System.out.println("I am DC");
    }

    static//SIB-->Static Initialization Block-->This will be called first and only once
    {
        System.out.println("I am SIB");
    }

}
