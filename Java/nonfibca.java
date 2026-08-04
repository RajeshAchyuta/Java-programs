import java.util.Scanner;
public class nonfibca
{
	static int nonfib(int n){
		int a  =0,b=1,c=0, k =0;
	for(int i =0; ; i++){
	    while(c<i){
	        c= a+b;
	        a=b;
	        b=c;
		}
	    if(c!=i){
	        k++;
	    }
		if(n==k){
			return i;
		}
	
	    
	}
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = (n*(n+1))/2;
	int arr[] = new int[x];
	for(int i =0; i<x; i++){
		arr[i] = nonfib(i+1);
	}

	for(int i =0;i<n; i++){
		int m =i;
		for(int j =0; j<=i; j++){
			System.out.print(arr[m]+" ");
			m= m+(n-j-1);
			
		}
		System.out.println();
	}
	}
}
