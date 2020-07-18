import java.util.*;
import java.io.*;
//267630EY
public class Main186B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int t1;
  static int t2;
  static int k;
  public static class mushroom implements Comparable<mushroom>
  {
    int a;
    int b;
    double c;
    int id;
    public mushroom(int a,int b,int id)
    {
      this.a=a;
      this.b=b;
      this.id=id;
      this.c=Math.max(a*t1-k*(a*t1)/100.0+b*t2,b*t1-k*(b*t1)/100.0+a*t2);
    }
    public int compareTo(mushroom that)
    {
      if(this.c<that.c) return -1;
      else if(this.c>that.c) return +1;
      else if(this.id>that.id) return -1;
      else if(this.id<that.id) return +1;
      else return 0;
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    t1=sc.nextInt();
    t2=sc.nextInt();
    k=sc.nextInt();
    mushroom[] arr=new mushroom[n];
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      arr[i]=new mushroom(a,b,i+1);
    }
    Arrays.sort(arr);
    for(int i=arr.length-1;i>=0;i--)
    {
      System.out.print(arr[i].id+" ");
      System.out.printf("%.2f",arr[i].c);
      System.out.println();
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

