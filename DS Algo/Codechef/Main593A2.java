import java.util.*;
import java.io.*;

public class Main593A2
{
  static PrintWriter out=new PrintWriter(System.out);
  static Vector<Character> contains(String s)
  {
    Vector<Character> letters=new Vector<Character>();
    for(int i=0;i<s.length();i++)
    {
      if(!letters.contains(s.charAt(i)))
        letters.add(s.charAt(i));
    }
    return letters;
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] cnt1=new int[26];
    int[][] cnt2=new int[26][26];
    while(n-->0)
    {
      String s=sc.next();
      Vector<Character> dis=new Vector<Character>();
      dis=contains(s);
      if(dis.size()==1)
        cnt1[(int)dis.elementAt(0)-97]+=s.length();
      else if(dis.size()==2)
      {
        cnt2[(int)dis.elementAt(1)-97][(int)dis.elementAt(0)-97]+=s.length();
        cnt2[(int)dis.elementAt(0)-97][(int)dis.elementAt(1)-97]+=s.length();
      }
    }
    int max=0;
    for(int i=0;i<26;i++)
    {
      for(int j=0;j<26;j++)
      {
        if(i==j) continue;
        int value=cnt1[i]+cnt1[j]+cnt2[i][j];
        if(value>max)
          max=value;
      }
    }
    out.println(max);
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

