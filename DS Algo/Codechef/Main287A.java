import java.util.*;
import java.io.*;
//267630EY
public class Main287A
{
  static PrintWriter out=new PrintWriter(System.out);
  static boolean check(char[][] c)
  {
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
      {
        if(valid(i-1,j-1))
        {
          if(c[i][j]==c[i-1][j-1]&&c[i][j]==c[i-1][j]&&c[i][j]==c[i][j-1])
            return true;
        }
        if(valid(i+1,j+1))
        {
          if(c[i][j]==c[i+1][j+1]&&c[i][j]==c[i+1][j]&&c[i][j]==c[i][j+1])
            return true;
        }
        if(valid(i-1,j+1))
        {
          if(c[i][j]==c[i-1][j+1]&&c[i][j]==c[i][j+1]&&c[i][j]==c[i-1][j])
            return true;
        }
        if(valid(i+1,j-1))
        {
          if(c[i][j]==c[i+1][j-1]&&c[i][j]==c[i+1][j]&&c[i][j]==c[i][j-1])
            return true;
        }
      }
    }
    return false;
  }
  public static boolean valid(int r,int c)
  {
    return 0<=r&&r<=3&&0<=c&&c<=3;
  }
  
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String[] s=new String[4];
    char[][] c=new char[4][4];
    
    
    for(int i=0;i<4;i++)
    {
      s[i]=sc.next();
      c[i]=s[i].toCharArray();
    }
    if(check(c))
      out.println("YES");
    else
    {
      boolean flag=false;
      for(int i=0;i<4;i++)
      {
        for(int j=0;j<4;j++)
        {
          if(c[i][j]=='#')
            c[i][j]='.';
          else
            c[i][j]='#';
          if(check(c))
          {
            flag=true;
            break;
          }
          if(c[i][j]=='#')
            c[i][j]='.';
          else
            c[i][j]='#';
        }
        if(flag) break;
      }
      if(flag) out.println("YES");
      else out.println("NO");
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

