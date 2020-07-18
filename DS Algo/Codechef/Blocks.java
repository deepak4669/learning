import java.util.*;
import java.io.*;
//267630EY
public class Blocks
{
  static PrintWriter out=new PrintWriter(System.out);
  static int nmax=2000001;
  static class segmentTree
  {
    int N;
    int[] t;
    int[] lazy;
    boolean marked[];
    
    public segmentTree(int n,int[] a)
    {
      this.N=n;
      t=new int[4*N];
      lazy=new int[4*N];
      marked=new boolean[4*N];
      build(a,1,0,a.length-1);
    }
    public void build(int[] a,int v,int tl,int tr)
    {
      if(tl==tr) t[v]=a[tl];
      else
      {
        int tm=(tl+tr)/2;
        build(a,2*v,tl,tm);
        build(a,2*v+1,tm+1,tr);
        t[v]=Math.max(t[2*v],t[2*v+1]);
      }
    }
    public void push(int v)
    {
      if(marked[v])
      {
        t[2*v]=lazy[v];
        t[2*v+1]=lazy[v];
        lazy[2*v]=lazy[v];
        lazy[2*v+1]=lazy[v];
        marked[2*v]=true;
        marked[2*v+1]=true;
        marked[v]=false;
      }
    }
        
        
    public int query(int v,int tl,int tr,int l,int r)
    {
      if(l>r)
        return 0;
      if(l<=tl&&r>=tr)
        return t[v];
      push(v);
      int tm=(tl+tr)/2;
      return Math.max(query(2*v,tl,tm,l,Math.min(r,tm)),query(2*v+1,tm+1,tr,Math.max(l,tm+1),r));
    }
    public void update(int v,int tl,int tr,int l,int r,int val)
    {
      if(l>r)
        return;
      if(l==tr&&tr==r)
      {
        lazy[2*v]=val;
        lazy[2*v+1]=val;
        t[v]=val;
        marked[2*v]=true;
        marked[2*v+1]=true;
      }
      else
      {
        push(v);
        int tm=(tl+tr)/2;
        update(2*v,tl,tm,l,Math.min(r,tm),val);
        update(2*v+1,tm+1,tr,Math.max(tm+1,l),r,val);
        t[v]=Math.max(t[v*2],t[v*2+1]);
      }
    }
  }
          
    
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int[] a=new int[nmax];
    segmentTree tr=new segmentTree(nmax,a);
    int n=sc.nextInt();
    while(n-->0)
    {
      int l=sc.nextInt();
      int h=sc.nextInt();
      int p=sc.nextInt();
      int c=sc.nextInt();
      int x=sc.nextInt();
      int max=0;
      max=tr.query(1,0,a.length-1,x,x+l-1);
      if(c==1)
      {
        
         
        tr.update(1,0,a.length-1,x,x+l-1,max+1);
        tr.update(1,0,a.length-1,x+p-1,x+p-1,max+h+1);
            
      }
      else
      {
        
        int qp=tr.query(1,0,a.length-1,x+p-1,x+p-1);
        if(max-qp>=h) tr.update(1,0,a.length-1,x,x+l-1,max+1);
        else tr.update(1,0,a.length-1,x,x+l-1,qp+h+1);
      }
    }
    //for(int i=0;i<23;i++)
    //  out.print(a[i]+" ");
    
    out.println(tr.query(1,0,a.length-1,0,a.length-1));
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

