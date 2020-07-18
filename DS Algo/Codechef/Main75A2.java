import java.util.*;
import java.io.*;
//267630EY
public class Main75A2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.next();
    String b=sc.next();
    String s_a="";
    String s_b="";
    for(int i=0;i<a.length();i++)
    {
      if(a.charAt(i)!='0')
        s_a+=a.substring(i,i+1)+"";
    }
    for(int i=0;i<b.length();i++)
    {
      if(b.charAt(i)!='0')
        s_b+=b.substring(i,i+1)+"";
    }
    int c_a=Integer.parseInt(s_a);
    int c_b=Integer.parseInt(s_b);
    int o_a=Integer.parseInt(a);
    int o_b=Integer.parseInt(b);
    String c=(o_a+o_b)+"";
    String s_c="";
    for(int i=0;i<c.length();i++)
    {
      if(c.charAt(i)!='0')
        s_c+=c.substring(i,i+1)+"";
    }
    if(c_a+c_b==Integer.parseInt(s_c))
      out.println("YES");
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

