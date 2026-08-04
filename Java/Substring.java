import java.util.Scanner;
class Substring{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String arr[] = str.split(" ");
        for(int i =0; i<str.length(); i++){
            for(int j =i; j<str.length(); j++){
                
                System.out.println(str.substring(i, j+1));
            }
        }
    }
}