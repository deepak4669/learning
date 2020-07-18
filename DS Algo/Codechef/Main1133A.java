import java.util.*;
import java.io.*;
//267630EY
public class Main1133A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    int h1=Integer.parseInt(s.substring(0,2));
    
    int m1=Integer.parseInt(s.substring(3,5));
    int h2=Integer.parseInt(t.substring(0,2));
    int m2=Integer.parseInt(t.substring(3,5));
    if(h1==h2)
    {
      int m3=(m1+m2)/2;
      if(h1<10)
      {
        if(m3<10)
          out.println("0"+h1+":0"+m3);
        else
          out.println("0"+h1+":"+m3);
      }
      else
      {
        if(m3<10)
          out.println(h1+":0"+m3);
        else
          out.println(h1+":"+m3);
      }
    }
    else
    {
      int min=(h2-h1-1)*60+m2+(60-m1);
      min/=2;
      while(min>0)
      {
        while(m1<60&&min>0)
        {
          m1++;
          min--;
        }
        if(min==0)
        {
          if(m1==60)
          {
            m1=0;
            h1++;
          }
          break;
        }
        m1=0;
        h1++;
      }
      if(h1<10)
      {
        if(m1<10)
          out.println("0"+h1+":0"+m1);
        else
          out.println("0"+h1+":"+m1);
      }
      else
      {
        if(m1<10)
          out.println(h1+":0"+m1);
        else
          out.println(h1+":"+m1);
      }
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

