import java.io.*;
import java.util.*;

public class Main12
{
    public static void main(String[] args) throws IOException
    {
        try{
          Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[] res=new int[t];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      res[i]=noSquares(n);
    }
    for(int i=0;i<t;i++)
    {
      if(res[i]==0) System.out.println();
      else
      System.out.println(res[i]);
    }
            //Your Solve
        }catch(Exception e){
            return;
        }
    }
    public static int noSquares(int n)
  {
    int res=0;
    for(int i=1;i<=n;i++)
    {
      res+=i*i;
    }
    return res;
  }
}