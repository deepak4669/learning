import java.util.*;
import java.io.*;
//267630EY
public class Main716B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    if(s.length()<26)
      
      out.println(-1);
    else
    {
      int[] marked=new int[100];
      char[] s_ar=s.toCharArray();
      boolean f=false;
      for(int i=0;i<=s.length()-26;i++)
      {
        int j=i+26;
        marked=new int[100];
        int count=0;
        boolean flag=true;
        Vector<Integer> v=new Vector<Integer>();
        
        for(int k=i;k<j;k++)
        {
          if(s.charAt(k)=='?')
          {
            count++;
            v.add(k);
          }
          else
          {
            marked[(int)s.charAt(k)]++;
            if(marked[(int)s.charAt(k)]>=2)
              flag=false;
            
          }
        }
//        out.println(count);
//        out.println(flag);
        if(flag)
        {
          for(int w:v)
          {
            for(int k=65;k<=90;k++)
            {
              if(marked[k]==0)
              {
                s_ar[w]=(char)k;
                marked[k]++;
                break;
              }
            }
          }
          f=true;
          break;
        }
      }
      if(!f)
        out.println(-1);
      else
      {
        for(int i=0;i<s.length();i++)
        {
          if(s_ar[i]=='?')
            s_ar[i]='X';
        }
        out.println(s_ar);
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
