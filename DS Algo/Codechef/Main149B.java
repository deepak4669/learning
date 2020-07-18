import java.util.*;
import java.io.*;

public class Main149B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static boolean valid(int i,String a,String b)
  {
    long hour=0;
    long min=0;
    for(int j=a.length()-1;j>=0;j--)
    {
      int x=convert(a.substring(j,j+1));
      if(x>=i)
      {
        hour=-1;
        break;
      } 
      hour=hour+(pow(i,a.length()-j-1)*x); 
    }
    if(hour>=0&&hour<=23)
    {
      for(int j=b.length()-1;j>=0;j--)
      {
        int x=convert(b.substring(j,j+1));
        if(x>=i)
        {
          min=-1;
          break;
        }
        
        
        min+=Math.pow(i,b.length()-j-1)*x;
      }
      if(min>=0&&min<60)
      {
        //out.println(hour+" "+min);
          return true;
      }
    }
    return false;
  }
    
  static int convert(String a)
  {
    if(a.charAt(0)>=65&&a.charAt(0)<=90)
      return a.charAt(0)-55;
    else
      return Integer.parseInt(a);
  }
  public static long pow(int a, int b)
  {
    long res=1;
    while(b>0)
    {
      if(b%2!=0)
        res=res*a;
      a=a*a;
      b>>=1;
    }
    return res;
  }
  
      
      
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int colon=s.indexOf(":");
    String a=s.substring(0,colon);
    String b=s.substring(colon+1,s.length());
    long hour=0;
    long min=0;
   
      
    Vector<Integer> sol=new Vector<Integer>();
    for(int i=2;i<=60;i++)
    {
      if(valid(i,a,b))
        sol.add(i);
      
    }
    if(sol.size()==0)
      out.println(0);
    else if(valid(60,a,b)&&valid(65,a,b))
      out.println(-1);
    else
    {
      for(int i:sol)
        out.print(i+" ");
    }
    //out.println(sol.size());
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

