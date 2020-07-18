import java.util.*;
import java.io.*;

class WORDGAME
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<String> a=new Vector<String>();
  public static void main(String[] args) throws IOException
  {
        
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      a.clear();
      int n=sc.nextInt();
      
      for(int i=0;i<n;i++)
      {
        String s=sc.next();
        if(a.contains(s))
          continue;
        else
          a.add(s);
      }
      if(a.size()>8)
        out.println("grid's not possible");
      else if(a.size()<=4)
      {
        
        String j="aaaa";
        for(int i=0;i<(4-a.size());i++)
          out.println(j);
        String[] ans=new String[a.size()];
        int k=0;
        for(String l:a)
          ans[k++]=l;
        Arrays.sort(ans);
        for(int i=0;i<k;i++)
          out.println(ans[i]);
      }
      else
      {
        String[] ans=new String[4];
        int no=a.size();
        for(int i=0;i<no;i++)
        {
          for(int j=i+1;j<no;j++)
          {
            for(int k=j+1;k<no;k++)
            {
              for(int l=k+1;l<no;l++)
              {
                ans=new String[4];
                ans[0]=a.elementAt(i);
                ans[1]=a.elementAt(j);
                ans[2]=a.elementAt(k);
                ans[3]=a.elementAt(l);
                if(check(ans))
                  break;
              }
            }
          }
        }
        if(!check(ans))
          out.println("grid's not possible!");
        else          
        {
          Arrays.sort(ans);
          for(int i=0;i<4;i++)
            out.println(ans[i]);
        }
      }
      out.flush();
          
    
    }
  }
  public static boolean check(String[] ans)
  {
    String[] p=new String[8];
    Vector<String> b=new Vector<String>();
    int k=0;
    for(int i=0;i<4;i++)
      b.add(ans[i]);
    for(int i=0;i<4;i++)
    {
      String st=new String();
      st=(ans[0].charAt(i)+ans[1].charAt(i)+ans[2].charAt(i)+ans[3].charAt(i))+"";
      b.add(st);
    }
    int cnt=a.size();
    for(String l:a)
    {
      if(b.contains(l))
        cnt--;
    }
    if(cnt==0)
      return true;
    else
      return false;
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
