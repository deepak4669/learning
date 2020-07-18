import java.util.*;
import java.io.*;
//267630EY
public class Main47B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String[] s=new String[3];
    s[0]=sc.next();
    s[1]=sc.next();
    s[2]=sc.next();
    //String ans="123";
    int a=0;
    int b=0;
    int c=0;
    for(int i=0;i<3;i++){
      if(s[i].charAt(1)=='>')
      {
        if(s[i].charAt(0)=='A')
        {
          a++;
        }
        if(s[i].charAt(0)=='B')
          b++;
        if(s[i].charAt(0)=='C')
          c++;
      }
      else
      {
        if(s[i].charAt(2)=='A')
        {
          a++;
        }
        if(s[i].charAt(2)=='B')
          b++;
        if(s[i].charAt(2)=='C')
          c++;
      }
    }
    if(a==b||a==c||b==c)
      out.println("Impossible");
    else
    {
      if(Math.max(a,Math.max(b,c))==a)
      {
        if(Math.max(b,c)==b)
          out.println("CBA");
        else
          out.println("BCA");
      }
      if(Math.max(b,Math.max(a,c))==b)
      {
        if(Math.max(a,c)==a)
          out.println("CAB");
        else
          out.println("ACB");
      }
      if(Math.max(c,Math.max(a,b))==c)
      {
        if(Math.max(a,b)==a)
          out.println("BAC");
        else
          out.println("ABC");
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

