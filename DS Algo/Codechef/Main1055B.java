import java.util.*;
import java.io.*;

class Main1055B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int l=sc.nextInt();
    long[] a=new long[n+1];
    for(int i=1;i<=n;i++)
    {
      a[i]=sc.nextLong();
    }
    int cnt=0;
    boolean flag=true;
    for(int i=1;i<=n;i++)
    {
      if(a[i]>l)
      {
        if(flag)
        {
          cnt++;
          flag=false;
        }
      }
      else
      {
        if(!flag)
          flag=true;
      }
    }
        
    
    for(int i=0;i<m;i++)
    {
      int t=sc.nextInt();
      if(t==0)
      {
        out.println(cnt);
      }
      else if(t==1)
      {
        int p=sc.nextInt();
        int d=sc.nextInt();
        long prev=a[p];
        a[p]+=d;
        if(a[p]<=l)
          cnt=cnt;
        else if(prev>l&&a[p]>l)
          cnt=cnt;
        else if(prev<=l&&a[p]>l)
        {
          //out.println("g");
          if((p-1==0&&p+1<=n&&a[p+1]<=l)||(p-1>0&&a[p-1]<=l&&p+1>n)||(p-1>0&&p+1<=n&&a[p-1]<=l&&a[p+1]<=l))
          {
            //out.println("g");
            
            cnt++;
          }
          else if(p-1>0&&a[p-1]>l&&(p+1)<=n&&a[p+1]>l)
            cnt--;
          else if(n==1)
            cnt++;
         
          
        }
      }
      out.flush();
    }
    //out.flush();
          
        
        
    
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

