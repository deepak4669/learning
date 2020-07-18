import java.util.*;
import java.io.*;

public class Main1102D
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    char[] sa=s.toCharArray();
    int zero=0;
    int one=0;
    int two=0;
    for(int i=0;i<n;i++)
    {
      if(s.charAt(i)=='0')
        zero++;
      else if(s.charAt(i)=='1')
        one++;
      else
        two++;
    }
    if(one==n/3&&two==n/3&&zero==n/3)
      out.println(s);
    else
    {
      if(two>n/3)
      {
        
        for(int i=0;i<n&&(one<n/3||zero<n/3)&&two>n/3;i++)
        {
          if(s.charAt(i)=='2')
          {
            if(zero<n/3)
            {
              sa[i]='0';
              zero++;
              two--;
            }
            else if(one<n/3)
            {
              sa[i]='1';
              one++;
              two--;
            }
          }
        }
      }
      if(one>n/3)
      {
        if(zero<n/3)
        {
          for(int i=0;i<n&&(zero<n/3||two<n/3)&&one>n/3;i++)
          {
          if(s.charAt(i)=='1')
          {
            if(zero<n/3)
            {
              sa[i]='0';
              zero++;
              one--;
            }
            else if(two<n/3)
            {
              sa[i]='2';
              two++;
              one--;
              
            }
          }
        }
        }
        else
        {
          for(int i=n-1;i>=0&&(zero<n/3||two<n/3)&&one>n/3;i--)
          {
          if(s.charAt(i)=='1')
          {
            if(zero<n/3)
            {
              sa[i]='0';
              zero++;
              one--;
            }
            else if(two<n/3)
            {
              sa[i]='2';
              two++;
              one--;
              
            }
          }
        }
        }
          
      }
       if(zero>n/3)
      {
        
        for(int i=n-1;i>=0&&(one<n/3||two<n/3)&&zero>n/3;i--)
        {
          if(s.charAt(i)=='0')
          {
            if(two<n/3)
            {
              sa[i]='2';
              two++;
              zero--;
            }
            else if(one<n/3)
            {
              sa[i]='1';
              one++;
              zero--;
              
            }
          }
        }
      }
       out.println(sa);
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

