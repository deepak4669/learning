import java.util.*;
import java.io.*;
//267630EY
public class EULER60_1
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean[] prime;
  static Vector<Integer> primes;
  static int N=30000;
  public static void sieve()
  {
    prime=new boolean[N+1];
    Arrays.fill(prime,true);
    prime[0]=false;
    prime[1]=false;
    primes=new Vector<Integer>();
    int m=(int)Math.sqrt(N);
    for(int i=0;i<=m;i++)
    {
      if(prime[i])
      {
        //primes.add(i);
        for(int j=i*i;j<=N;j+=i)
        {
          prime[j]=false;
        }
      }
    }
    for(int i=0;i<=N;i++)
    {
      if(prime[i])
        primes.add(i);
    }
  }
  public static boolean equal(int a,int b,int c,int d,int e)
  {
    if(a==b||a==c||a==d||a==e||b==c||b==d||b==e||c==d||c==e||d==e)
      return true;
    return false;
  }
  public static boolean check(int[] ar)
  {
    for(int i=0;i<ar.length;i++)
    {
      
      for(int j=i+1;j<ar.length;j++)
      {
        //if(i==j) continue;
        int s=Integer.parseInt(ar[i]+""+ar[j]);
        int t=Integer.parseInt(ar[j]+""+ar[i]);
        if((prime[s])&&(prime[t]))
          continue;
        else
          return false;
      }
    }
    return true;
  }
       
        
        
    
    
    
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    sieve();
    //out.println(primes.size());
    //out.flush();
    Vector<Integer> good=new Vector<Integer>();
    int[] prime_count=new int[1000001];
    Vector<Integer> ans=new Vector<Integer>();
     
    for(int j:primes)
    {
      String s=new String();
      s=String.valueOf(j);
      for(int i=1;i<=s.length()-1;i++)
      {
        String x=s.substring(0,i);
        String y=s.substring(i,s.length());
        int x_bar=Integer.parseInt(x);
        int y_bar=Integer.parseInt(y);
        assert Integer.parseInt(x+""+y)==j;
        
        String t=y+""+x;
        int z=Integer.parseInt(t);
        if(prime[x_bar]&&prime[y_bar]&&prime[z])
        {
          //System.out.println(j+" "+z);
          prime_count[x_bar]++;
          prime_count[y_bar]++;
          good.add(j);
          good.add(z);
          if(prime_count[x_bar]>=8&&prime_count[y_bar]>=8)
          {
            if(!ans.contains(x_bar))
              ans.add(x_bar);
            if(!ans.contains(y_bar))
              ans.add(y_bar);
          }
          
        }
      }
    }
    System.out.println(ans.size());
    
    for(int i=0;i<10;i++)
    {
      //if(prime_count[ans.elementAt(i)]>8) continue;
      out.println(ans.elementAt(i)+" "+prime_count[ans.elementAt(i)]);
    }
    int result=0;
    boolean flag=false;
    int cnt=0;
    for(int i=0;i<ans.size();i++)
    {
      for(int j=0;j<ans.size();j++)
      {
        for(int k=0;k<ans.size();k++)
        {
          for(int l=0;l<ans.size();l++)
          {
            for(int m=0;m<ans.size();m++)
            {
              if(equal(i,j,k,l,m))
                continue;
              else
              {
                cnt++;
                //System.out.println("L");
                int[] ar=new int[5];
                ar[0]=ans.elementAt(i);
                ar[1]=ans.elementAt(j);
                ar[2]=ans.elementAt(k);
                ar[3]=ans.elementAt(l);
                ar[4]=ans.elementAt(m);
                if(check(ar))
                {
                  System.out.println("S");
                  result=ar[0]+ar[1]+ar[2]+ar[3]+ar[4];
                  flag=true;
                  break;
                }
              }
            }
            if(flag) break;
          }
          if(flag) break;
        }
        if(flag) break;
      }
      if(flag) break;
    }
    out.println("Result: "+result);
    
    
                    
                   
    out.println(cnt);
        
    //out.println(good.size());
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

