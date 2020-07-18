import java.util.*;
import java.io.*;

class Main279A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int xbar=0;
    int ybar=0;
    int t=1;
    int cnt=0;
    char ch='R';
    if(x==0&&y==0||x==1&&y==0)
    {
      out.println(0);
    }
    else{
    while(true)
    {
      //out.println(xbar+" "+ybar+" "+t+" "+ch);
      //if(t>3) break;
      if(ch=='R')
      {
        if(t>1) cnt++;
        if(xbar+t>=x&&x>=xbar&&ybar==y)
          break;
        xbar=xbar+t;
        //ybar=ybar;
        ch='T';
        
      }
      else if(ch=='T')
      {
        cnt++;
        if(ybar+t>=y&&ybar<=y&&xbar==x)
          break;
        //xbar=xbar;
        ybar=ybar+t;
        ch='L';
        
        t+=1;
      }
      else if(ch=='L')
      {
        cnt++;
        if(xbar-t<=x&&x<=xbar&&ybar==y)
          break;
        xbar=xbar-t;
        //ybar=ybar;
        ch='B';
        
      }
      else if(ch=='B')
      {
        cnt++;
        //out.println(xbar+" "+ybar+" "+t);
        if(xbar==x&&ybar-t<=y&&y<=ybar)
          break;
        //xbar=xbar;
        ybar=ybar-t;
        ch='R';
        t+=1;
        
      }
    }
    out.println(cnt);
    
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

