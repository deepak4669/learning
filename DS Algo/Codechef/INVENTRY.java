import java.util.*;
import java.io.*;

class INVENTRY
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      String st=sc.next();
      StringBuilder s=new StringBuilder(st);
      int lo=0;
      boolean cont=true;
      boolean flag=true;
      int ans=0;
      for(int i=0;i<n;i++)
      {
        if(s.charAt(i)=='#'&&cont)
          lo++;
        else if(s.charAt(i)=='.')
        {
          cont=false;
          continue;
        }
        else if(!cont)
        {
          if((i+1)<n&&s.charAt(i+1)=='.')
          {
            ans+=(i-lo);
            lo++;
          }
          else if((i+1)<n&&s.charAt(i+1)=='#')
          {
            int j=i;
            while(j<n&&charAt(j)=='#') j++;
            if()
            ans+=(1+(i-lo+1));
            lo++;
            s.setCharAt(i+1,'.');
            s.setCharAt(i+2,'#');
          }
          else
          {
            flag=false;
            break;
          }
        }
      }
      if(!flag)
        out.println(-1);
      else
        out.println(ans);
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

