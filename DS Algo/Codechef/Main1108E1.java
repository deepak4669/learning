import java.util.*;
import java.io.*;

public class Main1108E1
{
  static PrintWriter out=new PrintWriter(System.out);
  static int max(int[] a,int lo,int hi)
  {
    int max=-1000000000;
    for(int i=lo;i<=hi;i++)
      if(max<a[i])
      max=a[i];
    return max;
  }
  static int min(int[] a,int lo,int hi)
  {
    int min=1000000000;
    for(int i=lo;i<=hi;i++)
    {
      if(min>a[i])
        min=a[i];
    }
    return min;
  }
      
  
  public static void main(String[] args) throws IOException
  {
    long startTime=System.nanoTime();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=sc.nextIntArrayOneBased(n);
    int[] l=new int[m];
    int[] r=new int[m];
    for(int i=0;i<m;i++)
    {
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
    }
    
    int[] dup=new int[n+1];
    Vector<Integer> sol=new Vector<Integer>();
    
      
    int ans=max(a,1,n)-min(a,1,n);
    for(int i=1;i<=n;i++)
    {
      Vector<Integer> curr=new Vector<Integer>();
      for(int j=1;j<=n;j++)
        dup[j]=a[j];
      for(int j=0;j<m;j++)
      {
        if(!(l[j]<=i&&r[j]>=i))
        {
          for(int k=l[j];k<=r[j];k++)
            dup[k]-=1;
          curr.add(j);
        }
      }
      int maxv=max(dup,1,n);
      int minv=min(dup,1,n);
      
      if(maxv-minv>ans)
      {
        ans=maxv-minv;
        sol=new Vector<Integer>();
        for(int k:curr)
          sol.add(k);
        
      }
    }
    out.println(ans);
    out.println(sol.size());
    for(int i:sol)
      out.print((i+1)+" ");
    out.flush();
    long endTime=System.nanoTime();
    out.println((endTime-startTime)+"ns");
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

