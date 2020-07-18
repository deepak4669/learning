import java.util.*;
import java.io.*;

public class Main382C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    //int[] a=sc.nexrtIntArray(n);
    Integer[] a=new Integer[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    Arrays.sort(a);
    if(n==1)
      out.println(-1);
    else
    {
      if(n==2)
      {
        if(a[0]==a[1])
        {
          out.println(1);
          out.println(a[0]);
        }
        else
        {
          if((a[1]-a[0])%2!=0)
          {
            out.println(2);
            out.println(a[0]-(a[1]-a[0])+" "+(a[1]+(a[1]-a[0])));
          }
          else
          {
            out.println(3);
            out.println(a[0]-(a[1]-a[0])+" "+(a[0]+(a[1]-a[0])/2)+" "+(a[1]+(a[1]-a[0])));
          }
        }
      }
      else
      {
        int[] d=new int[n];
        int min=10000001;
        int max=0;
        for(int i=1;i<n;i++)
        {
          d[i-1]=a[i]-a[i-1];
          if(max<d[i-1]) max=d[i-1];
          if(min>d[i-1]) min=d[i-1];
        }
        //out.println(max+" "+min);
        if(max!=0&&max==2*min)
        {
          int cntmin=0;
          int cntmax=0;
          for(int i=0;i<n-1;i++)
          {
            if(d[i]==min)
              cntmin++;
            if(d[i]==max)
              cntmax++;
          }
          if(cntmin==n-2)
          {
            out.println(1);
            int pos=0;
            for(int i=0;i<n-1;i++)
            {
              if(d[i]==max)
              {
                pos=i;
              }
            }
            out.println((a[pos+1]+a[pos])/2);
          }
          else 
          {
            out.println(0);
          }
        }
        else if(min==max)
        {
          if(min==0)
          {
            out.println(1);
            out.println(a[0]);
          }
          else{
          out.println(2);
          out.println(a[0]-min+" "+(a[n-1]+min));
          }
        }
        else
        {
          out.println(0);
        }
      }
    }
    out.flush();
          
          
              
        
        
          
          
    
  }
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
        {
      br=new BufferedReader(new InputStreamReader(is));
    }
        public int nextInt() throws IOException
        {
          if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
          tk=new StringTokenizer(br.readLine());
          return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
              return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
          if(tk.hasMoreTokens())
            return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
          tk=new StringTokenizer("");
          return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
              return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
              return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
          long a[]=new long[n];
            for(int i=0;i<n;i++)
              a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
          int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
          long a[]=new long[n+1];
          for(int i=1;i<=n;i++)
                a[i]=nextLong();
          return a;
        }
  }
}

