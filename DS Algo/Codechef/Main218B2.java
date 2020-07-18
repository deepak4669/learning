import java.util.*;
import java.io.*;
//267630EY
public class Main218B2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int minans=0;
    int maxans=0;
    int[] a=new int[m];
    int[] b=new int[m];
    for(int i=0;i<m;i++)
    {
      a[i]=sc.nextInt();
      b[i]=a[i];
    }
    
    Arrays.sort(a);
    Arrays.sort(b);
    int dup=n;
    while(dup>0)
    {
      for(int i=0;i<m;i++)
      {
        if(a[i]>=1)
        {
          minans+=a[i];
          a[i]-=1;
          dup--;
          break;
            
        }
      }
    }
    dup=n;
    int[] tickets=new int[1001];
    for(int i=0;i<m;i++)
    {
      for(int j=b[i];j>=1;j--)
        tickets[j]++;
    }
    for(int i=1000;i>=0&&dup>0;i--)
    {
      if(dup>tickets[i])
      {
        dup-=tickets[i];
        maxans+=i*tickets[i];
        
//        out.println(maxans);
      }
      else
      {
        maxans+=dup*i;
        dup=0;
      }
    }
    out.println(maxans+" "+minans);
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

