import java.util.*;
import java.lang.*;
import java.io.*;

public class AZ1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    
    
    while(t-->0)
    {
      String p=sc.nextLine();
      String s=sc.nextLine();
      
      int n=sc.nextInt();
      String[] s_arr=s.split(" ");
      StringBuilder ans=new StringBuilder();
      for(int i=0;i<s_arr.length;i++)
      {
        ans.append(s_arr[i]);
        if(i!=s_arr.length-1)
          ans.append("%20");
      }
      System.out.println(ans);
    }
  }
}
        
        
  
  