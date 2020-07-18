import java.util.*;
import java.io.*;

class MAXEP
{
  static PrintWriter out=new PrintWriter(System.out);
  static int coins;
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=sc.nextInt();
    
    coins=1000;
    int mid=1;
    int hi=n;
    int lo=1;
    if(hi-lo<=1000)
    {
      while(coins>0)
      {
        out.println("1 "+lo);
        out.flush();
        coins--;
        int a=sc.nextInt();
        if(a==0)
          lo++;
        else
        {
          if(coins>=c)
          {
            out.println("2");
            out.flush();
          }
          
          break;
        }
        
      }
      out.println("3 "+lo);
      out.flush();
    }
    else
    {
      boolean flag=true;
      while(hi>lo&&coins>0&&flag)
      {
        if(hi-lo<=coins||(hi+lo)/2<c)
        {
          while(coins>0)
          {
            out.println("1 "+lo);
            out.flush();
            coins--;
            int b=sc.nextInt();
            if(b==0)
              lo++;
            else
            {
              if(coins>=c)
              {
                out.println("2");
                out.flush();
              }
              break;
            }
        
          }
          flag=false;
        }
        
        
        else
        {
          
          mid=lo+(hi-lo+1)/2;
          out.println("1 "+mid);
          out.flush();
          coins-=1;
          int a=sc.nextInt();
          if(a==1)
          {
            hi=mid;            
            if(coins<c) break;
            out.println("2");
            out.flush();
            coins-=c;
          }
          else
          {
            lo=mid+1;
          }
          
          
        }
        
      }
      out.println("3 "+lo);
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

