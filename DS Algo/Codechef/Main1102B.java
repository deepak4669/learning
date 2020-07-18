import java.util.*;
import java.io.*;

public class Main1102B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int max=0;
    int[] a=new int[n];
    int[] f=new int[5001];
    Vector<Integer>[] t=(Vector<Integer>[]) new Vector[5001];
    for(int i=0;i<=5000;i++)
      t[i]=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      f[a[i]]++;
      t[a[i]].add(i);
      if(f[a[i]]>max)
        max=f[a[i]];
      
    }
    if(max>k)
      out.println("NO");
    else
    {
      if(n<k)
        out.println("NO");
      else
      {
        out.println("YES");
        int[] ans=new int[n];
        int counter=1;
        for(int i=0;i<n;i++)
        {
          if(ans[i]==0)
          {
            for(int j:t[a[i]])
            {
              
              ans[j]=counter;
              counter++;
              if(counter>k)
                counter=1;
            }
          }
        }
        for(int i=0;i<n;i++)
          out.print(ans[i]+" ");
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

