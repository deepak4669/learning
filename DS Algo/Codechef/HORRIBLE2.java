import java.util.*;
import java.io.*;
//267630EY
public class HORRIBLE2
{
  static PrintWriter out=new PrintWriter(System.out);
  public static class SegTree
  {
    int N;
    long[] t;
    long[] lazy;
    boolean marked[];
    public SegTree(int[] a,int N)
    {
      this.N=N;
      t=new long[4*N];
      lazy=new long[4*N];
      marked=new boolean[4*N];
      build(1,0,a.length-1,a);
    }
    public void push(int v,int tl,int tr)
    {
      if(marked[v])
      {
        int tm=(tl+tr)/2;
        t[2*v]+=lazy[v]*(long)(tm-tl+1);
        t[2*v+1]+=lazy[v]*(long)(tr-tm-1+1);;
        lazy[2*v]+=lazy[v];
        lazy[2*v+1]+=lazy[v];
        lazy[v]=0;
        marked[v]=false;
        marked[2*v]=true;
        marked[2*v+1]=true;
      }
    }
    public void build(int v,int tl,int tr,int[] a)
    {
      if(tl==tr)
        t[v]=a[tl];
      else
      {
        int tm=(tl+tr)/2;
        
        build(2*v,tl,tm,a);
        build(2*v+1,tm+1,tr,a);
        t[v]=t[2*v]+t[2*v+1];
      }
    }
    public void update(int v,int tl,int tr,int l,int r,long val)
    {
      if(l>r) return ;
      else if(tl==l&&tr==r)
      {
        marked[v]=true;
        lazy[v]+=val;
        t[v]+=val*(r-l+1);
      }
      else
      {
        push(v,tl,tr);
        int tm=(tl+tr)/2;
        update(2*v,tl,tm,l,Math.min(tm,r),val);
        update(2*v+1,tm+1,tr,Math.max(tm+1,l),r,val);
        t[v]=t[2*v]+t[2*v+1];
      }
    }
    public long query(int v,int tl,int tr,int l,int r)
    {
      if(l>r) return 0;
      else if(tl==l&&tr==r)
      {
        return t[v];
      }
      else
      {
        push(v,tl,tr);
        int tm=(tl+tr)/2;
       
        return query(2*v,tl,tm,l,Math.min(r,tm))+(long)query(2*v+1,tm+1,tr,Math.max(tm+1,l),r);
      }
    }
  }
        
        
          
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int o=sc.nextInt();
    for(int i=0;i<o;i++)
    {
      int n=sc.nextInt();
      int c=sc.nextInt();
      int[] a=new int[n];
      SegTree tr=new SegTree(a,n);
      for(int j=0;j<c;j++)
      {
        
        int x=sc.nextInt();
        
        if(x==0)
        {
          int p=sc.nextInt();
          int q=sc.nextInt();
          long v=sc.nextLong();
          
          tr.update(1,0,a.length-1,p-1,q-1,v);
        }
        else
        {
          int p=sc.nextInt();
          int q=sc.nextInt();
          
          out.println(tr.query(1,0,a.length-1,p-1,q-1));
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

