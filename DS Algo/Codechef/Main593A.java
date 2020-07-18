import java.util.*;
import java.io.*;

public class Main593A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static boolean contains(String s)
  {
    Vector<Character> ch=new Vector<Character>();
    for(int i=0;i<s.length();i++)
    {
      if(!ch.contains(s.charAt(i)))
        ch.add(s.charAt(i));
      if(ch.size()>2)
        return true;
    }
    return false;
  }
  static char[] character(String s)
  {
    Vector<Character> ch=new Vector<Character>();
    for(int i=0;i<s.length();i++)
    {
      if(!ch.contains(s.charAt(i)))
        ch.add(s.charAt(i));
    }
    char[] res=new char[ch.size()];
    int k=0;
    for(char h:ch)
      res[k++]=h;
    return res;
  }
    
    
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Vector<String> st=new Vector<String>();
    while(n-->0)
    {
      String s=sc.next();
      if(!contains(s))
      {
        st.add(s);
      }
    }
    
    int ans=0;
    int curr=0;
    for(int i=0;i<st.size();i++)
    {
     
      String cur="";
      cur+=st.elementAt(i);
        
      for(int j=0;j<st.size();j++)
      {
        if(i==j)
          continue;
        else
        {
          String cur2=cur+st.elementAt(j);
          if(!contains(cur2))
          {
            cur+=st.elementAt(j);
           
          }
         
        }
      }
      if(cur.length()>ans)
      {        
        ans=cur.length();
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

