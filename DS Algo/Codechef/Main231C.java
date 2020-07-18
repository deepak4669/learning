import java.util.*;
import java.io.*;
//267630EY
public class Main231C
{
  static PrintWriter out=new PrintWriter(System.out);
  static Long[] a;
  static Long[] sum;
  static int binary(int k,int i)
  {
    int lo=1;
    int hi=i+1;
    while(hi>lo)
    {
      int mid=lo+(hi-lo+1)/2;
      //mid/=2;
      mid-=1;
      System.out.println(lo+" "+hi+" "+mid);
      System.out.println(mid+" "+i);
      if((sum[i]-sum[i-mid])-(mid)*a[i]>k)
        hi=mid-1;
      else if((sum[i]-sum[i-mid])-(mid)*a[i]<=k)
        lo=mid+1;
      //else
        //return mid;
    }
    //assert sum[i]-sum[i-lo+1]-(lo-1)*a[i]<k;
    return lo;
  }
     
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    a=new Long[n];
  
    for(int i=0;i<n;i++)
      a[i]=sc.nextLong();
    
    Arrays.sort(a);
    sum=new Long[n];
    sum[0]=a[0];
    for(int i=1;i<n;i++)
    {
      sum[i]=(a[i]+sum[i-1]);
    }
    int max=0;
    long ans=0;
    long psum=0;
    int p1=0;
    for(int i=0;i<n;i++)
    {
      while((i-p1)*a[i]-psum>k)
      {
        psum-=a[p1++];
      }
      if(max<(i-p1+1))
      {
        max=(i-p1+1);
        ans=a[i];
      }
      psum+=a[i];
    }
    out.println(max+" "+ans);
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

