import java.util.*;
import java.io.*;

public class Main254B
{
  
  static int cal(int month,int day)
  {
    int[] months={0,31,28,31,30,31,30,31,31,30,31,30,31};
    int res=0;
    for(int i=1;i<=month-1;i++)
      res+=months[i];
    return res+day;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    Writer wr=new FileWriter("output.txt");
    Scanner sc=new Scanner(in);
    int n=sc.nextInt();
    int[] marked=new int[2*365+1];
    for(int i=0;i<n;i++)
    {
      int m=sc.nextInt();
      int d=sc.nextInt();
      int p=sc.nextInt();
      int t=sc.nextInt();
      int x=cal(m,d);
      for(int j=1;j<=t;j++)
      {
        marked[x-j+365]+=p;
      }
    }
    int ans=0;
    for(int i=0;i<marked.length;i++)
    {
      ans=Math.max(marked[i],ans);
    }
    wr.write(ans+" ");
    wr.flush();
    wr.close();
    
    
  }
}
            
     
   
   
          
          
          
      
        
    