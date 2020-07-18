import java.util.*;
import java.io.*;

public class Main1108D3
{
  static PrintWriter out=new PrintWriter(System.out);
  static HashMap<Character,Integer> map;
  static HashMap<Integer,Character> map2;
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    map=new HashMap<Character,Integer>();
    map2=new HashMap<Integer,Character>();
    map.put('R',1);
    map.put('G',2);
    map.put('B',3);
    map2.put(1,'R');
    map2.put(2,'G');
    map2.put(3,'B');
    int n=sc.nextInt();
    String s=sc.next();
    char[] ch=s.toCharArray();
    int cnt=0;
    for(int i=0;i<s.length()-1;i++)
    {
      if(ch[i]!=ch[i+1])
        continue;
      else
      {
        int k=i;
        for(k=i+1;k<s.length();k++)
        {
          if(ch[k]==ch[k-1])
            continue;
          else
            break;
        }
        if(k>=s.length()||ch[k]!=ch[k-1]) k--;
        cnt+=(k-i+1)/2;
        int x=map.get(s.charAt(i));
        if(x==1)
          x=2;
        else if(x==2)
          x=3;
        else if(x==3)
          x=1;
        if((k-i+1)%2==0)
        {
          
          if(k+1<s.length())
          {
            x=6-map.get(s.charAt(k))-map.get(s.charAt(k+1));
          }
        }
            
        //out.println(i+" "+k+" ");
        for(int j=i+1;j<=k;j+=2)
          ch[j]=map2.get(x);
        i=k;
      }
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

