import java.util.*;
import java.io.*;
//267630EY
public class Main352B2
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Vector<Integer>[] a=(Vector<Integer>[]) new Vector[100001];
    boolean[] marked=new boolean[100001];
    int[] diff=new int[100001];
    int cnt=0;
    for(int i=0;i<=100000;i++)
    {
      a[i]=new Vector<Integer>();
    }
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      a[x].add(i);
    }
    for(int i=0;i<=100000;i++)
    {
      if(a[i].size()==0)
        continue;
      else if(a[i].size()==1)
      {
        marked[i]=true;
        diff[i]=0;
        cnt++;
        continue;
      }
      else
      {
        boolean flag=true;
        int d=a[i].elementAt(1)-a[i].elementAt(0);
        for(int j=1;j<a[i].size()-1;j++)
        {
          if(a[i].elementAt(j+1)-a[i].elementAt(j)!=d)
          {
            flag=false;
            break;
          }
        }
        if(flag)
        {
          cnt++;
          marked[i]=true;
          diff[i]=d;
        }
      }
    }
    out.println(cnt);
    for(int i=0;i<=100000;i++)
    {
      if(marked[i])
      {
        out.println(i+" "+diff[i]);
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

