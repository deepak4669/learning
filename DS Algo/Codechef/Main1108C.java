import java.util.*;
import java.io.*;

public class Main1108C
{
  static PrintWriter out=new PrintWriter(System.out);
  static long change(char[] ch,char[] id)
  {
    long cnt=0;
    for(int i=0;i<ch.length;i++)
    {
      if(ch[i]!=id[i])
        cnt++;
    }
    return cnt;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    char[] ch=s.toCharArray();
    char[][] id=new char[6][n];
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[0][i]='R';
      else if(i%3==1)
        id[0][i]='G';
      else if(i%3==2)
        id[0][i]='B';
    }
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[1][i]='R';
      else if(i%3==1)
        id[1][i]='B';
      else if(i%3==2)
        id[1][i]='G';
    }
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[2][i]='B';
      else if(i%3==1)
        id[2][i]='R';
      else if(i%3==2)
        id[2][i]='G';
    }
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[3][i]='B';
      else if(i%3==1)
        id[3][i]='G';
      else if(i%3==2)
        id[3][i]='R';
    }
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[4][i]='G';
      else if(i%3==1)
        id[4][i]='R';
      else if(i%3==2)
        id[4][i]='B';
    }
    for(int i=0;i<n;i++)
    {
      if(i%3==0)
        id[5][i]='G';
      else if(i%3==1)
        id[5][i]='B';
      else if(i%3==2)
        id[5][i]='R';
    }
    long cnt=10000000;
    int p=0;
    for(int i=0;i<6;i++)
    {
      long x=change(id[i],ch);
      if(x<cnt)
      {
        cnt=x;
        p=i;
      }
    }
      
      
    
    
        
    out.println(cnt);
    out.println(id[p]);
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

