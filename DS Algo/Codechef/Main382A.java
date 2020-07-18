import java.util.*;
import java.io.*;
//267630EY
public class Main382A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String rem=sc.next();
    String l=s.substring(0,s.indexOf("|"));
    
    String r=s.substring(s.indexOf("|")+1,s.length());
    
    
    if(l.length()==r.length())
    {
      if(rem.length()%2==0)
      {
        int x=rem.length()/2;
        String l_ans=l+rem.substring(0,x);
        String r_ans=r+rem.substring(x,rem.length());
        out.println(l_ans+"|"+r_ans);
        
      }
      else
        out.println("Impossible");
    }
    else
    {
      if(rem.length()>=Math.abs(l.length()-r.length()))
      {
        if((rem.length()-Math.abs(l.length()-r.length()))%2==0)
        {
          int x=Math.abs(r.length()-l.length());
          int y=x+(rem.length()-x)/2;
          if(l.length()>r.length())
          {
            
            String r_ans=r+rem.substring(0,y);
            String l_ans=l+rem.substring(y,rem.length());
            out.println(l_ans+"|"+r_ans); 
          }
          else
          {
            String l_ans=l+rem.substring(0,y);
            String r_ans=r+rem.substring(y,rem.length());
            out.println(l_ans+"|"+r_ans);
          }
            
        }
        else
          out.println("Impossible");
          
      }
      else
      {
        out.println("Impossible");
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
