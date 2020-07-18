import java.util.*;
import java.io.*;
public class TABGAME4
{
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    while(p-->0)
    {
      
      String s=sc.next();
      String t=sc.next();
      
      int m=s.length();
      int n=t.length();
      //System.out.println(s);
      //System.out.println(t);
      
      char[][] ans=new char[3][m+1];     
      char[][] col=new char[n+1][3];
      if(n==1)
      {
        char[] ans2=new char[m+1];
        
        ans2[1]=s.charAt(0)=='0'||t.charAt(0)=='0'?'A':'B';
        for(int i=2;i<=m;i++)
        {
          if(s.charAt(i-1)=='0'||ans2[i-1]=='B')
            ans2[i]='A';
          else
            ans2[i]='B';
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
          int x=sc.nextInt();
          int y=sc.nextInt();
          System.out.print(ans2[y]=='A'?1:0);
        }
        System.out.println();
      }
      else if(m==1)
      {
        char[] ans2=new char[n+1];
        ans2[1]=(s.charAt(0)=='0'||t.charAt(0)=='0'?'A':'B');
        for(int i=2;i<=n;i++)
        {
          if(t.charAt(i-1)=='0'||ans2[i-1]=='B')
            ans2[i]='A';
          else
            ans2[i]='B';
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
          int x=sc.nextInt();
          int y=sc.nextInt();
          System.out.print((ans2[x]=='A'?1:0));
        }
        System.out.println();
      }
            
        
        
      else{
      for(int i=1;i<=2;i++)
      {
                       
        for(int j=1;j<=m;j++)
        {
          if(i-1==0&&j-1==0)
          {
            //System.out.println(s.charAt(i-1)+" "+t.charAt(i-1));
            if(s.charAt(0)=='0'||t.charAt(0)=='0')
            {
              //System.out.println("s");
              
              ans[i][j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[i][j]='B';
            
          }
          else if(i-1==0)
          {
            assert (j-1)!=0;
            if(s.charAt(j-1)=='0'||ans[i][j-1]=='B')
              ans[i][j]='A';
            else
              ans[i][j]='B';
            
          }
          else if(j-1==0)
          {
            assert (i-1)!=0;
            if(t.charAt(i-1)=='0'||ans[i-1][j]=='B')
            {
              ans[i][j]='A';
              //System.out.println(ans[i][j]);
            }
            else
              ans[i][j]='B';
            
          }
          else
          {
            if(ans[i-1][j]=='B'||ans[i][j-1]=='B')
              ans[i][j]='A';
            else
              ans[i][j]='B';
            
          }
          
        }
       
      }
      /*
      for(int i=1;i<=2;i++)
      {
        for(int j=1;j<=m;j++)
          System.out.print(ans[i][j]);
        System.out.println();
      }
      */
      //System.out.println(ans.toString());
      
      for(int j=1;j<=2;j++)
      {
        for(int i=1;i<=n;i++)
        {
          if(i-1==0&&j-1==0)
          {
            if(s.charAt(0)=='0'||t.charAt(0)=='0')
              col[i][j]='A';
            else
              col[i][j]='B';
          }
          else if(j-1==0)
          {
            if(t.charAt(i-1)=='0'||col[i-1][j]=='B')
              col[i][j]='A';
            else
              col[i][j]='B';
          }
          else if(i-1==0)
          {
            if(s.charAt(j-1)=='0'||col[i][j-1]=='B')
              col[i][j]='A';
            else
              col[i][j]='B';
          }
          else
          {
            if(col[i-1][j]=='B'||col[i][j-1]=='B')
              col[i][j]='A';
            else
              col[i][j]='B';
          }
        }
      }
      /*
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=2;j++)
        {
          System.out.print(col[i][j]);
        }
        System.out.println();
      }
      */
      //System.out.println(col.toString());
      int q=sc.nextInt();
      assert ans[2][2]==col[2][2]&&ans[1][1]==col[1][1]&&ans[1][2]==col[1][2]
        &&ans[2][1]==col[2][1];
      
      for(int i=0;i<q;i++)
      {
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<=2)
        {
          System.out.print((ans[x][y]=='A'?1:0));
        }
        else if(y<=2)
        {
          System.out.print((col[x][y]=='A'?1:0));
        }
        else if(x==y)
        {
          System.out.print((col[2][2]=='A'?1:0));
        }
        else if(x>y)
        {
          System.out.print((col[x-y+2][2]=='A'?1:0));
        }
        else
          System.out.print((ans[2][y-x+2]=='A'?1:0));
      }
      System.out.println();
      }
    }
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
                           
                          