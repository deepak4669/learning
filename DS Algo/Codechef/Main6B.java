import java.util.*;
import java.io.*;
//267630EY
public class Main6B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int n;
  static int m;
  
  public static boolean valid(int x,int y)
  {
    return 0<=x&&x<=n-1&&0<=y&&y<=m-1;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    char c=sc.nextChar();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
    }
    Vector<Character> v=new Vector<Character>();
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(s[i].charAt(j)==c)
        {
          if(valid(i,j-1)&&s[i].charAt(j-1)!=c&&s[i].charAt(j-1)!='.')
          {
            if(!v.contains(s[i].charAt(j-1)))
              v.add(s[i].charAt(j-1));
          }
          if(valid(i,j+1)&&s[i].charAt(j+1)!=c&&s[i].charAt(j+1)!='.')
          {
            if(!v.contains(s[i].charAt(j+1)))
              v.add(s[i].charAt(j+1));
          }
          if(valid(i-1,j)&&s[i-1].charAt(j)!=c&&s[i-1].charAt(j)!='.')
          {
            if(!v.contains(s[i-1].charAt(j)))
              v.add(s[i-1].charAt(j));
          }
          if(valid(i+1,j)&&s[i+1].charAt(j)!=c&&s[i+1].charAt(j)!='.')
          {
            if(!v.contains(s[i+1].charAt(j)))
              v.add(s[i+1].charAt(j));
          }
        }
      }
    }
    out.println(v.size());
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
