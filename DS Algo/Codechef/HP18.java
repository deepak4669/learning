import java.util.*;
import java.io.*;

public class HP18
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int a=sc.nextInt();
      int b=sc.nextInt();
      int[] f=sc.nextIntArray(n);
      int alice=0;
      int bob=0;
      int both=0;
      for(int i=0;i<n;i++)
      {
        if(f[i]%a==0&&f[i]%b==0)
        {
          both++;
        }
        else if(f[i]%a==0)
        {
          bob++;
        }
        else if(f[i]%b==0)
        {
          alice++;
        }
        
      }
      if(bob==0&&both==0)
      {
        out.println("ALICE");
      }
      else if(both>0)
      {
        //winner bob
        if(alice==0)
          out.println("BOB");
        else
        {
          alice-=1;
          //winner ALICE
          if(bob>alice)
            out.println("BOB");
          else if(bob<alice)
            out.println("ALICE");
          else 
            out.println("ALICE");
        }
      }
      else if(both==0)
      {
        if(bob>alice)
          out.println("BOB");
        else if(bob<alice)
          out.println("ALICE");
        else
          out.println("ALICE");
      }
      out.flush();
      
    }
            
    
    
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

