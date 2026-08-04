import java.util.*;
class A  {

public static void main(String [] args){
Scanner sc = new Scanner(System.in);

	ArrayList<Integer> al = new ArrayList<>();
	LinkedList<Integer> ll = new LinkedList<>();
	al.add(88);
	al.add(78);
	al.add(2);
	al.add(32);
	al.add(10);

	ll.add(88);
	ll.add(78);
	ll.add(2);
	ll.add(32);
	ll.add(76);
	ll.add(9);
	ll.add(10);

	LinkedList<Integer> res = new LinkedList<>();

for(int i =0 ; i<ll.size(); i++){
	
	if(al.contains(ll.get(i))){
		res.add(ll.get(i));
        
}
}	
Collections.sort(res, Collections.reverseOrder());
System.out.println(res);


}

}