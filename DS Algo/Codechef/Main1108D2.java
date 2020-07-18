import java.util.*;
import java.io.*;

public class Main1108D2
{
  static PrintWriter out=new PrintWriter(System.out);
  static char[] ch;
  static HashMap<Integer,Character> map=new HashMap<Integer,Character>();
  static HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
  static int solve(int x,int prev)
  {
    if(x>=ch.length-1)
      return prev;
    if(ch[x]==ch[x+1])
    {
      //prev++;
      prev++;
      if(ch[x]=='R')
      {
        ch[x+1]='G';
        int x1=solve(x+1,prev);
        ch[x+1]='B';
        int x2=solve(x+1,prev);
        if(x1<x2)
        {
          ch[x+1]='G';
          return x1+prev;
        }
        else
        {
          ch[x+1]='B';
          return x2+prev;
        }
      }
      else if(ch[x]=='G')
      {
        ch[x+1]='R';
        int x1=solve(x+1,prev);
        ch[x+1]='B';
        int x2=solve(x+1,prev);
        if(x1<x2)
        {
          ch[x+1]='R';
          return x1+prev;
        }
        else
        {
          ch[x+1]='B';
          return x2+prev;
        }
      }
      else if(ch[x]=='B')
      {
        ch[x+1]='R';
        int x1=solve(x+1,prev);
        ch[x+1]='G';
        int x2=solve(x+1,prev);
        if(x1<x2)
        {
          ch[x+1]='R';
          return x1+prev;
        }
        else
        {
          ch[x+1]='G';
          return x2+prev;
        }
      }
    }
    
      return solve(x+1,prev);
  }
        
        
        
                     
          
          
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    
    map.put(1,'R');
    map.put(2,'G');
    map.put(3,'B');
   
    map2.put('R',1);
    map2.put('G',2);
    map2.put('B',3);
    ch=s.toCharArray();
    out.println(solve(0,0));
    out.println(ch);
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

