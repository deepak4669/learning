import java.util.*;
import java.io.*;

public class Main96B
{
  static PrintWriter out=new PrintWriter(System.out);
  //next_Permutation
  private static Integer[] nextPermutation(Integer[] a)
  {
    int first=getFirst(a);
    if(first==-1)
      return null;
    int toSwap=a.length-1;
    while(a[first].compareTo(a[toSwap])>=0)
      --toSwap;
    swap(a,first++,toSwap);
    toSwap=a.length-1;
    while(first<toSwap)
    {
      swap(a,first++,toSwap--);
    }
    return a;
  }
  private static int getFirst(Integer[] a)
  {
    for(int i=a.length-2;i>=0;i--)
    {
      if(a[i].compareTo(a[i+1])<0)
        return i;
    }
    return -1;
  }
  private static void swap(Integer[] a, int i,int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    String ans="";
    if(n.length()%2==0)
    {
      String max="";
      for(int i=0;i<n.length()/2;i++)
        max+="7";
      for(int i=0;i<n.length()/2;i++)
        max+="4";
      if(Long.parseLong(n)>=Long.parseLong(max))
      {
        int x=(n.length()+2)/2;
        for(int i=0;i<x;i++)
          ans+="4";
        for(int i=0;i<x;i++)
          ans+="7";
      }
      else
      {
        int x=n.length()/2;
        Integer[] a=new Integer[2*x];
        for(int i=0;i<x;i++)
          a[i]=4;
        for(int i=x;i<2*x;i++)
          a[i]=7;
        while(a!=null)
        {
          String s="";
          for(int i=0;i<2*x;i++)
            s+=a[i];
          if(Long.parseLong(s)>=Long.parseLong(n))
          {
           
            ans+=s;
            break;
          }
          a=nextPermutation(a);
        }
      }
    }
    else
    {
      int x=(n.length()+1)/2;
      for(int i=0;i<x;i++)
        ans+="4";
      for(int i=0;i<x;i++)
        ans+="7";
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

