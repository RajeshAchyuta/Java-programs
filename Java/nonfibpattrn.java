import java.util.Scanner;

public class nonfibpattrn {
    static int nonfib(int f){

        int d = 0;

        int a = 0;

        int b = 1;

        int c = a+b;

        for(int i=4; true; i++){

            while(c<i){
                a=b;
                b=c;
                c = a+b;
            }

            if(c!=i){
                d++;
                if(d==f+1){
                    return i;
                }
            }

        }
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int f = 0;

        for(int i=1;i<=n; i++){

            for(int j=1; j<=i; j++){

                System.out.print(nonfib(f)+" ");
                    f++;
            }
            System.out.println();
        }
    }
}

    
