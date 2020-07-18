import java.util.*;
import java.io.*;
//267630EY
public class Main90B
{
  static PrintWriter out=new PrintWriter(System.out);

  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int m=sc.nextInt();
    
    String[] s=new String[n];
    char[][] t=new char[n][m];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
      t[i]=s[i].toCharArray();
//      System.out.println(t[i]);
    }
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
      {
        char c=s[i].charAt(j);
//        System.out.println(c);
        
      
        for(int k=0;k<n;k++)
        {
          char ch=s[k].charAt(j);
          if(c==ch&&k!=i)
          {
            t[k][j]='0';
            t[i][j]='0';
          }
          
        }
        
        for(int k=0;k<m;k++)
        {
          char ch=s[i].charAt(k);
          if(c==ch&&k!=j)
          {
            t[i][k]='0';
            t[i][j]='0';
          }
        }
      }
    }
    String ans="";
    for(int i=0;i<n;i++)
    {
//      System.out.println(t[i]);
      for(int j=0;j<m;j++)
      {
        if(t[i][j]!='0')
          ans+=t[i][j];
      }
    }
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

