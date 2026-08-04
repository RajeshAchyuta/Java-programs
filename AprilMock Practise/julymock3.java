import java.util.*;
class Product{
	int p_id;
	String p_name;
	int p_price;
	
	Product(int p_id, String p_name, int p_price){
	this.p_id = p_id;
	this.p_name = p_name;
	this.p_price = p_price;
	}

public int getP_id(){
	return p_id;
	}

public String getP_name(){
	return p_name;
	}
public int getP_price(){
	return p_price;
}
public String toString(){
	return (getP_id() +" "+ getP_name() +" "+ getP_price());
}
}
class Main{
public static void main(String [] args){

	Scanner sc = new Scanner(System.in);
	ArrayList<Product> al = new ArrayList<>();
	int n = sc.nextInt();
	
	for(int i =0; i<n ; i++){
	al.add(new Product(sc.nextInt(), sc.next(), sc.nextInt()));
	}
Collections.sort(al ,(a,b) -> a.getP_price()-b.getP_price());
System.out.print(al);


Collections.sort(al ,(a,b) -> b.getP_price()-a.getP_price());

System.out.print(al);


}

}