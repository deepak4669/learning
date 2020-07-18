import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class PT07Y
{
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
  static int[] id;
  public static int find(int p)
  {
    if(p!=id[p])
    {
      id[p]=find(id[p]);
    }
    return id[p];
  }
     
  public static void main(String[] args) 
  {
    FastReader s=new FastReader();
    int n=s.nextInt();
    int m=s.nextInt();
    id=new int[n];
    for(int i=0;i<n;i++)
      id[i]=i;
    
    boolean flag=false;
    while(m>0)
    {
      int a=s.nextInt();
      int b=s.nextInt();
      a-=1;
      b-=1;
      if(find(a)==find(b))
      {
        flag=true;
        break;
      }
      int oa=find(a);
      int ob=find(b);
      id[oa]=ob;
      m=m-1;
    }
    if(flag)
    {
      System.out.println("NO");
    }
    else
    {
      int h=find(0);
      int i=0;
      for(i=0;i<n;i++)
      {
        if(h!=find(i)) break;
      }
      if(i!=n) System.out.println("NO");
      else System.out.println("YES");
    }
  }
}
        
        
    