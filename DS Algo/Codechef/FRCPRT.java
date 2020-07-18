import java.util.*;
import java.io.*;
public class FRCPRT
{
  static PrintWriter out=new PrintWriter(System.out);
  public static void moveLeft()
  {
    for(int j=0;j<n;j++)
    {
      int count=0;
      for(int k=0;k<m;k++)
      {
        if(sA[j][k]=='1')
          count++;
      }
      for(int k=0;k<m;k++)
      {
        if(count==0) sA[j][k]='0';
              else{
                sA[j][k]='1';
                count-=1;
              }
      }
    }
  }
  public static void moveRight()
  {
    for(int j=0;j<n;j++)
          {
            int count=0;
            for(int k=0;k<m;k++)
            {
              if(sA[j][k]=='1')
                count++;
            }
            for(int k=0;k<m;k++)
            {
              if(m-k==count)
              {
                sA[j][k]='1';
                count-=1;
              }
              else{
                sA[j][k]='0';
              }
            }
          }
  }
  public static void moveUp()
  {
    for(int j=0;j<m;j++)
          {
            int count=0;
            for(int k=0;k<n;k++)
            {
              if(sA[k][j]=='1')
                count++;
            }
            for(int k=0;k<n;k++)
            {
              if(count==0) sA[k][j]='0';
              else{
                sA[k][j]='1';
                count-=1;
              }
            }
          }
  }
  public static void moveDown()
  {
     for(int j=0;j<m;j++)
          {
            int count=0;
            for(int k=0;k<n;k++)
            {
              if(sA[k][j]=='1')
                count++;
            }
            for(int k=0;k<n;k++)
            {
              if(n-k==count)
              {
                sA[k][j]='1';
                count-=1;
              }
              else{
                sA[k][j]='0';
              }
            }
          }
        }

  static int n,m;
  static char[][] sA;
  
  public static void main(String[] args) throws IOException
  {
    try{
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    while(t-->0)
    {
      n=sc.nextInt();
      m=sc.nextInt();
      int[][] a=new int[n][m];
      String[] s=new String[n];
      sA=new char[n][m];
      for(int i=0;i<n;i++)
      {
        s[i]=sc.next();
        sA[i]=s[i].toCharArray();
      }
      String dir=sc.next();
      String effDir="";
      if(dir.length()<=2)  effDir=""+dir;
      else
      {
        effDir=""+dir.charAt(0);
        char j=dir.charAt(dir.length()-1);
        for(int i=dir.length()-2;i>=1;i--)
        {
          if(j=='L'||j=='R')
          {
            if(dir.charAt(i)=='U'||dir.charAt(i)=='D')
            {
              effDir+=""+dir.charAt(i);
              break;
            }
            else continue;
          }
          if(j=='U'||j=='D')
          {
            if(dir.charAt(i)=='L'||dir.charAt(i)=='R')
            {
              effDir+=""+dir.charAt(i);
              break;
            }
            else continue;
          }
        }
        effDir+=""+j;
      }
            
            
          
      for(int i=0;i<effDir.length();i++)
      {
        char ch=effDir.charAt(i);
        
        if(ch=='L')
        {
          moveLeft();
          
        }
        else if(ch=='R')
        {
          moveRight();
        }
        else if(ch=='U')
        {
          moveUp();
          
        }
        else if(ch=='D')
        {
          moveDown();
        }
         
      }
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<m;j++)
        {
          out.print(sA[i][j]);
        }
        out.println();
      }
      out.flush();
    }
    }catch(Exception e){
      return;
    }
  }
static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
            
            
            