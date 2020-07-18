import java.util.*;
import java.io.*;

class Main151B
{
  static PrintWriter out=new PrintWriter(System.out);
  static class set implements Comparable<set>    
  {
    int a;
    int i;
    String s;
    public set(int i,int a,String s)
    {
      this.i=i;
      this.a=a;
      this.s=s;
    }
    public int compareTo(set that)
    {
      if(this.a<that.a) return -1;
      else if(this.a>that.a) return +1;
      else if(this.i<that.i) return +1;
      else if(this.i>that.i) return -11;
      else return 0;
    }
  }
        
      
      
    
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] name=new String[n];
    set[] taxi=new set[n];
    set[] pizza=new set[n];
    set[] girl=new set[n];
    for(int i=0;i<n;i++)
    {
      int s=sc.nextInt();
      name[i]=sc.next();
      int t=0;
      int p=0;
      int g=0;
      for(int j=0;j<s;j++)
      {
        String st=sc.next();
        String x=st.substring(0,2);
        String y=st.substring(3,5);
        String z=st.substring(6,8);
        
        int a1=Integer.parseInt(st.substring(0,1));
        int a2=Integer.parseInt(st.substring(1,2));
        int a3=Integer.parseInt(st.substring(3,4));
        int a4=Integer.parseInt(st.substring(4,5));
        int a5=Integer.parseInt(st.substring(6,7));
        int a6=Integer.parseInt(st.substring(7,8));
        if(a1==a2&&a2==a3&&a3==a4&&a4==a5&&a5==a6)
          t++;
        else if(a1>a2&&a2>a3&&a3>a4&&a4>a5&&a5>a6)
          p++;
        else
          g++;
      
      }
      taxi[i]=new set(i,t,name[i]);
      pizza[i]=new set(i,p,name[i]);
      girl[i]=new set(i,g,name[i]);
    }
    Arrays.sort(taxi);
    Arrays.sort(pizza);
    Arrays.sort(girl);
    out.print( "If you want to call a taxi, you should call: ");
    int x=taxi[n-1].a;
    int i=n-1;
    int k=1;
    while(i>=0&&x==taxi[i].a)
    {
      if(k==1)
        out.print(taxi[i].s);
      else
        out.print(", "+taxi[i].s);
      i--;
      k++;
    }
    out.print(".");
    out.println();
    out.print("If you want to order a pizza, you should call: ");
    x=pizza[n-1].a;
    i=n-1;
    k=1;
    while(i>=0&&x==pizza[i].a)
    {
      if(k==1)
        out.print(pizza[i].s);
      else
        out.print(", "+pizza[i].s);
      k++;
      i--;
    }
    out.print(".");
    out.println();
    out.print( "If you want to go to a cafe with a wonderful girl, you should call: ");
    x=girl[n-1].a;
    i=n-1;
    k=1;
    while(i>=0&&x==girl[i].a)
    {
      if(k==1)
        out.print(girl[i].s);
      else
        out.print(", "+girl[i].s);
      k++;
      i--;
    }
    out.print(".");
    out.println();
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

