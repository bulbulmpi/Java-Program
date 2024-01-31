

import java.util.*;

public class prime_number{
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n,i,j,flag=0;
        System.out.println("Enter Any Integer Number");
       n=s.nextInt();
      for(i=2;i<=n/2;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
}    
}
 