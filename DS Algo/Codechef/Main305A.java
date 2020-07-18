import java.util.*;
import java.io.*;

class Main305A
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] cnt=new int[5];
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      if(a==0)
      {
        cnt[0]=1;
        continue;
      }
      if(a==100)
      {
        cnt[1]=1;
        continue;
      }
      if(a%10==0)
      {
        cnt[2]=a;
        continue;
      }
      if(a<10)
      {
        cnt[3]=a;
        continue;
      }
      cnt[4]=a;
    }
    Vector<Integer> ans=new Vector<Integer>();
    if(cnt[0]==1) ans.add(0);
    if(cnt[1]==1) ans.add(100);
    if(cnt[2]>0) ans.add(cnt[2]);
    if(cnt[3]>0) ans.add(cnt[3]);
    if(cnt[2]==0&&cnt[3]==0&&cnt[4]>0) ans.add(cnt[4]);
    out.println(ans.size());
    for(int w:ans)
      out.print(w+" ");
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

