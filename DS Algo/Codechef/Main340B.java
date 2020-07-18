import java.util.*;
import java.io.*;

public class Main340B
{
  static PrintWriter out=new PrintWriter(System.out);
  static double area(int x1,int y1,int x2,int y2,int x3,int y3)
  {
    double area=x1*y2+x2*y3+x3*y1-y1*x2-y2*x3-y3*x1;
    area=area/2;
    return area;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] x=new int[n];
    int[] y=new int[n];
    for(int i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
    }
    double max=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        int[] area=new int[n];
        double pos=-1;
        double neg=-1;
        for(int k=0;k<n;k++)
        {
          if(k!=i&&k!=j)
          {
            double val=area(x[i],y[i],x[j],y[j],x[k],y[k]);
            if(val>0&&val>pos)
            {
              pos=val;
            }
            if(val<0&&Math.abs(val)>neg)
            {
              neg=Math.abs(val);
            }
          }
        }
        if(pos!=-1&&neg!=-1)
        {
          if(pos+neg>max)
            max=pos+neg;
        }
      }
    }
    out.println(max);
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

