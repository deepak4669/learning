import java.util.*;
import java.io.*;
//267630EY
public class Main713
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static String reverse(String a)
  {
    String ans="";
    int idx=0;
    int idy=a.length()-1;
    for(int i=0;i<a.length();i++)
    {
      if(a.charAt(i)!='0')
      {
        idx=i;
        break;
      }
    }
    for(int i=a.length()-1;i>=idx;i--)
    {
      if(a.charAt(i)!='0')
      {
        idy=i;
        break;
      }
    }
    for(int i=idy;i>=idx;i--)
    {
      ans+=a.substring(i,i+1);
    }
    return ans;
  }
  
  static String add(String a,String b)
  {
    String ans="";
    int carry=0;
    int length=Math.max(a.length(),b.length());
    String resa=resize(a,length);
    String resb=resize(b,length);
    
    assert resa.length()==resb.length();
    
    for(int i=resa.length()-1;i>=0;i--)
    {
      int m=Integer.parseInt(resa.substring(i,i+1));
      int n=Integer.parseInt(resb.substring(i,i+1));
      ans+=(m+n+carry)%10+"";
      carry=(m+n+carry)/10;
    }
    if(carry!=0)
      ans+=carry+"";
    return reverse(ans);
  }
  static String resize(String a,int n)
  {
    String append="";
    for(int i=0;i<n-a.length();i++)
      append+="0";
    return append+a;
  }
    
      
    
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
      String a=sc.next();
      String b=sc.next();
      
      String reva=reverse(a);
      String revb=reverse(b);
      
      String ans=reverse(add(reva,revb));
      
      out.println(ans);
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

