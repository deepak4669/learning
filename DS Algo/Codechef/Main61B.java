import java.util.*;
import java.io.*;

public class Main61B
{
  static PrintWriter out=new PrintWriter(System.out);
  static String process(String s)
  {
    String k=s.toLowerCase();
    String res="";
    for(int i=0;i<k.length();i++)
    {
      if(k.charAt(i)==';'||k.charAt(i)=='_'||k.charAt(i)=='-')
        continue;
      else
        res+=k.charAt(i);
    }
    return res;
  }
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    String s3=sc.next();
    String[] p=new String[3];
    p[0]=process(s1);
    p[1]=process(s2);
    p[2]=process(s3);
    int n=sc.nextInt();
    String[] t=new String[n];
    for(int i=0;i<n;i++)
    {
      String o=sc.next();
      t[i]=process(o);
    }
    String[] ans=new String[n];
    for(int i=0;i<n;i++)
    {
      boolean[] marked=new boolean[t[i].length()];
      boolean flag=true;
      for(int j=0;j<3;j++)
      {
        int id=t[i].indexOf(p[j]);
        if(id==-1)
        {
          flag=false;
          break;
        }
        while(id!=-1)
        {
        if(id!=-1)
          for(int l=id;l<id+p[j].length();l++)
          {
            marked[l]=true;
          }
          id=t[i].indexOf(p[j],id+p[j].length());
        }
      }
      
      for(int j=0;j<t[i].length();j++)
      {
        if(!marked[j])
        {
          flag=false;
          break;
        }
      }
      if(!flag)
        ans[i]="WA";
      else
        ans[i]="ACC";
    }
    for(int i=0;i<n;i++)
      out.println(ans[i]);
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

