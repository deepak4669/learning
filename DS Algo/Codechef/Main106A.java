import java.util.*;
import java.io.*;

class Main106A
{
  static PrintWriter out=new PrintWriter(System.out);
  static HashMap<Character,Integer> map=new HashMap<Character,Integer>();
  public static void main(String[] args) throws IOException
  {
    map.put('6',6);
    map.put('7',7);
    map.put('8',8);
    map.put('9',9);
    map.put('T',10);
    map.put('J',11);
    map.put('Q',12);
    map.put('K',13);
    map.put('A',14);
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String first=sc.next();
    String second=sc.next();
    String suit1=first.substring(1,2);
    String suit2=second.substring(1,2);
    if(suit1.equals(suit2))
    {
      if(map.get(first.charAt(0))>map.get(second.charAt(0)))
        out.println("YES");
      else
        out.println("NO");
    }
    else if(suit1.equals(s))
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

