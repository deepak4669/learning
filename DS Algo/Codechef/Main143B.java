import java.util.*;
import java.io.*;

class Main143B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String ans="";
    boolean bracket=false;
    boolean dot=false;
    int m=0;
    int dotp=0;
    int i=0;
    for(i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='.')
      {
        dotp=i;
        m=s.length()-i-1;
        dot=true;
        break;
      }
    }
      
    if(s.charAt(0)=='-')
    {
      bracket=true;
      ans="(";
    }
    ans+="$";
    if(bracket)
      i-=1;
    int x=i%3;
    int k=i/3;
    if(x==0)
    {
      x=3;
      k=k-1;
    }
    if(bracket) {
      ans+=s.substring(1,x+1);
      x+=1;
    }
    else
      ans+=s.substring(0,x);
    for(int j=0;j<k;j++)
    {
      ans+=",";
      ans+=s.substring(x,x+3);
      x+=3;
    }
    
    if(!dot)
    {
      ans+=".00";
    }
    else
    {
      ans+=".";
      if(m>1)
        ans+=s.substring(dotp+1,dotp+3);
      else
      {
        ans+=s.substring(dotp+1,dotp+2);
        ans+="0";
      }
    }
    if(bracket) ans+=")";
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

