/*
WAP to swap all words of a given String. Changes must done in main String.
Input : "My name is Rahul Das"
Output: "name My Rahul is Das"
*/
import java.util.*;
public class String_Swap
{
    String str;
    public String_Swap()
    {
        str="";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        sc.close();
        
    }
    void process()
    {
         //String reversedStr = ""; 
          int n = str.length();  
          char temp[] = new char[n];  
          
          // Copying the string into the temp array    
          for (int i = 0; i < n; i++)  
              temp[i] = str.charAt(n-1-i);    
              
          // Printing the reversed string using temp array    
          str = String.valueOf(temp);     
          
    }
    void display(){
        System.out.println("The original string is: "+ str);
    }
    public static void main(String [] args){
        String_Swap sp = new String_Swap();
        sp.input();
        sp.display();
        sp.process();
        sp.display();
    }
}
