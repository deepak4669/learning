import java.util.*;
import java.io.*;
//267630EY
public class MainCM2
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean isprime(int n)
  {
    if(n<=1) return false;
    if(n==2) return true;
    for(int i=2;i<=Math.sqrt(n);i++)
    {
      if(n%i==0)
        return false;
    }
    return true;
  }
      
    
  //static Vector<Integer> primes;
  static boolean prime[];
  static int n=30000001;
  static void sieve()
  {
    prime=new boolean[n];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    //primes=new Vector<Integer>();
    int m=(int)Math.sqrt(n);
    for(int i=1;i<=m;i++)
    {
      if(prime[i])
      {
        //primes.add(i);
        for(int j=i*i;j<=n;j+=i)
        
          prime[j]=false;
          
      }
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    sieve();
    int N=sc.nextInt();
    long ans=1;
    long f=1000000007;
    for(int j=2;j<=N;j++)
    {
      if(prime[j])
      {
      int power=0;
     // System.out.println(j);
      long k=j;
      if(k<=N)
      {
        while(k<=N)
        {
          int x=(int)(N/k);
          power+=x;
          
          //System.out.println(x+" "+k);
          k*=j;
        }
        ans=(((ans)%f)*((power+1)))%f;
        
      }
      }
      
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

