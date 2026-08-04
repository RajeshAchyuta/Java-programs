import java.util.*;

class StringToNumberConverter{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int sum = 0;
        String k = "";
        int count = 0;

        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch) || (ch=='-' && k.isEmpty())){
                k += ch;
            }
            else{

                if(!k.isEmpty() && !k.equals("-")){

                    int n = Integer.parseInt(k);

                    if(count>0)
                        if(n<0){
                            System.out.print(" + -");
                        }
                        else{
                            System.out.print(" + ");
                        }
                        

                    System.out.print(k);

                    sum += n;
                    count++;
                }

                k="";
            }
        }

        // last number check
        if(!k.isEmpty() && !k.equals("-")){
            int n = Integer.parseInt(k);

            if(count>0)
                        if(n<0){
                            System.out.print(" + -");
                        }
                        else{
                            System.out.print(" + ");
                        }

            System.out.print(k);

            sum += n;
        }

        System.out.println(" = "+sum);
    }
}