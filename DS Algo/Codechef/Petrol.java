import java.util.*;
import java.io.*;

public class Petrol
{
  static class pair implements Comparable<pair>
  {
    int a;
    int b;
    public pair(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(pair that)
    {
      if(this.a<that.a) return -1;
      else if(this.a>that.a) return +1;
      else return 0;
    }
  }
    
  public static void main(String[] args)
  {
    int n=4;
    int[] prices={65,66,67,10000};
    PriorityQueue<pair> pq=new PriorityQueue<pair>();
    int ans=0;
    int B=3;
    for(int i=0;i<n;i++)
    {
      if(pq.size()==0)
      {
        pair v=new pair(prices[i],1);
        pq.add(v);
      }
      else
      {
        if(pq.peek().b==B)
        {
          pair v=pq.poll();
          ans+=v.a*v.b;
          if(pq.size()==0)
          {
            pq.add(new pair(prices[i],1));
          }
          else
          {
            pair x=pq.poll();
            x.b++;
            pq.add(x);
            pq.add(new pair(prices[i],0));
          }
          
        }
        else
        {
          pair v=pq.poll();
          v.b++;
          pq.add(v);
          pq.add(new pair(prices[i],0));
        }
      }
    }
    for(pair w:pq)
    {
      ans+=w.a*w.b;
    }
    System.out.println(ans);
    
  }
}
        
        
    