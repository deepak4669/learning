import java.util.*;
import java.io.*;
//267630EY
public class Main1114C
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean[] prime;
  public static void sieve()
  {
    prime=new boolean[1000001];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    int m=(int)Math.sqrt(1000000);
    for(int i=2;i<=m;i++)
    {
      if(prime[i])
      {
        for(int j=i*i;j<=1000000;j+=i)
          prime[j]=false;
      }
    }
  }
      
  
  static boolean isPrime(long n)
  {
    if(n<2) return false;
    for(int i=2;i<=Math.sqrt(n);i++)
      if(n%i==0) return false;
    return true;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long b=sc.nextLong();
    long cnt=0;
    long g=b;
   sieve();
    Vector<Long> p=new Vector<Long>();
  
    HashMap<Long,Long> map=new HashMap<Long,Long>();
    for(int i=1;i<=Math.sqrt(b);i++)
    {
      if(prime[i]&&g%i==0)
      {
        map.put((long)i,(long)0);
        while(g%i==0&&g>0)
        {
          g/=i;

          map.put((long)i,map.get((long)i)+1);
        }
        p.add((long)i);
      }
      if(g%(b/i)==0&&isPrime(b/i))
      {
        long a=b/i;
        map.put(b/i,(long)0);
         while(g%a==0&&g>0)
        {
          g/=a;
  
          map.put(b/i,map.get(b/i)+1);
        }
        p.add((long)a);
      }
    }
    //System.out.println(p);
    g=b;
    String s="1000000000000000000";
    long ans=Long.parseLong(s);
    for(long k:p)
    {
      cnt=0;
      long l=k;
      while(n>=k)
      {
        //System.out.println(k);
        cnt+=(n/k);
        
        k=k*l;
        if(k<0) break;
      }
      cnt=cnt/map.get(l);
      ans=Math.min(cnt,ans);
    }
      
    out.println(ans);
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

