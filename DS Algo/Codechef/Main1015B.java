import java.util.*;
import java.io.*;

public class Main1015B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    String t=sc.next();
    char[] sa=s.toCharArray();
    char[] ta=t.toCharArray();
    int moves=0;
    Vector<Integer> move=new Vector<Integer>();
    while(!s.equals(t))
    {
      if(moves>10000)
        break;
      for(int i=0;i<n;i++)
      {
        if(sa[i]!=ta[i])
        {
          if(i==n-1)
          {
            char temp=sa[i-1];
            sa[i-1]=sa[i];
            sa[i]=temp;
            move.add(i);
            moves++;
          }
          else{ 
          char temp=sa[i];
          sa[i]=sa[i+1];
          sa[i+1]=temp;
          move.add(i+1);
          moves++;
          }
        }
      }
      s=new String(sa);
    }
    if(s.equals(t))
    {
      out.println(moves);
      for(int i: move)
      {
        out.print(i+" ");
      }
    }
    else
      out.println(-1);
    out.println(s);
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

