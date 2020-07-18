import java.util.*;
import java.io.*;
public class PHOTOCOM
{
  static char[][] img1;
  static char[][] img2;
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int h1=sc.nextInt();
      int w1=sc.nextInt();
      
      
      String s1=sc.next();
      assert s1.length()==h1*w1;
      
      
      int h2=sc.nextInt();
      int w2=sc.nextInt();
      
      String s2=sc.next();
      assert s2.length()==h2*w2;
      
      char ch1[][]=new char[h1][w1];
      char ch2[][]=new char[h2][w2];
      
      for(int i=0;i<h1;i++)
      {
        for(int j=0;j<w1;j++)
        {
          ch1[i][j]=s1.charAt(i*w1+j);
        }
      }
      /*
      for(int i=0;i<h1;i++)
      {
        for(int j=0;j<w1;j++)
        {
          System.out.print(ch1[i][j]+" ");
        }
        System.out.println();
      }
      */
      
      
      for(int i=0;i<h2;i++)
      {
        for(int j=0;j<w2;j++)
        {
          ch2[i][j]=s2.charAt(i*w2+j);
        }
      }
      /*
      for(int i=0;i<h2;i++)
      {
        for(int j=0;j<w2;j++)
        {
          System.out.print(ch2[i][j]+" ");
        }
        System.out.println();
      }
      */
      
      
      int a1=h2/(gcd(h1,h2));
      int a2=h1/(gcd(h1,h2));
      int b1=w2/(gcd(w1,w2));
      int b2=w1/(gcd(w1,w2));
      
      assert a1*h1==a2*h2&&b1*w1==b2*w2;
      
      
      int rw=0;
      int col=0;
      
      img1=new char[a1*h1][b1*w1];
      img2=new char[a2*h2][b2*w2];
      
      
      for(int i=0;i<h1;i++)
      {
        col=0;
        for(int j=0;j<w1;j++)
        {
          //make(ch1[i][j],i+a1*rw,j+col*b1);
          
          int x=(a1)*rw;
          int y=(b1)*col;
          
          for(int p=0;p<a1;p++)
          {
            for(int q=0;q<b1;q++)
              img1[x+p][y+q]=ch1[i][j];
          }         
          col++;
        }
        rw++;
      }
      rw=0;
      col=0;
      for(int i=0;i<h2;i++)
      {
        col=0;
        for(int j=0;j<w2;j++)
        {
          //make(ch2[i][j],i+a2*rw,j+col*b2);
          int x=(a2)*rw;
          int y=(b2)*col;
          for(int p=0;p<a2;p++)
          {
            for(int q=0;q<b2;q++)
              img2[x+p][y+q]=ch2[i][j];
          }
          col++;
        }
        rw++;
      }
      //img1 img2
      int cnt=0;
      for(int i=0;i<a1*h1;i++)
      {
        for(int j=0;j<b1*w1;j++)
        {
          if(img1[i][j]==img2[i][j])
            cnt++;
        }
      }
      System.out.println(cnt);
    }
  }
  public static int gcd(int a,int b)
  {
    if(a==0) return b;
    else return gcd(b%a,a);
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
          
      
            
             
          
      
    