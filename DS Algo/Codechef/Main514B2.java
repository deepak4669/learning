import java.util.*;
import java.io.*;
//267630EY
public class Main514B2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static int gcd(int a,int b)
  {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
  static class pair
  {
    int a;
    int b;
    public pair(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
  }
  public static boolean find(Vector<pair> slopes,pair slope)
  {
    for(int i=0;i<slopes.size();i++)
    {
      if(slope.a==0&&slopes.elementAt(i).a==0)
        return true;
      else if(slope.b==0&&slopes.elementAt(i).b==0)
        return true;
      else
        if(slope.a==slopes.elementAt(i).a&&slope.b==slopes.elementAt(i).b)
        return true;
    }
    return false;
  }
        
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int xo=sc.nextInt();
    int yo=sc.nextInt();
    Vector<pair> slopes=new Vector<pair>();
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      int a=x-xo;
      int b=y-yo;
      int c=gcd((x-xo),(y-yo));
      a/=c;
      b/=c;
//      out.println(a+" "+b);
      pair slope=new pair(a,b);
      if(!find(slopes,slope))
        slopes.add(slope);
    }
    out.println(slopes.size());
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

