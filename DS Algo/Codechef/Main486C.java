import java.util.*;
import java.io.*;

public class Main486C
{
  static PrintWriter out=new PrintWriter(System.out);
  static int getDiff(String f,String g)
  {
    int k=g.length()-1;
    int ans=0;
    for(int i=0;i<f.length()&&k>=0;i++)
    {
      if(f.charAt(i)==g.charAt(k))
      {
        k--;
      }
      else
      {
        ans+=getdiff(f.charAt(i),g.charAt(k));
        k--;
      }
    }
    return ans;
  }
  static int getdiff(char a,char b)
  {
    int res=Math.min(Math.abs(b-a),'z'-Math.max(a,b)+Math.min(a,b)-'a'+1);
    return res;
  }
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int p=sc.nextInt();
    String s=sc.next();
    char[] st=s.toCharArray();
    int ans=0;
    if(n%2==0)
    {
      if(p>n/2)
      {
        p=(n-p)+1;
      }
      int id=-1;
      int idx=-1;
      for(int i=0;i<p;i++)
      {
        if(st[i]!=st[n-1-i])
        {
          id=i;
          break;
        }
        }
      for(int i=n/2-1;i>=p;i--)
      {
        if(st[i]!=st[n-1-i])
        {
          idx=i;
          break;
        }
      }
      
      ans+=getDiff(s.substring(0,n/2),s.substring(n/2,n));
      int x=Math.abs(idx-(p-1));
      int y=Math.abs(p-1-id);
      if(id==-1&&idx==-1)
        ans+=0;
      else if(id==-1)
      {
        ans+=x;
      }
      else if(idx==-1)
        {
        ans+=y;
      }
      else
      {
        if(y>x)
          ans+=2*x+y;
        else if(y<x)
          ans+=2*y+x;
        else
            ans+=3*x;
      }
    }
    else
    {
      if(p>(n+1)/2)
      {
        p=(n)+1-p;
      }
      
      ans+=getDiff(s.substring(0,n/2),s.substring(n/2+1,n));
      int id=-1;
      int idx=-1;
      for(int i=0;i<p;i++)
      {
        if(st[i]!=st[n-1-i])
        {
          id=i;
          break;
        }
      }
      for(int i=n/2;i>=p;i--)
      {
        if(st[i]!=st[n-i-1])
        {
          idx=i;
          break;
        }
      }
     
      int x=Math.abs(idx-(p-1));
      int y=Math.abs(p-1-id);
      if(id==-1&&idx==-1)
        ans+=0;
      else if(id==-1)
      {
        ans+=x;
      }
      else if(idx==-1)
        {
        ans+=y;
      }
      else
      {
        if(y>x)
          ans+=2*x+y;
        else if(y<x)
          ans+=2*y+x;
        else
            ans+=3*x;
      }
    }
     
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

