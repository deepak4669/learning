import java.util.*;
import java.io.*;

public class Main214B
{
  static PrintWriter out=new PrintWriter(System.out);
  static void print(int[] a)
  {
    int n=0;
    for(int i=0;i<a.length;i++)
    {
      n+=a[i];
    }
    int[] ans=new int[n];
    int k=0;
    if(a[0]==n)
    {
      out.println(0);
    }
    else
    {
      for(int i=0;i<a.length;i++)
      {
        
        while(a[i]>0)
        {
          ans[k++]=i;
          a[i]--;
        }
      }
      assert k==n;
      
      for(int i=n-1;i>=0;i--)
      {
      out.print(ans[i]);
      }
    }
  }
      
      
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=sc.nextIntArray(n);
    Vector<Integer>[] b=(Vector<Integer>[]) new Vector[3];
    int[] ans=new int[10];
    b[0]=new Vector<Integer>();
    b[1]=new Vector<Integer>();
    b[2]=new Vector<Integer>();
    boolean flag=false;
    long sum=0;
    Arrays.sort(a);
    for(int i=0;i<n;i++)
    {
      if(a[i]%3==1)
        b[1].add(a[i]);
      else if(a[i]%3==2)
        b[2].add(a[i]);
      ans[a[i]]++;
      sum+=a[i];
      
    }
    if(ans[0]==0)
      out.println(-1);
    else
    {
      flag=true;
      if(sum%3==0)
      {
        print(ans);
      }
      else
      {
        int x=(int)(sum%3);
        if(b[x].size()>=1)
        {
          ans[b[x].elementAt(0)]--;
          
        }
        else if(b[3-x].size()>=2)
        {
          ans[b[3-x].elementAt(0)]--;
          ans[b[3-x].elementAt(1)]--;
          
        }
        else
          flag=false;
        if(!flag)
          out.println(-1);
        else
        {
          print(ans);
        }
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

