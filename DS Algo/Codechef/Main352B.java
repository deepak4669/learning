import java.util.*;
import java.io.*;

class Main352B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    Vector<Integer>[] vec=(Vector<Integer>[]) new Vector[100001];
    for(int i=0;i<100001;i++)
      vec[i]=new Vector<Integer>();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      vec[a[i]].add(i);
    }
    int k=0;
    int[] d=new int[100001];
    boolean[] f=new boolean[100001];
    Arrays.fill(f,false);
    Arrays.fill(d,-1);
    for(int i=0;i<n;i++)
    {
      if(vec[a[i]].size()==1&&!f[a[i]])
      {
        d[a[i]]=0;
        k++;
        f[a[i]]=true;
      }
      else if(!f[a[i]])
      {
        int x=vec[a[i]].elementAt(0);
        int y=vec[a[i]].elementAt(1);
        int di=y-x;
        boolean flag=true;
        for(int j=2;j<vec[a[i]].size();j++)
        {
          int z=vec[a[i]].elementAt(j);
          if(z-y==di)
          {
            y=z;
            continue;
          }
          else
          {
            flag=false;
            break;
          }
          
        }
        if(flag)
        {
          d[a[i]]=di;
          k++;
        }
        f[a[i]]=true;
      }
    }
    out.println(k);
    for(int i=0;i<100001;i++)
    {
      if(d[i]!=-1)
      {
        out.println(i+" "+d[i]);
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

