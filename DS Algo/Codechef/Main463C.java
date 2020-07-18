import java.util.*;
import java.io.*;

public class Main463C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] a=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    HashMap<Integer,Integer> left=new HashMap<Integer,Integer>();
    for(int i=n-1;i>=0;i--)
    {
      int sum=0;
      int p=0;
      int q=i;
      while(fill(p,q,n))
      {
        sum+=a[p][q];
        p++;
        q++;
      }
      left.put(i,sum);
    }
    for(int i=n-1;i>=0;i--)
    {
      int sum=0;
      int p=i;
      int q=0;
      while(fill(p,q,n))
      {
        sum+=a[p][q];
        p++;
        q++;
      }
      left.put(i,sum);
    }
    HashMap<Integer,Integer> right=new HashMap<Integer,Integer>();
    for(int i=n-1;i>=0;i--)
    {
      int sum=0;
      int p=0;
      int q=n-1-i;
      while(fill(p,q,n))
      {
        sum+=a[p][q];
        p++;
        q--;
      }
      right.put(i,sum);
    }
    for(int i=0;i<n;i++)
    {
      int sum=0;
      int p=i;
      int q=n-1;
      while(fill(p,q,n))
      {
        sum+=a[p][q];
        p++;
        q--;
      }
      right.put(-i,sum);
    }
    int[][] c=new int[n][n];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        int val=0;
        //if(i<j)
        //{
          val+=left.get(j-i);
          if(n-1-j<i)
          {
            val+=right.get(-(i-(n-1-j)));
          }
          else if(i<n-j)
          {
            val+=right.get(n-1-j+i);
          }
          else
            val+=right.get(0);
        //}
        //else if(i>=j)
        //{
          //val+=left.get(-(i-j));
          c[i][j]=val;
      }
    }
    for(int i
          
          
          
                            

        
    
    
      
    
    
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

