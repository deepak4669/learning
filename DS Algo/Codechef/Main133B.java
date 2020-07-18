import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main133B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    HashMap<String,String> map=new HashMap<String,String>();
    map.put(">","1000");
    map.put("<","1001");
    map.put("+","1010");
    map.put("-","1011");
    map.put(".","1100");
    map.put(",","1101");
    map.put("[","1110");
    map.put("]","1111");
    int n=1000003;
    
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String t="";
    for(int i=0;i<s.length();i++)
    {
      t+=map.get(s.substring(i,i+1));
    }
    BigInteger sum=new BigInteger("0");
    int k=t.length()-1;
    for(int i=0;i<t.length();i++)
    {
      if(t.charAt(k)=='1')
      {
        BigInteger tw=new BigInteger("2");
        sum=sum.add(tw.pow(i));
        //out.println(sum);
      }
      k--;
    }
    //sum=sum%n;
    out.println(sum.mod(BigInteger.valueOf(n)));
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

