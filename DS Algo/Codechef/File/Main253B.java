import java.io.*;
import java.util.*;

public class Main253B
{
  public static void main(String[] args) throws IOException
  {
    File in=new File("input.txt");
    Writer wr=new FileWriter("output.txt");
    Scanner sc=new Scanner(in);
    int n=sc.nextInt();
    Integer[] a=new Integer[n];
    int[] count=new int[5001];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      count[a[i]]++;
    }
    int ans=Integer.MAX_VALUE;
    int prev=0;
    for(int i=0;i<=5000;i++)
    {
      if(count[i]>0){
        int lo=0;
        int hi=5000;
//        System.out.println(i+" index");
        while(lo<hi)
        {
          int mid=lo+(hi-lo)/2;
          if(mid-2*i>=0)
            hi=mid;
          else
            lo=mid+1;
        }
//        System.out.println(lo);
        int curr=prev;
        for(int j=lo+1;j<=5000;j++)
          curr+=count[j];
        if(curr<ans)
          ans=curr;
        prev+=count[i];
      }
    }
    wr.write(ans+" ");
//    wr.write(0+" ");
    wr.flush();
    wr.close();
  }
}
    
    
    