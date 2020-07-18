import java.util.*;
import java.io.*;

class DEC3
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    int coins=1000;
    int lo=1;
    int hi=n;
    boolean flag=false;
    while(coins>0&&hi>lo&&!flag)
    {
      if(hi-lo<=coins)
      {
        
        for(;lo<=hi;lo++)
        {
          out.println(1+" "+lo);
          out.flush();
          int y=sc.nextInt();
          if(y==1)
          {
            flag=true;
            break;
          }
        }
        continue;
      }
                           
      
      int m1=lo+(hi-lo)/4;
      int m2=m1+(hi-lo)/4;
      int m3=hi-(hi-lo)/4;
      out.println(1+" "+m1);
      out.flush();
      coins-=1;
      int x=sc.nextInt();
      if(x==1)
      {
        hi=m1;        
        out.println("2");
        out.flush();
        coins-=c;
        continue;
      }
      lo=m1+1;
      out.println(1+" "+m2);
      out.flush();
      coins-=1;
      x=sc.nextInt();
      if(x==1)
      {
        hi=m2;
        out.println("2");
        out.flush();
        coins-=c;
        continue;
      }
      lo=m2+1;
      out.println(1+" "+m3);
      out.flush();
      coins-=1;
      x=sc.nextInt();
      if(x==1)
      {
        hi=m3;
        out.println(2);
        out.flush();
        coins-=c;
        continue;
      }
      lo=m3+1;
    }
    out.println("3 "+lo);
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

