import java.util.*;
import java.io.*;

public class Main218B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=sc.nextIntArray(m);
    int[] tickets=new int[1001];
    int min=0;
    int max=0;
    Arrays.sort(a);
    int x=n;
    int i=0;
    while(x>0&&i<m)
    {
      if(x>a[i])
      {
        x-=a[i];
        min+=((a[i])*(a[i]+1))/2;
      }
      else
      {
       
        min+=((a[i]*(a[i]+1))/2-((a[i]-x)*(a[i]-x+1))/2);
        x=0;
      }
      i++;
      
    }
    x=n;
    
    for(i=0;i<m;i++)
    {
      for(int j=a[i];j>=1;j--)
        tickets[j]++;
    }
    for(int j=1000;j>=0&&x>0;j--)
    {
      if(x>tickets[j])
      {
        x-=tickets[j];
        max+=j*tickets[j];
        //out.println(max);
      }
      else
      {
        
        max+=x*j;
        x=0;
      }
    }
    out.println(max+" "+min);
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

