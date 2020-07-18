import java.util.*;
import java.io.*;

public class Main75B
{
  static PrintWriter out=new PrintWriter(System.out);
  static class friend implements Comparable<friend>
  {
    String a;
    int x;
    public friend(String s,int a)
    {
      this.a=s;
      this.x=a;
    }
    public int compareTo(friend that)
    {
      if(this.x<that.x) return -1;
      else if(this.x>that.x) return +1;
      else if(this.a.compareTo(that.a)>0) return -1;
      else if(this.a.compareTo(that.a)<0) return +1;
      else return 0;
    }
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    int n=sc.nextInt();
    Vector<friend> a=new Vector<friend>();
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    map.put("posted",15);
    map.put("commented",10);
    map.put("likes",5);
    for(int i=0;i<n;i++)
    {
      String a1=sc.next();
      String a2=sc.next();
      String a3="";
      if(a2.equals("commented")||a2.equals("posted"))
        a3=sc.next();
      String a4=sc.next();
      String a5=sc.next();
      //System.out.println(a1+" "+a4);
      a4=a4.substring(0,a4.length()-2);
      if(a1.equals(name))
      {
        boolean flag=false;
        for(friend f:a)
        {
          if(f.a.equals(a4))
          {
            f.x+=(map.get(a2));
            flag=true;
            break;
          }
        }
        if(!flag)
        {
          friend f=new friend(a4,map.get(a2));
          a.add(f);
        }
      }
      else if(a4.equals(name))
      {
        boolean flag=false;
        for(friend f:a)
        {
          if(f.a.equals(a1))
          {
            f.x+=(map.get(a2));
            flag=true;
            break;
          }
        }
        if(!flag)
        {
          friend f=new friend(a1,map.get(a2));
          a.add(f);
        }
      }
      else
      {
        boolean flag=false;
        for(friend f:a)
        {
          if(f.a.equals(a1))
          {
            //f.x+=(map.get(a2));
            flag=true;
            break;
          }
        }
        if(!flag)
        {
          friend f=new friend(a1,0);
          a.add(f);
        }
        flag=false;
        for(friend f:a)
        {
          if(f.a.equals(a4))
          {
            //f.x+=(map.get(a2));
            flag=true;
            break;
          }
        }
        if(!flag)
        {
          friend f=new friend(a4,0);
          a.add(f);
        }
      }
    }
    Collections.sort(a);
    String ans[]=new String[a.size()];
    int k=0;
    for(friend f:a)
    {
      ans[k++]=f.a;
      //System.out.println(f.a+" "+f.x);
    }
    for(int i=k-1;i>=0;i--)
    {
      out.println(ans[i]);
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

