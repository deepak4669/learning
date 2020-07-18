import java.util.*;
import java.io.*;

public class Main225B
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer> val=new Vector<Integer>();
  static int k;
 
  static int getVal(int j)
  {
    if(j==k) return 1;
    else if(j<k) return 0;
    else return val.elementAt(j-k);
  }
  
      
      
    
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    val.add(1);
    int s=sc.nextInt();
    k=sc.nextInt();
    int[] a=new int[50];
    if(k<32)
    {
      for(int i=0;i<50;i++)
      {
        a[i]=0;
        for(int j=k;j>0;j--)
        {
          a[i]+=getVal(k+1+i-j);
        }
        val.add(a[i]);
        if(a[i]>s) break;
      }
    }
    
    else
    {
      for(int i=0;i<=32;i++)
      {
        a[i]=(int)Math.pow(2,i);
      }
    }
    Arrays.sort(a);
    Vector<Integer> sol=new Vector<Integer>();
    for(int i=a.length-1;i>=0&&s>0;i--)
    {
      if(a[i]>s) continue;
      else {
        sol.add(a[i]);
        s-=a[i];
      }
    }
    if(sol.size()==1)
    {
      sol.add(0);
    }
    out.println(sol.size());
    for(int j:sol)
      out.print(j+" ");
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

