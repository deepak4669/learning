import java.util.*;
import java.io.*;
//267630EY
public class Main377A
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean[][] marked;
  static String[] s;
  static int n;
  static int m;
  static boolean valid(int x,int y)
  {
    return 0<=x&&x<n&&y>=0&&y<m;
  }
  static class pair
  {
    int a;
    int b;
    public pair(int x,int y)
    {
      this.a=x;
      this.b=y;
    }
  }
  static int mk=0;
  static Vector<pair> sol;
  static void dfs(int ro,int lo,int th)
  {
    if((mk!=th))
    {
      
      mk++;
    }
    else
      sol.add(new pair(ro,lo));
    marked[ro][lo]=true;
    
   
    Vector<pair> v=new Vector<pair>();
    if(valid(ro-1,lo)&&s[ro-1].charAt(lo)=='.')
      v.add(new pair(ro-1,lo));
    if(valid(ro+1,lo)&&s[ro+1].charAt(lo)=='.')
      v.add(new pair(ro+1,lo));
    if(valid(ro,lo-1)&&s[ro].charAt(lo-1)=='.')
      v.add(new pair(ro,lo-1));
    if(valid(ro,lo+1)&&s[ro].charAt(lo+1)=='.')
      v.add(new pair(ro,lo+1));

    for(pair g:v)
    {
     
      if(!marked[g.a][g.b])
        dfs(g.a,g.b,th);
      
    }
    
  }
 
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    sol=new Vector<pair>();
    int k=sc.nextInt();
    s=new String[n];
    marked=new boolean[n][m];
    
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    int op=0;
    int ro=0;
    int co=0;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<s[i].length();j++)
      {
        marked[i][j]=false;
        if(s[i].charAt(j)=='.')
        {
          ro=i;
          co=j;
          
          op++;
        }
      }
    }
   dfs(ro,co,op-k);
   char[][] ans=new char[n][m];
   for(int i=0;i<n;i++)
   {
     ans[i]=s[i].toCharArray();
   }
    for(pair g:sol)
    {
      ans[g.a][g.b]='X';
    }
    
      
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<m;j++)
       out.print(ans[i][j]);
     out.println();
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
