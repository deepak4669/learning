import java.util.*;
import java.io.*;

class Main342B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int s=sc.nextInt();
    int f=sc.nextInt();
    
    Vector<Character> ans=new Vector<Character>();
    int[] l=new int[m];
    int[] t=new int[m];
    int[] r=new int[m];
    for(int i=0;i<m;i++)
    {
      t[i]=sc.nextInt();
      l[i]=sc.nextInt();
      r[i]=sc.nextInt();
    }
    int step=1;
    
    while(s!=f)
    {
      int id=-1;      
      id=Arrays.binarySearch(t,step);      
      if(id>=0)
      {
        if(s<f)
        {
          if(l[id]>s+1||r[id]<s)
          {
            ans.add('R');
            s++;
          }
          else
            ans.add('X');
          
        }
        else
        {
          if(r[id]<s-1||l[id]>s)
          {
            ans.add('L');
            s--;
          }
          else
            ans.add('X');
          
        }
       step++; 
      }
      else
      {
        if(s<f){
          ans.add('R');
          s++;
        }
        else {
          ans.add('L');
          s-=1;
        }
        step++;
      }
        
      
    }
    
    for(char ch:ans)
      out.print(ch);
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

