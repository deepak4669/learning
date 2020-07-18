import java.util.Scanner;
import java.util.Arrays;
public class Main990C
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //String s=new int[n];
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
      String s=sc.next();
      int count=0;
      for(int j=0;j<s.length();j++)
      {
        if(s.charAt(j)=='(')
          count++;
        else
          count--;
      }
      if(count<0)
      {
        for(int j=0;j<s.length();j++)
        {
          if(s.charAt(j)==
        
      
      
      a[i]=count;
     //stem.out.println(a[i]);
    }
    int ans=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(a[i]>=0&&a[i]+a[j]==0)
          ans++;
      }
    }
    System.out.println(ans);
  }
}
        
          
      
      