import java.util.*;
import java.io.*;
//267630EY
public class Main300A2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=sc.nextIntArray(n);
    int neg=0;
    
    Vector<Integer> pos=new Vector<Integer>();
    Vector<Integer> zero=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
      if(a[i]==0)
      {
        zero.add(0);
      }
      else if(a[i]<0&&neg==0)
      {
        neg=a[i];
      }
      else
        pos.add(a[i]);
    }
    
    int t=0;
    int negid=0;
    for(int i=0;i<pos.size();i++)
    {
      if(pos.elementAt(i)<0)
      {
        t++;
        negid=i;
      }
    }
    boolean flag=false;
    if(t%2!=0)
    {
      flag=true;
      zero.add(pos.elementAt(negid));
    }
      
      
    
    out.println(1+" "+neg);
   
    out.print((flag?pos.size()-1:pos.size())+" ");
    for(int i=0;i<pos.size();i++)
    {
      if(flag&&i==negid)
        continue;
      else
        out.print(pos.elementAt(i)+" ");
    }
      
    out.println();
    out.print(zero.size()+" ");
    for(int i=0;i<zero.size();i++)
    {
      out.print(zero.elementAt(i)+" ");
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

