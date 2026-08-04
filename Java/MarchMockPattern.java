import java.util.Scanner;
class MarchMockPattern

{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String sm=s.next();
        int n=sm.length();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(sm.charAt(j));
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-1-i;j>=0;j--)
            {
                if(j==n-1)
                {
                    continue;
                }
                System.out.print(sm.charAt(j));
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(sm.charAt(j));
            }
            for(int j=0;j<i*2-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=n-1-i;j>=0;j--)
            {
                if(j==n-1)
                {
                    continue;
                }
                System.out.print(sm.charAt(j));
            }
            System.out.println();
        }
        
    }
}