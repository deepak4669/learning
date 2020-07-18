import java.util.*;
import java.io.*;

class Main18A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    int x2=sc.nextInt();
    int y2=sc.nextInt();
    int x3=sc.nextInt();
    int y3=sc.nextInt();
    if(check(x1,y1,x2,y2,x3,y3))
      out.println("RIGHT");
    else
    {
      if(check(x1-1,y1,x2,y2,x3,y3)||check(x1,y1-1,x2,y2,x3,y3)||check(x1,y1,x2-1,y2,x3,y3)||check(x1,y1,x2,y2-1,x3,y3)||
         check(x1,y1,x2,y2,x3-1,y3)||check(x1,y1,x2,y2,x3,y3-1)||check(x1+1,y1,x2,y2,x3,y3)||check(x1,y1+1,x2,y2,x3,y3)||check(x1,y1,x2+1,y2,x3,y3)||check(x1,y1,x2,y2+1,x3,y3)||
         check(x1,y1,x2,y2,x3+1,y3)||check(x1,y1,x2,y2,x3,y3+1))
        out.println("ALMOST");
     
      
      else
        out.println("NEITHER");
    }
     //out.println(check(x1,y1,x2,y2,x3,y3-1)); 
    out.flush();
    
        
    
  }
  static boolean check(int x1,int y1,int x2,int y2,int x3,int y3)
  {
    if(checkSlope(x1,y1,x2,y2,x3,y3)||equal(x1,y1,x2,y2,x3,y3)) return false;
    int d1=(x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
    int d2=(x2-x3)*(x2-x3)+(y2-y3)*(y2-y3);
    int d3=(x1-x3)*(x1-x3)+(y1-y3)*(y1-y3);
    int hyp=Math.max(Math.max(d1,d2),d3);
    return d1+d2+d3-hyp==hyp;
  }
  static boolean equal(int x1,int y1,int x2,int y2,int x3,int y3)
  {
    return (x1==x2)&&(y1==y2)||(x2==x3)&&(y2==y3)||(x1==x3)&&(y1==y3);
  }
  static boolean checkSlope(int x1,int y1, int x2,int y2,int x3,int y3)
  {
    double s1=((double)(y2-y1))/(x2-x1);
    double s2=((double)(y3-y2))/(x3-x2);
    return s1==s2;
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

