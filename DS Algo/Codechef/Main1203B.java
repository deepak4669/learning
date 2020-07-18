import java.util.*;
import java.io.*;
//267630EY
public class Main1203B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    while(q-->0)
    {
      int n=sc.nextInt();
      int[] a=sc.nextIntArray(4*n);
      Arrays.sort(a);
      Vector<Integer> v=new Vector<Integer>();
      for(int i=0;i<a.length;i++)
      {
        if(!v.contains(a[i]))
          v.add(a[i]);
      }
          
      int area=a[0]*a[a.length-1];
      int[] count=new int[10001];
      for(int i=0;i<4*n;i++)
      {
        count[a[i]]++;
      }
     
      int  i=0;
      int j=v.size()-1;
      boolean flag=true;
      while(i<=j)
      {
        if(count[v.elementAt(i)]!=count[v.elementAt(j)]||count[v.elementAt(i)]%2!=0||count[v.elementAt(j)]%2!=0||v.elementAt(i)*v.elementAt(j)!=area)
        {
          flag=false;
          break;
        }
        if(i==j)
        {
          if(count[v.elementAt(i)]%4!=0||area!=v.elementAt(i)*v.elementAt(i))
            flag=false;
        }
          
        i++;
        j--;
      }
      if(!flag)
        out.println("NO");
      else
        out.println("YES");
      
            
          
          
     
      
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

