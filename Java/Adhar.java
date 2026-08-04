import java.util.Scanner;
public class Adhar {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()==14 && str.charAt(4)==' ' && str.charAt(9)==' '){
                str = str.replace(" ","");
                int c=0;
                for(int i =0; i<str.length(); i++){
                    char ch = str.charAt(i);
                        if(Character.isDigit(ch)){
                            c++;

                        }
                        else{
                            System.out.print("Not a  valid");
                            break;
                        }
                    }
                    if(c==12){
                        System.out.print(" valid");
                    }
                    else{
                        System.out.print("not valis");
                    }

                    
                }
        
        else{
            System.out.print("Not valid");
        }
    }
}

