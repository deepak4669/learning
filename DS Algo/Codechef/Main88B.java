import java.util.*;
import java.io.*;
//267630EY
public class Main88B
{
  static PrintWriter out=new PrintWriter(System.out);
  static class pair
  {
    int a;
    int b;
    public pair(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
  }
  static double euclid(int x1,int y1,int x2,int y2)
  {
    return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    String[] s=new String[n];
    //int cnt=0;
    Vector<pair> cnt=new Vector<pair>();
    boolean marked[]=new boolean[26];
    for(int i=0;i<n;i++)
    {
      s[i]=sc.next();
      for(int j=0;j<m;j++)
      {
        if(s[i].charAt(j)=='S')
        {
          pair p=new pair(i,j);
          cnt.add(p);
        }
        else
        {
          int id=s[i].charAt(j)-97;
          marked[id]=true;
        }
      }
    }
    int q=sc.nextInt();
    String q_s=sc.next();
    double[] dist=new double[26];
    Arrays.fill(dist,Integer.MAX_VALUE);
    for(int i=0;i<cnt.size();i++)
    {
      int[] val=new int[26];
      int c_x=cnt.elementAt(i).a;
      int c_y=cnt.elementAt(i).b;
      for(int j=0;j<n;j++)
      {
        for(int k=0;k<m;k++)
        {
          if(s[j].charAt(k)=='S')
            continue;
          else
          {
            int id=s[j].charAt(k)-97;
            dist[id]=Math.min(dist[id],euclid(c_x,c_y,j,k));
          }
        }
      }
    }
    int ans=0;
    boolean flag=true;
    for(int i=0;i<q;i++)
    {
      if(Character.isUpperCase(q_s.charAt(i)))
      {
        int id=Character.toLowerCase(q_s.charAt(i))-97;
        //System.out.println(dist[id]);
        if(dist[id]==Integer.MAX_VALUE)
        {
          flag=false;
          break;
        }
        
        if(dist[id]>x)
        {
          //System.out.println(q_s.charAt(i));
          ans++;
        }
      }
      else
      {
        int id=q_s.charAt(i)-97;
        if(!marked[id])
        {
          flag=false;
          break;
        }
          
      }
          
          
    }
    if(!flag)
      out.println(-1);
    else
      out.println(ans);
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

