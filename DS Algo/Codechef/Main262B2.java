import java.util.*;
import java.io.*;
//267630EY
public class Main262B2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int neg=0;
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]<0) neg++;
    }
    if(neg>=k)
    {
      for(int i=0;i<n;i++)
      {
        if(k>0&&a[i]<0)
        {
          a[i]=-1*a[i];
          k--;
        }
      }
      long ans=0;
      for(int i=0;i<n;i++)
        ans+=a[i];
      out.println(ans);
    }
    else
    {
      long ans=0;
      if((k-neg)%2==0)
      {
        
        for(int i=0;i<n;i++)
          ans+=(long)Math.abs(a[i]);
      }
      else
      {
        int id=0;
        for(int i=0;i<n;i++)
        {
          if(k>0&&a[i]<0)
          {
            a[i]=-1*a[i];
            k--;         
          }
        }
        id=min(a);
        a[id]=-1*a[id];
        for(int i=0;i<n;i++)
        {
          ans+=a[i];
        }
        
      }
      out.println(ans);
    }
    out.flush();
        
    
      
    
            
      
      
                
    
  }
  public static int min(int[] a)
  {
    int min=Integer.MAX_VALUE;
    int res=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]<min)
      {
        min=a[i];
        res=i;
      }
    }
    return res;
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

