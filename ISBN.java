//Program to check whether the given number is a valid ISBN(International Standard Book Number) or not 
  
/*ISBN number is a legal number when
  sum=1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10
  if the sum is divisible by 11 valid ISBN Number else not a valid ISBN Number.   
*/


import java.io.*;
import java.util.*;     
    class ISBN
    {   
    
        static boolean checkISBNNumber(long number)  
        {  
                
                int sum = 0;  
                int i, t, intNumber, dNumber;  
                String strNumber;  
                strNumber = ""+number;  
          
                if (strNumber.length() != 10)
                {  
                    return false;  
                }  
          
                for (i = 0; i < strNumber.length(); i++)
                {  
                    intNumber = Integer.parseInt(strNumber.substring(i, i+1));  
                    dNumber = i + 1;  
                    t = dNumber * intNumber;  
                    sum = sum + t;  
                }  
                
                if ((sum % 11) == 0)
                {  
                    return true;  
                }  
          
                return false;  
        }  
    

        public static void main(String args[])   
        {     
               long n1, n2;
               Scanner nkp=new Scanner(System.in);
               
               try
               {
                   System.out.println("Enter first 10 digit ISBN number");  
                   n1 = nkp.nextLong();   
                   System.out.println("Enter second 10 digit ISBN number");   
                   n2 = nkp.nextLong();;  
              
                   if (checkISBNNumber(n1))   
                        System.out.println(n1 + " is a valid ISBN number");   
                   else  
                        System.out.println(n1 + " is not a valid ISBN number");  
                        
                   if (checkISBNNumber(n2))   
                        System.out.println(n2 + " is a a valid ISBN number");   
                   else  
                        System.out.println(n2 + " is not a valid ISBN number");  
                }
                
               catch(java.lang.Exception e) 
               {  
                   System.out.println("Error while reading the data.");  
               }   
        }   
    } 