class UserDefinedException extends Exception
{
    UserDefinedException(String msg)
    {
        super(msg);
    }
}

// Thread for predefined exception
class A extends Thread
{
    public void run()
    {
        try
        {
            int a = 10;
            int b = 0;

            System.out.println(a / b);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Predefined Exception: " + e);
        }
    }
}

// Thread for user-defined exception
class B extends Thread
{
    public void run()
    {
        try
        {
            int age = 15;

            if(age < 18)
            {
                throw new UserDefinedException("Not Eligible for Voting");
            }
        }
        catch (UserDefinedException e)
        {
            System.out.println("User Defined Exception: " + e.getMessage());
        }
    }
}

class Test
{
    public static void main(String[] args)
    {
        A t1 = new A();
        B t2 = new B();

        t1.start();
        t2.start();
    }
}