import java.util.*;
import java.io.*;

public class Main320B
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Integer> graph[];
  static boolean marked[]=new boolean[101];
  //DFS
  static void dfs(int s)
  {
    marked[s]=true;
    for(int w:graph[s])
    {
      if(!marked[w])
      {
        dfs(w);
      }
    }
  }
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    graph=(Vector<Integer>[]) new Vector[101];
    for(int i=0;i<=100;i++)
    {
      graph[i]=new Vector<Integer>();
    }
    int[] l=new int[101];
    int[] r=new int[101];
    int k=1;
    for(int i=1;i<=q;i++)
    {
      int a=sc.nextInt();
      if(a==1)
      {
        l[k]=sc.nextInt();
        r[k]=sc.nextInt();
        for(int j=1;j<=k;j++)
        {
          if((l[j]<l[k]&&l[k]<r[j])||(l[j]<r[k]&&r[k]<r[j]))
            graph[k].add(j);
          if((l[k]<l[j]&&l[j]<r[k])||(l[k]<r[j]&&r[j]<r[k]))
            graph[j].add(k);
        }
        k++;
      }
      else if(a==2)
      {
        marked=new boolean[101];
        int b=sc.nextInt();
        int c=sc.nextInt();
        dfs(b);       
        if(marked[c])
          out.println("YES");
        else
          out.println("NO");
      }
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

