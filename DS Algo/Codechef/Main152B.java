import java.util.*;
import java.io.*;
//267630EY
public class Main152B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    long xc=sc.nextLong();
    long yc=sc.nextLong();
    
    int k=sc.nextInt();
    long ans=0;
    
    for(int i=0;i<k;i++)
    {
      long dx=sc.nextLong();
      long dy=sc.nextLong();
      if(n>=xc&&m>=yc&&xc>=1&&yc>=1)
      {
        long t=0;
        long r=0;
        if(dx<0)
          t=(long)Math.floor((1-xc)/(double)dx);
        else if(dx>0)
          t=(long)Math.floor((n-xc)/(double)dx);
        else
          t=Integer.MAX_VALUE;
        if(dy>0)
          r=(long)Math.floor((m-yc)/(double)dy);
        else if(dy<0)
          r=(long)Math.floor((1-yc)/(double)dy);
        else
          r=Integer.MAX_VALUE;
        
        
        
        long steps=Math.min(t,r);
//        System.out.println(i+" "+t+" "+r+" "+steps);
        ans+=Math.abs(steps);
        
        xc+=steps*dx;
        yc+=steps*dy;
      }
      
    }
    
    out.println(ans);
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

