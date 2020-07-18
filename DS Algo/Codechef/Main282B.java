import java.util.*;
import java.io.*;

class Main282B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int[] g=new int[n];
    int sa=0;
    int sg=0;
    char[] s=new char[n];
    
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      g[i]=sc.nextInt();
      if(a[i]<=g[i]) {
        s[i]='A';
        sa+=a[i];
      }
      else if(a[i]>g[i]){
        s[i]='G';
        sg+=g[i];
      }
      
    }
    if(Math.abs(sa-sg)<=500)
      out.println(s);
    else
    {
      if(sa>sg)
      {
        for(int i=0;i<n;i++)
        {
          if(s[i]=='A')
          {
            if(sa-a[i]-(sg+g[i])>500)
            {
              sa-=a[i];
              sg+=g[i];
              s[i]='G';
            }
            else if(Math.abs(sa-a[i]-(sg+g[i]))<=500)
            {
              sa-=a[i];
              sg+=g[i];
              s[i]='G';
              break;
            }
            else
            {
              continue;
            }
          }
        }
        if(Math.abs(sa-sg)>500)
          out.println(-1);
        else
          out.println(s);
      }
      else
      {
        for(int i=0;i<n;i++)
        {
        if(s[i]=='G')
        {
            if(sg-g[i]-(sa+a[i])>500)
            {
              sa+=a[i];
              sg-=g[i];
              s[i]='A';
            }
            else if(Math.abs(sa+a[i]-(sg-g[i]))<=500)
            {
              sa+=a[i];
              sg-=g[i];
              s[i]='A';
              break;
            }
            else
            {
              continue;
            }
          }
        }
        if(Math.abs(sa-sg)>500)
          out.println(-1);
        else
          out.println(s);
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

