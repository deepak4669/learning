import java.util.*;
import java.io.*;

class Main1055D
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] w=new String[n];
    for(int i=0;i<n;i++)
      w[i]=sc.next();
    String[] t=new String[n];
    for(int i=0;i<n;i++)
      t[i]=sc.next();
    if(n==1)
    {
      out.println("YES");
      out.println(w[0]);
      out.println(t[0]);
    }
    else
    {
        if(!w[0].equals(t[0]))
        {
          int j=0;
          for(j=0;j<w[0].length();j++)
          {
            if(w[0].charAt(j)!=t[0].charAt(j))
              break;
          }
          
          int k=0;
          for(k=w[0].length()-1;k>=j;k--)
          {
            if(w[0].charAt(k)!=t[0].charAt(k))
              break;
          }
          String s=w[0].substring(j,k+1);
          String t_p=t[0].substring(j,k+1);
          //out.println(j);
          //out.println(k);
            
          boolean flag=true;
          for(int i=0;i<n;i++){
            String w_n=w[i].substring(0,j)+t_p+w[i].substring(k+1,w[i].length());
            if(!w_n.equals(t[i]))
            {
              flag=false;
              break;
            }
          }
          if(flag)
          {
            out.println(s);
            out.println(t_p);
          }
          else
          {
            out.println("NO");
          }
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

