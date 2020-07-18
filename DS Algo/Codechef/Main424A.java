import java.util.*;
import java.io.*;
//267630EY
public class Main424A
{
  static PrintWriter out=new PrintWriter(System.out);

        
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    char[] ch=s.toCharArray();
    int stand=0;
    int sit=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='X')
        stand++;
      else
        sit++;
    }
    if(sit>stand)
    {
      int ans=Math.abs(n/2-sit);
      out.println(ans);
      for(int i=0;i<s.length()&&ans>0;i++)
      {
        if(ch[i]=='x')
        {
          ch[i]='X';
          ans--;
        }
        
      }
      out.println(ch);
    }
    else
    {
      int ans=Math.abs(n/2-stand);
      out.println(ans);
      for(int i=0;i<s.length()&&ans>0;i++)
      {
        if(ch[i]=='X')
        {
          ch[i]='x';
          ans--;
        }
      }
      out.println(ch);
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

