import java.util.*;
import java.io.*;

public class Main275B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int n;
  static int m;
  static String[] s;
  
  
  public static boolean[][] copy(boolean[][] marked)
  {
    boolean co[][]=new boolean[n][m];
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
        co[i][j]=marked[i][j];
    }
    return co;
  }
                                
  
      
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    m=sc.nextInt();
    String[] s=new String[n];
    boolean[][] marked=new boolean[n][m];
    for(int i=0;i<n;i++)
      s[i]=sc.next();
    int no=0;
    int lo=-1;
    int ro=-1;
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        if(s[i].charAt(j)=='W')
          marked[i][j]=true;
        else
        {
          if(no==0)
          {
            lo=i;
            ro=j;
          }
          no++;
          marked[i][j]=false;
        }
      }
    }
    if(no<=1)
      out.println("YES");
    else
    {
      
      boolean dup[][]=new boolean[n][m];
      dup=copy(marked);
      boolean flag=true;
      for(int p=0;p<n;p++)
      {
        
        for(int q=0;q<m;q++)
        {
          if(s[p].charAt(q)=='W')
            continue;
          else if(s[p].charAt(q)=='B')
          {
            marked=copy(dup);
            
            for(int i=p;i>=0;i--)
            {
              if(s[i].charAt(q)=='W')
                break;
              else
              {
                for(int j=q;j>=0;j--)
                {
                  if(s[i].charAt(j)=='W') break;
                  else
                  {
                    marked[i][j]=true;
                  }
                }
                for(int j=q;j<m;j++)
                {
                  if(s[i].charAt(j)=='W') break;
                  else
                  {
                    marked[i][j]=true;
                  }
                }
              }
            }
            for(int i=p;i<n;i++)
            {
              if(s[i].charAt(q)=='W')
                break;
              else
              {
                for(int j=q;j>=0;j--)
                {
                  if(s[i].charAt(j)=='W')
                    break;
                  else
                  {
                    marked[i][j]=true;
                  }
                }
                for(int j=q;j<m;j++)
                {
                  if(s[i].charAt(j)=='W')
                    break;
                  else
                  {
                    marked[i][j]=true;
                  }
                }
              }
            }
            for(int i=q;i>=0;i--)
            {
              if(s[p].charAt(i)=='W')
                break;
              else
              {
                for(int j=p;j>=0;j--)
                {
                  if(s[j].charAt(i)=='W')
                    break;
                  else
                    marked[j][i]=true;
                }
                for(int j=p;j<n;j++)
                {
                  if(s[j].charAt(i)=='W')
                    break;
                  else
                    marked[j][i]=true;
                }
              }
            }
            for(int i=q;i<m;i++)
            {
              if(s[p].charAt(i)=='W')
                break;
              else
              {
                for(int j=p;j>=0;j--)
                {
                  if(s[j].charAt(i)=='W')
                    break;
                  else
                    marked[j][i]=true;
                }
                for(int j=p;j<n;j++)
                {
                  if(s[j].charAt(i)=='W')
                    break;
                  else
                    marked[j][i]=true;
                }
              }
            }
            for(int i=0;i<n;i++)
            {
              for(int j=0;j<m;j++)
              {
                if(s[i].charAt(j)=='W')
                  continue;
                else
                {
                  if(!marked[i][j])
                  {
                    flag=false;
                    break;
                  }
                }
                if(!flag)
                  break;
              }
              if(!flag)
                break;
            }
            if(!flag)
              break;
          }
          if(!flag)
            break;
          
        }
        if(!flag)
          break;
      }
      if(!flag)
        out.println("NO");
      else
        out.println("YES");
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

