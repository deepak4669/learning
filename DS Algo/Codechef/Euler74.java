import java.util.*;
import java.io.*;
//267630EY
public class Euler74
{
  static PrintWriter out=new PrintWriter(System.out);

  static int factorial(int n)
  {
    if(n<=1) return 1;
    else
    {
        int ans=1;
        while(n>0)
        {
            ans=ans*n;
            n--;
        }

        return ans;
    }

  }

  static int recurrence(int n)
  {
    
    Vector<Integer> interm=new Vector<Integer>();
    interm.add(n);
    while(true)
    {
        n=cal(n);
        if(interm.contains(n))
            break;
        else
        {
            interm.add(n);

        }

    }
    return interm.size();


  }
  public static int cal(int n)
  {
    int ans=0;
    while(n>0)
    {
        int x=n%10;
        ans+=factorial(x);
        n/=10;
    }
    return ans;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=1000000;
    int ans=0;
    for(int i=69;i<=n;i++)
    {
        int cycle=recurrence(i);
        if(cycle==60)
        {
            ans++;
            // break;

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

