import java.util.Scanner;
public class Pancard {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        if(str.length()==10){
          int c=0;
          for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((i>=0 && i<=2) || i==4 || i==9 && (ch>='A' && ch<='Z') ){
                c++;
            }
            else if(i==5 || i==6 ||i==7 || i==8 &&(Character.isDigit(ch))){
                c++;
            }
            else if(i==3 && ch =='C' || ch=='H' || ch=='A' || ch=='T' || ch=='P' || ch=='F'){
                c++;
            }
        }
             if(c==10){
                System.out.print("valid");
             }
             else{
                System.out.print("not valid");
             }

            
          }  
            
        
        else{
            System.out.print("Not valid");
        }

    }
}
