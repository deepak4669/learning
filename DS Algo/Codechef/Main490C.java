import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main490C
{
  static PrintWriter out=new PrintWriter(System.out);
  static long binPow(long a,long n,int c)
  {
    long res=1;
    while(n>0)
    {
      if(n%2!=0)
      {
        res=(res*a)%c;
      }
      a=a*a%c;
      n/=2;
    }
    return res;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int a=sc.nextInt();
    int b=sc.nextInt();
    String left="";
    String right="";
    int[] rema=new int[s.length()-1];
    int[] remb=new int[s.length()-1];
    rema[0]=Integer.parseInt(s.substring(0,1))%a;
    remb[s.length()-2]=Integer.parseInt(s.substring(s.length()-1,s.length()))%b;
    
    for(int i=1;i<s.length()-1;i++)
    {
      rema[i]=(rema[i-1]*10+Integer.parseInt(s.substring(i,i+1)))%a;
     
    }
    
    for(int i=s.length()-3;i>=0;i--)
    {
      
      remb[i]=(remb[i+1]+Integer.parseInt(s.substring(i+1,i+2))*(int)binPow(10,s.length()-i-2,b))%b;
     
    }
                              
   for(int i=0;i<s.length()-1;i++)
   {
     if(rema[i]==0&&remb[i]==0)
     {
       String c=s.substring(0,i+1);
       String d=s.substring(i+1,s.length());
       if(d.charAt(0)!='0')
       {
         left=c;
         right=d;
         break;
       }
     }
   }
    if(left.equals(""))
      out.println("NO");
    else
    {
      out.println("YES");
      out.println(left);
      out.println(right);
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

