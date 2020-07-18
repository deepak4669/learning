import java.util.*;
import java.io.*;
//267630EY
public class Main1108E2
{
  static PrintWriter out=new PrintWriter(System.out);
  static class segMent
  {
    int[] t;
    int n;
    int[] lazy;
    boolean[] marked;
    public segMent(int[] a,int n)
    {
      this.n=n;
    
      lazy=new int[4*n];
      marked=new boolean[4*n];
      t=new int[4*n];
      build(1,0,a.length-1,a);
    }
    public void build(int v,int tl,int tr,int[] a)
    {
      if(tl==tr)
      {
        t[v]=a[tl];
      }
      else
      {
        
        int tm=(tl+tr)/2;
     
        build(2*v,tl,tm,a);
        build(2*v+1,tm+1,tr,a);
        t[v]=Math.min(t[2*v+1],t[2*v]);
      }
    }
    public void push(int v)
    {
      
      t[2*v]+=lazy[v];
      t[2*v+1]+=lazy[v];
      lazy[2*v]+=lazy[v];
      lazy[2*v+1]+=lazy[v];
      lazy[v]=0;
      
    }
          
    public void update(int v,int tl,int tr,int l,int r,int val)
    {
      if(l>r) return;
      else if(l==tl&&r==tr)
      {
        t[v]+=val;
        lazy[v]+=val;
       
      }
      else
      {
        push(v);
        int tm=(tl+tr)/2;
        
        update(2*v,tl,tm,l,Math.min(tm,r),val);
        update(2*v+1,tm+1,tr,Math.max(l,tm+1),r,val);
        t[v]=Math.min(t[2*v],t[2*v+1]);
      }
    }
    public int query(int v,int tl,int tr,int l,int r)
    {
      if(l>r) return 1000000000;
      else if(l<=tl&&r>=tr)
      {
        return t[v];
      }
      else
      {
        push(v);
        int tm=(tl+tr)/2;
        return Math.min(query(2*v,tl,tm,l,Math.min(tm,r)),query(2*v+1,tm+1,tr,Math.max(tm+1,l),r));
      }
    }
  }
  public static int max(int[] a)
  {
    int res=-10000000;
    for(int i=0;i<a.length;i++)
    {
      if(res<a[i])
        res=a[i];
    }
    return res;
  }
  public  static int min(int[] a)
  {
    int min=100000000;
    for(int i=0;i<a.length;i++)
    {
      if(min>a[i])
        min=a[i];
    }
    return min;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    //long startTime=System.nanoTime();
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=sc.nextIntArray(n);
    int[] l=new int[m];
    int[] r=new int[m];
    for(int i=0;i<m;i++)
    {
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
      l[i]-=1;
      r[i]-=1;
    }
    int ans=max(a)-min(a);   
    
    Vector<Integer> sol=new Vector<Integer>();
    Vector<Integer>[] pos=(Vector<Integer>[]) new Vector[n+1];
    Vector<Integer>[] neg=(Vector<Integer>[]) new Vector[n+1];
    
    for(int i=0;i<=n;i++)
    {
      
      pos[i]=new Vector<Integer>();
      neg[i]=new Vector<Integer>();
    }
    
    for(int j=0;j<m;j++)
    {
      
      pos[r[j]+1].add(j);
      neg[l[j]].add(j);
    }
      
    int ansin=0;
    segMent tr=new segMent(a,n);
    for(int i=0;i<m;i++)
      tr.update(1,0,a.length-1,l[i],r[i],-1);
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<pos[i].size();j++)
      {
        int k=pos[i].elementAt(j);
        tr.update(1,0,a.length-1,l[k],r[k],-1);
      }
      for(int j=0;j<neg[i].size();j++)
      {
        int k=neg[i].elementAt(j);
        tr.update(1,0,a.length-1,l[k],r[k],+1);
      }
          
      int minNew=tr.query(1,0,a.length-1,0,a.length-1);
      
      if(a[i]-minNew>=ans)
      {
        
        ans=a[i]-minNew;
        ansin=i;
        
        
      }
    }
   
    for(int i=0;i<m;i++)
    {
      if(!(l[i]<=ansin&&r[i]>=ansin))
        sol.add(i);
    }
    
    out.println(ans);
    out.println(sol.size());
    for(int i:sol)
      out.print((i+1)+" ");
    out.flush();
    //long endTime=System.nanoTime();
    //out.println((endTime-startTime)+"ns");
    //out.flush();
      
 
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
