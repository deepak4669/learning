import java.util.*;
import java.io.*;
//267630EY
public class Main144B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int xa=sc.nextInt();
    int ya=sc.nextInt();
    int xb=sc.nextInt();
    int yb=sc.nextInt();
    Vector<Vector<Integer>> a=new Vector<Vector<Integer>>();
    
    for(int i=Math.min(xa,xb);i<=Math.max(xa,xb);i++)
    {
      Vector<Integer> v=new Vector<Integer>();
      Vector<Integer> w=new Vector<Integer>();
      v.add(i);
      v.add(ya);
      w.add(i);
      w.add(yb);
      a.add(v);
      a.add(w);
    }
    for(int i=Math.min(ya,yb)+1;i<Math.max(ya,yb);i++)
    {
      Vector<Integer> v=new Vector<Integer>();
      Vector<Integer> w=new Vector<Integer>();
      v.add(xa);
      v.add(i);
      w.add(xb);
      w.add(i);
      a.add(v);
      a.add(w);
    }
    int n=sc.nextInt();
    int x[]=new int[n];
    int y[]=new int[n];
    int r[]=new int[n];
    for(int i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      r[i]=sc.nextInt();
    }
    int count=0;
    for(int i=0;i<a.size();i++)
    {
      int x1=a.elementAt(i).elementAt(0);
      int y1=a.elementAt(i).elementAt(1);
//      if(x1==4&&y1==4)
//        out.println("E");
      boolean flag=true;
      for(int j=0;j<n;j++)
      {
        double distance=Math.sqrt((x1-x[j])*(x1-x[j])+(y1-y[j])*(y1-y[j]));
        if(distance<=r[j])
          flag=false;
      }
      if(flag)
      {
//        out.println(x1+" "+y1);
        count++;
      }
    }
    out.println(count);
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
