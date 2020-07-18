import java.util.*;
import java.io.*;
//267630EY
public class Main279C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=sc.nextIntArray(n);
    if(n<=2)
    {
      for(int i=0;i<m;i++)
      {
        int l=sc.nextInt();
        int r=sc.nextInt();
        out.println("Yes");
      }
    }
    else
    {
      int[] l=new int[n];
      int[] r=new int[n];
      for(int i=0;i<n;i++)
      {
        int v=i;
        while(v<n-1&&a[v]<=a[v+1])
        {
          v++;
        }
        l[i]=v;
        //System.out.println(v+" "+i);
        for(int j=i;j<=v;j++)
          l[j]=v;
        i=v;
      }
      for(int i=n-1;i>=0;i--)
      {
        int v=i;
        while(v>0&&a[v-1]>=a[v])
        {
          v--;
        }
        //System.out.println(v+" "+i);
        r[i]=v;
        for(int j=i;j>=r[i];j--)
        {
          r[j]=v;
        }
        i=v;
      }
      for(int i=0;i<m;i++)
      {
        int lo=sc.nextInt();
        int ro=sc.nextInt();
        lo--;
        ro--;
          
          
        if(l[lo]>=r[ro])
          out.println("Yes");
        else
          out.println("No");
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
