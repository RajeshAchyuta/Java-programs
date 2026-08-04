import java.util.*;
class  A{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	LinkedList<Integer> ll = new LinkedList<>();

		
	for(int i =0; i<n; i++){
		ll.add(sc.nextInt());
	}
	System.out.println("print stack");
	for(int i =ll.size()-1; i>=0; i--){
	System.out.print(ll.get(i)+" ");
	
	}
	System.out.println();
	System.out.println("print Queue");
	for(int i :ll){
	System.out.print(i+" ");
	}
System.out.println();

for(int i =0 ; i<ll.size(); i++){
	for(int j =i+1; j<ll.size(); j++){
		//System.out.print(ll.get(j)+" ");
		if(ll.get(i)==ll.get(j)){
			ll.remove(ll.get(j));
			j--;
		}
	}
}


System.out.println("after removing an middle element");
System.out.println(ll);

System.out.println("sorting order");
		for(int i =0 ; i<ll.size(); i++){
		for(int j =i+1; j<ll.size(); j++){
			if(ll.get(i)>ll.get(j)){
				int temp =ll. get(i);
				ll.set(i,ll.get(j));
				ll.set(j,temp);
				}
		}
	}
	
System.out.println(ll);

	
}

}