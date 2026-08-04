import java.util.*;
class  A{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	LinkedList<Integer> ll = new LinkedList<>();

		
	for(int i =0; i<n; i++){
		ll.add(sc.nextInt());
	}

for(int i =0 ; i<ll.size(); i++){
	for(int j =i+1; j<ll.size(); j++){
		System.out.print(ll.get(j)+" ");
		if(ll.get(i)==ll.get(j)){
			ll.remove(ll.get(j));
			j--;
		}
	}
}


System.out.print(ll);
		for(int i =0 ; i<ll.size(); i++){
		for(int j =i+1; j<ll.size(); j++){
			if(ll.get(i)>ll.get(j)){
				int temp =ll. get(i);
				ll.set(i,ll.get(j));
				ll.set(j,temp);
				}
		}
	}
	
System.out.print(ll);

	
}

}