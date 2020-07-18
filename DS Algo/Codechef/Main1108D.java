import java.util.*;
import java.io.*;

public class Main1108D
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    HashMap<Integer,Character> map=new HashMap<Integer,Character>();
    map.put(1,'R');
    map.put(2,'G');
    map.put(3,'B');
    HashMap<Character,Integer> map2=new HashMap<Character,Integer>();
    map2.put('R',1);
    map2.put('G',2);
    map2.put('B',3);
    char[] ch=s.toCharArray();
    int cnt=0;
    for(int i=1;i<ch.length-1;i++)
    {
      if(ch[i-1]==ch[i]||ch[i]==ch[i+1])
      {
        if(ch[i-1]==ch[i+1])
        {
          if(ch[i-1]=='R')
          {
            ch[i]='G';
          }
          else if(ch[i-1]=='G')
          {
            ch[i]='B';
          }
          else
            ch[i]='R';
        }
        else
        {
          int x=6-map2.get(ch[i-1])-map2.get(ch[i+1]);
          ch[i]=map.get(x);
        }
        cnt++;
        
      }
      i++;
    }
    out.println(cnt);
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

