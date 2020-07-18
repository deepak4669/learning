import java.util.*;
import java.io.*;

class Main1076B
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean[] prime=new boolean[100001];
  public static void sieve()
  {
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(100000);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=100000;j+=i)
          prime[j]=false;
      }
    }
  }
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    sieve();
    long n=sc.nextLong();
    if(n%2==0)
    {
      out.println(n/2);
    }
    else
    {
      boolean flag=false;
      long val=0;
      for(long i=3;i<=Math.sqrt(n);i+=2)
      {
        if(prime[(int)i]&&n%i==0)
        {
          //out.println(i);

          val=i;
          flag=true;
          break;
        }
      }
      if(!flag)
        out.println(1);
      else
      {
        //out.println("f");
        long ans=((n-val)/2)+1;
        out.println(ans);
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

