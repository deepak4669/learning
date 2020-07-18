import java.util.*;
import java.io.*;

public class Main216B
{
  static PrintWriter out=new PrintWriter(System.out);
  //Union Find
  static class UF
  {
    int[] id;
    int[] sz;
    public UF(int n)
    {
      id=new int[n];
      sz=new int[n];
      Arrays.fill(sz,1);
      for(int i=0;i<n;i++)
        id[i]=i;
    }
    public int find(int p)
    {
      if(p!=id[p])
        p=find(id[p]);
      return p;
    }
    public void union(int p,int q)
    {
      int i=find(p);
      int j=find(q);
      if(sz[i]>sz[j]){ id[j]=i; sz[i]+=sz[j];}
      else if(sz[i]<=sz[j]){ id[i]=j; sz[j]+=sz[i];}
    }
  }
        
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    UF uf=new UF(n);
    int m=sc.nextInt();
    int ans=0;
    for(int i=0;i<m;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x-=1;
      y-=1;
      int p=uf.find(x);
      int q=uf.find(y);
      if(p==q)
      {
        if(uf.sz[q]%2!=0)//Odd Cycles
          ans+=1;
      }
      else uf.union(p,q);
    }
    if((n-ans)%2!=0)
      ans++;
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

