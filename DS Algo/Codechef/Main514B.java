import java.util.*;
import java.io.*;

class Main514B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int gcd(int a,int b)
  {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
  static class set
  {
    int a;
    int b;
    public set(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public boolean equals(set that)
    {
      if(this.a==that.a&&this.b==that.b)
        return true;
      else return false;
    }
  }
        
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    Vector<set> vec=new Vector<set>();
    int inf=0;
    int ho=0;
    
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      int den=x-a;
      int num=y-b;
      if(den==0)
        inf=1;
      else if(num==0)
        ho=1;
      else
      {
        int c=gcd(den,num);
        den/=c;
        num/=c;
        //out.println(den+" "+num);
        set v=new set(den,num);
        
        boolean flag=true;
        for(set h:vec)
        {
          if(h.equals(v))
          {
            flag=false;
            break;
          }
        }
        if(!flag)
          continue;
        else
        {
          //out.println("D");
          vec.add(v);
        }
      }
      
     
    }
    out.println(vec.size()+inf+ho);
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

