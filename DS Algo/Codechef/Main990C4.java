import java.util.*;
import java.io.*;

class Main990C4
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] cnt=new int[1000001];
  public static void main(String[] args) throws IOException
  {
    cnt=new int[1000001];
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
    }
    for(int i=0;i<n;i++)
    {
      int bal=getBalance(s[i]);
      if(bal!=-1)
        ++cnt[bal];
    }
    long res=0;
    for(int i=0;i<n;i++)
    {
      String t=reverse(s[i]);
      //System.out.println(t);
      
      int bal=getBalance(t);
      //System.out.println(bal);
      if(bal!=-1)
        res+=cnt[bal];
    }
    //System.out.println();
    out.println(res);
    out.flush();
        
    
  }
   public static int getBalance(String s)
  {
    int bal=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='(')
        ++bal;
      else //if(s.charAt(i)==')')
        --bal;
      if(bal<0)
        return -1;
    }
    return bal;
  }
  public static String reverse(String s)
  {
    
    //String t=new StringBuilder(s).reverse().toString();
    StringBuilder rev=new StringBuilder();
    
    
    for(int i=s.length()-1;i>=0;i--)
    {
      if(s.charAt(i)=='(')
        rev.append(")");
      else
        rev.append("(");
    }
    return rev.toString();
  }
  public static String rev(String s)
  {
    String ans="";
    for(int i=s.length()-1;i>=0;i--)
    {
      ans+=s.charAt(i);
    }
    return ans;
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

