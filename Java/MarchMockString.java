

import java.util.*;

class MarchMockString{
    
    public static void main(String [] args){
        
        String s = "aabac";
        
        String org = "";
        
        int n = s.length();
        
        for(int i=0; i<n; i++){
            
            char ch1 = s.charAt(i);
            
            int c = 0;
            
            for(int j=i; j>=0; j--){
                
                char ch2 = s.charAt(j);
                
                if(ch1==ch2){
                    c++;
                }
            }
            
            if(c==1){
                
                org = org+ch1;
            }
        }
        
        for(int i=0; i<n; i++){
            
            for(int j=i; j<n; j++){
                
                String val = "";
                
                for(int k=i; k<=j; k++){
                    
                    char ch = s.charAt(k);
                    
                    val = val+ch;
                    
                }
                
                if(org.length()==val.length()){
                    
                    char[] a = org.toCharArray();
                    char[] b = val.toCharArray();
                    
                    Arrays.sort(a);
                    Arrays.sort(b);
                    
                    if(Arrays.equals(a,b)){
                        System.out.print(val);
                        return;
                    }
                    
                }
                
            }
        }
    }
}