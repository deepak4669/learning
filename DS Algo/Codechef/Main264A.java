import java.util.*;
import java.io.*;
//267630EY
public class Main264A
{
  static PrintWriter out=new PrintWriter(System.out);
  static class stone implements Comparable<stone>
  {
    double p;
    int id;
    public stone(double p,int id)
    {
      this.p=p;
      this.id=id;
    }
    public int compareTo(stone that)
    {
      if(this.p<that.p) return -1;
      else if(this.p>that.p) return +1;
      else return 0;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    //int n=sc.nextInt();
    String s=sc.next();
    stone[] st=new stone[s.length()];
   
    int ans[]=new int[s.length()];
    int a=0;
    int b=s.length()-1;
    for(int i=0;i<s.length();i++)
    {
     
      if(s.charAt(i)=='l')
      {
        ans[i]=b;
        b--;
      }
      else
      {
        ans[i]=a;
        a++;
      }
      st[i]=new stone(ans[i],i);
    }
    Arrays.sort(st);
 
    for(int i=0;i<s.length();i++)
    {
      out.println((st[i].id+1));
      
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

