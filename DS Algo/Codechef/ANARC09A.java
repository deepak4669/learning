import java.util.*;
import java.util.Stack;
public class ANARC09A  
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int k=1;
    while(true)
    {
      String s=sc.nextLine();
      if(s.contains("-")) break;
      int count=0;
      int min=0;
      for(int i=0;i<s.length();i++)
      {
        char ch=s.charAt(i);
        if(ch=='{') count++;
        else if(count>0) count--;
        else{
          count++;
          min++;}        
      }
      int ans=(min)+count/2;
      
      
        
      
      System.out.println(k+"."+" "+ans);
      k++;
    }
  }
}
      
          
  