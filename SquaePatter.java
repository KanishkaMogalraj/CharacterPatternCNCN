import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>=0 && n<=26)
        {
            int i=1;
            while(i<=n)
            {
                int j=1;
                char chh=(char)('A'+i-1);
              
                while(j<=i)
                {
                    System.out.print(chh);
                    j++;
                   
                }
                System.out.println();
                 
                i++;
            }
            
        }
		
	}

}