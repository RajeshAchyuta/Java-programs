import java.util.Scanner;
public class Password {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()==9){
            boolean  uc= false, lc = false, sp = false,d=false,k=true;
                for(int i =0; i<str.length(); i++){
                    char ch = str.charAt(i);
                    if(Character.isUpperCase(ch)){
                        uc=true;
                    }
                    else if(Character.isLowerCase(ch)){
                        lc = true;
                    }
                    else if(Character.isDigit(ch)){
                            d=true;
                    }
                    else if(ch!=' '){
                                sp =true;
                    }
                    else{
                        k = false;
                    }
                    
                }
                if(uc && lc && d && sp && k ){
                    System.out.print("perfecf");
                }
                else{
                    System.out.print("Not perfecfr");
                }
        }
        else{
            System.out.print("invalid");
        }
    }
}
