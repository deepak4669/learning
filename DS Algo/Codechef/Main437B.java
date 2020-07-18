import java.util.*;
import java.io.*;

class Main437B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int sum=sc.nextInt();
    int limit=sc.nextInt();
    Vector<Integer> sol=new Vector<Integer>();
    int ones;
    if(limit%2==0)
      ones=limit/2;
    else
      ones=(limit/2)+1;
      
   if(sum<=ones)
    {
      int x=1;
      out.println(sum);
      for(int i=1;i<=sum;i++)
      {
        out.print(x+" ");
        x+=2;
      }
    }
    else
    {
      int x=limit;
      while(sum>ones&&x>=1)
      {
        if(x%2==0)
        {
          int n=x;
          int k=0;
          while(n>0)
          {
            if(n%2==1)
            {
              break;
            }
            n/=2;
            k++;
          }
          int pow=(int)Math.pow(2,k);
          if(pow>sum)
            continue;
          else
          {
            //out.println(pow);
            sum-=pow;
            sol.add(x);
          }
        }
        x--;
      }
      int p=1;
      if(sum>ones)
        out.println(-1);
      else
      {
      
        for(int i=0;i<sum;i++)
        {
          
        
          sol.add(p);
        p+=2;
        }
        out.println(sol.size());
        for(int j:sol)
          out.print(j+" ");
      }
      
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

