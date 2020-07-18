import java.util.*;
import java.io.*;
//267630EY
public class Main371C
{
  static PrintWriter out=new PrintWriter(System.out);
  static long f(long v,int rb,int nb,int pb,int rc,int nc,int pc,int rs,int ns,int ps)
  {
    long fv=Math.max(0,rb*v-nb)*pb+Math.max(0,rc*v-nc)*pc+Math.max(0,rs*v-ns)*ps;
    return fv;
  }
    
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int nb=sc.nextInt();
    int ns=sc.nextInt();
    int nc=sc.nextInt();
    int pb=sc.nextInt();
    int ps=sc.nextInt();
    int pc=sc.nextInt();
    long r=sc.nextLong();
    long cnt=0;
    int rb=0;
    int rs=0;
    int rc=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='B')
        rb++;
      else if(s.charAt(i)=='S')
        rs++;
      else 
        rc++;
    }
    String st="1000000000000000";
    long hi=Long.parseLong(st);
    long lo=0;
    while(lo<hi)
    {
      long mid=(lo+hi+1)/2;
      if(f(mid,rb,nb,pb,rc,nc,pc,rs,ns,ps)-r>0)
      {
        hi=mid-1;
        
      }
      else //(f(mid,rb,nb,pb,rc,nc,pc,rs,ns,ps)-r<0)
      {
        lo=mid;
      }
      
    }
    //out.println(f(382,rb,nb,pb,rc,nc,pc,rs,ns,ps));
    out.println(lo);
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

