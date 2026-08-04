import java.util.*;


class Product{

 String name;
 int price;
 Product(String name, int price){
    this.name = name;
    this.price = price ;

	}
String getName(){
	return name;
	}
int  getPrice(){
	return price;
}

public  String toString(){
 return (getName()+" "+getPrice());
}
 
}
class A{

	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer, Product> hm = new HashMap<>();
	
     
	
	int n = sc.nextInt();
	for(int i =0; i<n; i++){
	hm.put(sc.nextInt(), new Product(sc.next(), sc.nextInt()));
	}
	
	ArrayList<Map.Entry<Integer, Product>> al = new ArrayList<>(hm.entrySet());
	
	Collections.sort(al, (a,b) -> b.getValue().getPrice()-a.getValue().getPrice());



	System.out.println(al);

	
	
				}

}