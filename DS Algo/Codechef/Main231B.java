import java.util.*;
import java.io.*;

public class Main231B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=sc.nextInt();
    int l=sc.nextInt();
    int[] a=new int[n+1];
    boolean flag=true;
    if(n%2==0)
    {
      if(d>=0)
      {
        int k=1;
        Arrays.fill(a,1);
        while(d>=l&&k<=n/2)
        {
          a[2*k]=l;
          a[2*k-1]=1;
          d-=(l-1);
          k++;
        }
        if(d>0&&k<=n/2)
        {
         a[2*k]=d+1; 
         d=0;
        }
        if(d>0) flag=false;
      }
      else if(d<0)
      {
        Arrays.fill(a,1);
        int k=1;
        while(Math.abs(d)>=l&&k<=n/2)
        {
          a[2*k]=1;
          a[2*k-1]=l;
          d+=(l-1);
          k++;
        }
        if(Math.abs(d)>0&&k<=n/2)
        {
          a[2*k-1]=Math.abs(d)+1;
          d=0;
        }
        if(Math.abs(d)>0)
          flag=false;
       
      }
    }
    else
    {
      if(d>=0)
      {
        int k=1;
        Arrays.fill(a,1);
        if(d!=0)
        {
          a[1]=Math.min(d,l);
          d-=a[1];
        }
       else if(d==0)
       {
         a[2*k]=2;
       }
        
        while(d>l&&k<=(n/2))
        {
          a[2*k+1]=l;
          a[2*k]=1;
          d-=(l-1);
          k++;
        }
        if(d>0&&k<=n/2)
        {
          a[2*k+1]=d+1;
          d=0;
        }
        if(d>0)
          flag=false;
      }
      else if(d<0)
      {
        d-=1;
        Arrays.fill(a,1);
        int k=1;
        while(Math.abs(d)>=l&&k<=n/2)
        {
          a[2*k]=l;
          d+=(l-1);
          k++;
        }
        if(Math.abs(d)>0&&k<=n/2)
        {
          a[2*k]=Math.abs(d)+1;
          d=0;
        }
        if(Math.abs(d)>0)
          flag=false;
          
      }
    }
    if(flag)
    {
      
      for(int i=n;i>=1;i--)
        out.print(a[i]+" ");
    }
    else
      out.println(-1);
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

