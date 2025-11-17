//8.	Create a java application where we need to create one object-parameterized constructor, it has to display a user-friendly message on the console when we invoke this constructor under the main method. (OPC.java)


class Example{
Example(){
System.out.println("sbdchjgkleght");
}
Example(Example e){
System.out.println("hi");
}

public static void main(String [] args){
Example e = new Example(new Example());

}

}