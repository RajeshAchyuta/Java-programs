import java.util.Scanner;
public class ValidParanthisis {
    static boolean isValid(String s){
        char arr[] = new char[s.length()];
        int top =-1;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
        
        if(ch=='(' || ch=='{' || ch=='['){
            arr[++top] =ch;
        }
        else{
            if(top == -1){
                return false;
            }
            char last = arr[top--];
            if(ch ==')' && last !='(' ||
                ch == '}' && last !='{' ||
                ch == ']' && last !='['
            )
            {
            return false;
            }
        }
    }
    return top ==-1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(isValid(s)){
            System.out.print("true;");
        }
        else{
            System.out.print("false");
        }
    }
}
