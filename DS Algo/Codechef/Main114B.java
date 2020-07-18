import java.util.*;
import java.io.*;

public class Main114B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    for(int i=0;i<n;i++)
    {
      String s=sc.nextLine();
      map.put(s,i);
    }
    int[][] rel=new int[m][2];
    for(int i=0;i<m;i++)
    {
      String x=sc.next();
      String y=sc.next();
      rel[i][0]=map.get(x);
      rel[i][1]=map.get(y);
    }
    int max=0;
    Vector<Integer> sol=new Vector<Integer>();
    Vector<Integer> sol2=new Vector<Integer>();
    for(int i=0;i<=Math.pow(2,n);i++)
    {
      int val=0;
      int j=i;
      int k=0;
      sol=new Vector<Integer>();
     
      while(j>0)
      {
        if(j%2!=0)
        {
          val++;
          sol.add(k);
        }
        k++;
        j/=2;
        
      }
      
      if(val>max)
      {
        boolean flag=true;
        for(int p=0;p<m;p++)
        {
          if(sol.contains(rel[p][0])&&sol.contains(rel[p][1]))
          {
            flag=false;
            break;
          }
        }
        if(!flag)
          continue;
        else
        {
          max=val;
          sol2=new Vector<Integer>();
          for(int w:sol)
            sol2.add(w);
        }
      }
     
    }
    
    String[] Sol=new String[sol2.size()];
    int k=0;
    for(int w:sol2)
    {
      for(String t:map.keySet())
      {
        if(map.get(t)==w)
          Sol[k++]=t;
      }
    }
    Arrays.sort(Sol);
    out.println(Sol.length);
    for(int i=0;i<sol2.size();i++)
      out.println(Sol[i]);
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
