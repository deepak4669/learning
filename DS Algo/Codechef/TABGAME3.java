import java.util.*;
import java.io.*;
public class TABGAME3
{
  static char[][] A;
  static String s,t;
  static int m,n;
  static HashMap<Integer,String> map=new HashMap<Integer,String>();
  static int xmax=0;
  
  public static void main(String[] args) throws IOException
  {
    PrintWriter out=new PrintWriter(System.out);
    Scanner sc=new Scanner(System.in);
    
    int p=sc.nextInt();
    while(p-->0)
    {
      map.clear();
      xmax=0;
      s=sc.next();
      t=sc.next();
      n=t.length();
      assert n>=1;
      m=s.length();
      //System.out.println(s);
      assert m>=1;
      
      A=new char[3][m+1];
      
      int q=sc.nextInt();
      for(int i=0;i<q;i++)
      {
        int x=sc.nextInt();
        int y=sc.nextInt();
        char ans=solve(x,y);
        out.print((ans=='A'?1:0));
      }
      if(q>0)
        out.println();
      out.flush();
    }
  }
  public static char solve(int x,int y)
  {
    if(map.containsKey(x))
      return map.get(x).charAt(y-1);
    String st="";
    
    if(xmax==0)
    {
      for(int i=1;i<=m;i++)
      {
      if(i==1)
      {
        if(s.charAt(0)=='0'||t.charAt(0)=='0')
          A[1][i]='A';
        else
          A[1][i]='B';
        st+=A[1][i];
        
      }
      else
      {
        if(s.charAt(i-1)=='0'||A[1][i-1]=='B')
          A[1][i]='A';
        else
          A[1][i]='B';
        st+=A[1][i];
      }
      }
      map.put(1,st);
      xmax=1;
    }
    
    assert xmax<=x;
    for(int i=xmax+1;i<=x;i++)
    {
      st=new String();
      if(i%2==0)
      {
        for(int j=1;j<=m;j++)
        {
          if(j==1)
          {
            if(t.charAt(i-1)=='0'||A[1][j]=='B')
              A[2][j]='A';
            else
              A[2][j]='B';
            st+=A[2][j];
          }
          else
          {
            if(A[2][j-1]=='B'||A[1][j]=='B')
              A[2][j]='A';
            else
              A[2][j]='B';
            st+=A[2][j];
          }
        }
      }
      else
      {
        for(int j=1;j<=m;j++)
        {
          if(j==1)
          {
            if(t.charAt(i-1)=='0'||A[2][j]=='B')
              A[1][j]='A';
            else
              A[1][j]='B';
            st+=A[1][j];
          }
          else
          {
            if(A[1][j-1]=='B'||A[2][j]=='B')
              A[1][j]='A';
            else
              A[1][j]='B';
            st+=A[1][j];
          }
        }
      }
      
      //for(int i=1;i<=m;i++)
        
      map.put(i,st);
    }
    xmax=x;
    
    if(x%2==0)
      return A[2][y];
    else
      return A[1][y];
    
    //return map.get(x).charAt(y-1);
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
            
           
      
      
      
      