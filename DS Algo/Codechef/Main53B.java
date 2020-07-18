import java.util.*;
import java.io.*;

public class Main53B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int ansW=0;
  static int ansH=0;
  static void solve(int h,int w)
  {
    int[] pow=new int[31];
    int k=0;
    int x=1;
    while(x<=h)
    {
      pow[k++]=x;
      //System.out.println(x);
      x=(int)Math.pow(2,k);
    }
    Arrays.sort(pow);
    
    for(int i=30;i>=0;i--)
    {
      int val=(int)Math.floor((double)pow[i]/0.8);
      //System.out.println("S");
      if(val<=w)
      {
        ansW=val;
        ansH=pow[i];
        break;
      }
      else if(val>w)
      {
        int p=(int)Math.ceil(pow[i]/1.25);
        if(p<=w)
        {
          ansW=w;
          ansH=pow[i];
          break;
        }
      }
     
            
          
    }
    if(h>=ansH&&w>=ansH)
    {
      int temp=ansH;
      ansH=ansW;
      ansW=temp;
     }
     out.println(ansH+" "+ansW);
      
    
  }
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    solve(h,w);
    long H1=ansH;
    long W1=ansW;
    solve(w,h);
    long H2=ansH;
    long W2=ansW;
    long H=H1;long W=W1;
    if(H1*W1>H2*W2&&H1<=h&&W1<=w)
    {
      H=H1;
      W=W1;
    }
    else if(H1*W1<H2*W2&&H2<=h&&W2<=w)
    {
      H=H2;
      W=W2;
    }
    else
    {
      if(H1>H2&&H1<=h&&W1<=w)
      {
        H=H1;
        W=W1;
      }
      else if(H1<H2&&H2<=h&&W2<=w)
      {
        H=H2;
        W=W2;
      }
      else
      {
        H=H1;
        W=W1;
      }
    }
        
        
    
      
    //out.println(H1+" "+W1);
    out.println(H+" "+W);
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

