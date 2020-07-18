import java.util.*;
import java.io.*;
//267630EY
public class Main550C
{
  static PrintWriter out=new PrintWriter(System.out);

        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    String res="";
    
    for(int i=0;i<n.length();i++)
    {
//      System.out.println(i);
      for(int j=i+1;j<n.length();j++)
      {
        for(int k=j+1;k<n.length();k++)
        {
          int curr=Integer.parseInt(n.substring(i,i+1)+n.substring(j,j+1)+n.substring(k,k+1));
          if(curr%8==0)
          {
            res=curr+"";
          }
        }
        int curr=Integer.parseInt(n.substring(i,i+1)+n.substring(j,j+1));//+n.substring(k,k+1));
        if(curr%8==0)
        {
          res=curr+"";
        }
      }
      int curr=Integer.parseInt(n.substring(i,i+1));//+n.substring(j,j+1)+n.substring(k,k+1));
//      System.out.println(curr);
      if(curr%8==0)
      {
        res=curr+"";
      }
//      System.out.println("c");
    }
    if(res.equals(""))
      out.println("NO");
    else
    {
      out.println("YES");
      out.println(res);
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

