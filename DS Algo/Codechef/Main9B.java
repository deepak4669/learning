import java.util.*;
import java.io.*;

public class Main9B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    double n=sc.nextDouble();
    double vb=sc.nextDouble();
    double vs=sc.nextDouble();
    double[] a=new double[(int)n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextDouble();
    
    double xu=sc.nextDouble();
    double yu=sc.nextDouble();
    double min=1000000000;
    double ans=1;
    for(int i=1;i<n;i++)
    {   
        double dist=0;
        dist+=(a[i]/vb);
        dist+=(Math.sqrt((xu-a[i])*(xu-a[i])+yu*yu)/vs);
        if(dist<min)
        {
          min=dist;
          ans=i;
        }
        else if(dist==min&&Math.sqrt((xu-a[i])*(xu-a[i])+yu*yu)<Math.sqrt((xu-a[(int)ans])*(xu-a[(int)ans])+yu*yu))
        {
          min=dist;
          ans=i;
        }
    }
       
    out.println((int)ans+1);
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

