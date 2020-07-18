import java.util.*;
import java.io.*;

public class Main339C
{
  static PrintWriter out=new PrintWriter(System.out);
  static int m;
  static String s;
  static Vector<Integer> v;
  
  static boolean dfs(int x,int y,int k)
  {
    if(k>m) return true;
    else
    {
      boolean p=false;
      for(int i=0;i<10;i++)
      {
        if(s.charAt(i)=='1'&&x>0&&(x-(i+1))<0&&(i+1)!=y)
          p=dfs(x-(i+1),i+1,k+1);
        else if(s.charAt(i)=='1'&&x<=0&&(x+(i+1))>0&&(i+1)!=y)
          p=dfs(x+i+1,i+1,k+1);
        if(p)
        {
          v.add(i+1);
          return true;
        }
      }
      return false;
      
    }
  }
          
  
  
  public static void main(String[] args) throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    s=sc.nextLine();
    m=sc.nextInt();
    v=new Vector<Integer>();
    if(dfs(0,0,1))
    {
      out.println("YES");
      for(int i=v.size()-1;i>=0;i--)
        out.print(v.elementAt(i)+" ");
    }
    else
      out.println("NO");
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

