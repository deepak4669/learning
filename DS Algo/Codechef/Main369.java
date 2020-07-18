import java.util.*;
import java.io.*;
//267630EY
public class Main369
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean[] prime;
  static void sieve()
  {
    prime=new boolean[101];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    for(int i=2;i<=100;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=100;j+=i)
        {
          prime[j]=false;
        }
      }
    }
  }
  public static long factorial(int n)
  {
    if(n<=1) return 1;
    long ans=1;
    while(n>0)
    {
      ans=(ans*n);
      n--;
    }
    return ans;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    sieve();
    
    
    
    while(true)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      
      if(x==0&&y==0) break;
      
      int countn[]=new int[101];
      int countd[]=new int[101];
      
      int maxd=Math.max(x-y,y);
//      System.out.println(maxd);
      for(int i=maxd+1;i<=x;i++)
      {
        int dup=i;
        for(int j=1;j<=100;j++)
        {
          int cnt=0;
          if(prime[j]&&dup%j==0)
          {
            
            while(dup%j==0&&dup>0)
            {
              dup/=j;
              cnt++;
            }
          }
          countn[j]+=cnt;
        }
      }
      
      for(int i=1;i<=Math.min(x-y,y);i++)
      {
        int dup=i;
        for(int j=1;j<=100;j++)
        {
          int cnt=0;
          if(prime[j]&&dup%j==0)
          {
            while(dup%j==0&&dup>0)
            {
              dup/=j;
              cnt++;
            }
          }
          countd[j]+=cnt;
        }
      }
      long ans=1;
      
//      System.out.println(countn[2]+" "+countn[17]+" "+countn[3]+" "+countn[5]+" "+countn[17]);
//      System.out.println(countd[5]+" "+countd[2]+" "+countd[3]);
      
      for(int i=0;i<=100;i++)
      {
        if(prime[i])
        {
          ans=(ans*(long)Math.pow(i,countn[i]-countd[i]));
        }
      }
      out.println(x+" things taken "+y+" at a time is "+ans+" exactly.");
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

