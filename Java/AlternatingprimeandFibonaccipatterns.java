import java.util.Scanner;
class A
{
    static int isPrime(int n){
        int c =0;
        for(int i =2; ; i++){
            int fc =0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    fc++;
                }
            }
            if(fc==2){
                c++;
            }
            if(c==n){
                return i;
            }
        }
    }
    static int isFib(int n){
        int z=0;
    int a =0; 
    int b =1;
    int c=0;
    while(true){
        c=a+b;
        a=b;
        b=c;
        z++;
    
    if(z==n){
        return a;
    }
    }
    }
    
public static void main(String[]args)
{
Scanner sc =  new Scanner(System.in);
   int n = sc.nextInt();
   if(n<=0){
       System.out.print("Invalid Input");
       return;
   }
   int k =0;
   int prime =1;
   int fib =0;
   for(int i =0; i<n; i++){
       for(int j=0; j<=i; j++){
           k++;
           if(k%2==1){
               
               System.out.print(isPrime(prime)+" ");
               prime++;
           }
           else{
               if(fib==0){
                   System.out.print("0"+" ");
               }
               else{
               System.out.print(isFib(fib)+" ");
               }
               fib++;
           }
       }
       System.out.println();
       
   }
    

}
}
