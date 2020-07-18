import java.util.*;
import java.io.*;
//267630EY
public class Main510C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static Vector<Integer>[] graph;
  static boolean[] marked;
  static boolean flag=true;
  static Stack<Integer> order;

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] s=new String[n];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.nextLine();
    }
    graph=(Vector<Integer>[]) new Vector[26];
    marked=new boolean[26];
    order=new Stack<Integer>();
    flag=true;
    for(int i=0;i<26;i++)
    {
      graph[i]=new Vector<Integer>();
    }
    for(int i=0;i<n-1;i++)
    {
      String a=s[i];
      String b=s[i+1];
      for(int j=0;j<Math.min(a.length(),b.length());j++)
      {
        int v=(int)a.charAt(j)-(int)'a';
        int w=(int)b.charAt(j)-(int)'a';
//        System.out.println(b.charAt(j)+" "+a.charAt(j));
        if(v!=w)
        {
          graph[v].add(w);
          break;
        }
      }
    }
    for(int i=0;i<26;i++)
    {
      if(!marked[i]&&graph[i].size()>=1)
      {
        Vector<Integer> v=new Vector<Integer>();
        v.add(i);
        dfs(i,v);
      }
    }
    if(!flag)
      out.println("Impossible");
    else
    {
      StringBuilder ans=new StringBuilder();
      while(order.size()!=0)
      {
        char c=(char)(order.pop()+(int)'a');
        ans.append(c);
      }
      out.println(ans);
    }
  
    out.flush();
  }
  static void dfs(int s,Vector<Integer> v)
  {
    marked[s]=true;
    for(int w:graph[s])
    {
      if(!marked[w])
      {
        Vector<Integer> x=new Vector<Integer>(v);
        x.add(w);
        dfs(w,x);
      }
      else
      {
        if(v.contains(w))
        {
          flag=false;
        }
      }
    }
    order.push(s);
    
  }
  
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
    {
      br=new BufferedReader(new InputStreamReader(is));
    }
    
    public boolean hasNext()
    {
      

      boolean result=false;
      
      try 
      {
        result = br.ready();
      } 
      catch (IOException e)
      {
        System.err.println(e);
      }
      return result;
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

