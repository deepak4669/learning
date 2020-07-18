import java.util.*;
import java.io.*;

class Main349B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int v=sc.nextInt();
    int[] a=new int[10];
    Arrays.fill(a,0);
    for(int i=1;i<=9;i++)
    {
      a[i]=sc.nextInt();
      
    }
    int min=10000000;
    int d=0;
    //ut.println(a.toString());
    for(int i=9;i>=1;i--)
    {
      if(a[i]<min)
      {
        min=a[i];
        d=i;
      }
    }
    
    if(v<min)
      out.println(-1);
    else
    {
      int x=v/min;
      v=v-x*min;
      StringBuilder s=new StringBuilder();
      char[] ans=new char[x];
      String di=d+"";
      for(int i=0;i<x;i++)
      {
        ans[i]=di.charAt(0);
      }
        
      for(int i=0;i<x;i++)
      {
        String t=ans[i]+"";
        v+=min;
        int k=Integer.parseInt(t);
        for(int j=9;j>=k;j--)
        {
          if(v-a[j]>=0)
          {
            v-=a[j];
            String q=j+"" ;
            ans[i]=q.charAt(0);
            break;
          }
        }
      }
      out.println(ans);
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

