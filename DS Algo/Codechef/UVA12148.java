import java.util.*;
import java.io.*;
//267630EY
public class UVA12148
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] year={31,28,31,30,31,30,31,31,30,31,30,31};
  static int[] leep={31,29,31,30,31,30,31,31,30,31,30,31};
  static boolean leep(int y)
  {
    return y%400==0||(y%4==0&&!(y%100==0));
  }
  static int[] next(int x,int y,int z)
  {
    int[] ans=new int[3];
    if(leep(z))
    {
      int monthdays=leep[y-1];
      if(x==monthdays)
      {
        if(y==12)
        {
          ans[0]=1;
          ans[1]=1;
          ans[2]=z+1;
        }
        else
        {
          ans[0]=1;
          ans[1]=y+1;
          ans[2]=z;
        }
      }
      else
      {
        ans[0]=x+1;
        ans[1]=y;
        ans[2]=z;
      }
    }
    else
    {
      int monthdays=year[y-1];
      if(x==monthdays)
      {
        if(y==12)
        {
          ans[0]=1;
          ans[1]=1;
          ans[2]=z+1;
        }
        else
        {
          ans[0]=1;
          ans[1]=y+1;
          ans[2]=z;
        }
      }
      else
      {
        ans[0]=x+1;
        ans[1]=y;
        ans[2]=z;
      }
    }
    return ans;
    
  }
            
          
    
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      if(n==0)
        break;
      int ans=0;
      int cnt=0;
      
      int day[]=new int[n];
      int month[]=new int[n];
      int year[]=new int[n];
      int con[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        day[i]=sc.nextInt();
        month[i]=sc.nextInt();
        year[i]=sc.nextInt();
        con[i]=sc.nextInt();
      }
      for(int i=0;i<n-1;i++)
      {
        int[] nextday=next(day[i],month[i],year[i]);
        if(nextday[0]==day[i+1]&&nextday[1]==month[i+1]&&nextday[2]==year[i+1])
        {
          cnt++;
          ans+=con[i+1]-con[i];
        }
      }
      out.println(cnt+" "+ans);
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

