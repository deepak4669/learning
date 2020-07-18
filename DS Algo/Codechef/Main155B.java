import java.util.*;
import java.io.*;

class Main155B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static class Card implements Comparable<Card>
  {
    int a;
    int b;
    public Card(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(Card that)
    {
      if(that.b>this.b) return +1;
      else if(that.b<this.b) return -1;
      else if(that.a>this.a) return +1;
      else if(that.a<this.a) return -1;
      else
        return 0;
    }
  }
    
        
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Card[] cards=new Card[n];
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
                       
      cards[i]=new Card(a,b);
    }
    Arrays.sort(cards);
    long sum=0;
    int counter=1;
    for(int i=0;i<n;i++)
    {
      if(counter>=1)
      {
        sum+=cards[i].a;
        counter=counter-1+cards[i].b;
      }
      else
      {
        break;
      }
    }
    out.println(sum);
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

