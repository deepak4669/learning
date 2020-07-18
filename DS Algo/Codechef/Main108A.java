import java.util.*;
import java.io.*;

class Main108A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int x=Integer.parseInt(s.substring(0,2));
    int y=Integer.parseInt(s.substring(3,5));
    boolean flag=false;
    String ans="";
    for(int i=x;i<=23;i++)
    {
      
      
      int j=0;
      if(i==x)
      {
        j=y+1;
      }
      else
        j=0;
          
        
      for(;j<=59;j++)
      {
        String t=new String();
        if(i/10==0)
        {
          t+="0"+i+":";
        }
        else
        {
          t+=i+":";
        }
        if(j/10==0)
        {
          t+="0"+j;
        }
        else
        {
          t+=j;
        }
        if(palin(t))
        {
          ans+=t;
          flag=true;
          break;
        }
        
          
      }
      if(flag) break;
    }
    if(!flag)
    {
      for(int i=0;i<=x;i++)
      {
        String t=new String();
        for(int j=0;j<=59;j++)
        {
          if(i/10==0)
          {
          t+="0"+i+":";
          }
          else
          {
            t+=i+":";
          }
          if(j/10==0)
          {
            t+="0"+j;
          }
          else
          {
            t+=j;
          }
          if(palin(t))
          {
            ans+=t;
            flag=true;
            break;
          }
        }
        if(flag) break;
      }
      
    }
    out.println(ans);
    out.flush();
          
      
        
    
  }
  public static boolean palin(String s)
  {
    String t="";
    for(int i=s.length()-1;i>=0;i--)
    {
      t+=s.charAt(i);
    }
    return t.equals(s);
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

