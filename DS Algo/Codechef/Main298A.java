import java.util.*;
import java.io.*;
//267630EY
public class Main298A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String st=sc.next();
    char[] c=st.toCharArray();
    int s=-1;
    int t=-1;
    boolean R=false;
    boolean L=false;
    
    
    
    for(int i=0;i<n;i++)
    {
      if(c[i]!='.')
      {
        if(c[i]=='R')
        {
          R=true;
          s=i+1;
        }
        if(c[i]=='L')
        {
          L=true;
          t=i;
        }
        break;
      }
    }
    if(R)
    {
      t=s+1;
      for(int i=s;i<n;i++)
      {
        if(c[i]=='.')
          break;
        else if(c[i]=='L')
        {
          t--;
          break;
        }
        else
          t++;
      }
      out.println(s+" "+t);
    }
    else
    {
      s=t+1;
      for(int i=s;i<n;i++)
      {
        if(c[i]=='.')
          break;
        else if(c[i]=='L')
        {
          s++;
          continue;
        }
      }
      out.println(s+" "+t);
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

