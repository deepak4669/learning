import java.util.*;
public class ANDSQR2
{
  static int[] A;
  static int[][] st;
  static int q;
  static int n;
  static int col;
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      n=sc.nextInt();
      A=new int[n];
      q=sc.nextInt();
      for(int i=0;i<n;i++)
        A[i]=sc.nextInt();
      precompute();
      /*
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<col;j++)
          System.out.print(st[i][j]);
        System.out.println();
      }*/
      for(int i=0;i<q;i++)
      {
        int lo=sc.nextInt();
        int ro=sc.nextInt();
        lo--;
        ro--;
        int lo2=lo;
        int count=0;
        for(int j=col;j>=0;j--)
        {
          if((1<<j)<=ro-lo2+1)
          {
            count+=st[lo2][j];
            lo2+=(1<<j);
          }
        }
        //System.out.println(Math.ceil(Math.log(ro+1-lo)/Math.log(2)));
        //System.out.println(Math.floor(Math.log(ro+1-lo)/Math.log(2)));
        if(!((int)Math.ceil(Math.log(ro+1-lo)/Math.log(2))==(int)Math.floor(Math.log(ro+1-lo)/Math.log(2))))
        {
          //System.out.println("DDD");
          int g=A[lo];
          for(int j=lo;j<=ro;j++)
            g&=A[j];
          if(perfect(g))
            count++;
        }
          
        System.out.println(count);
      }
    }
  }
  public static void precompute()
  {
    col=(int)Math.ceil(Math.log(n)/Math.log(2))+2;
    st=new int[n][col];
    //st[0][0]=A[0];
    for(int i=0;i<n;i++)
      st[i][0]=perfect(A[i])?1:0;
    for(int j=1;j<=col;j++)
    {
      for(int i=0;i+(1<<j)<=n;i++)
      {
        st[i][j]=func(i,j);
      }
    }
  }
  public static int func(int a, int b)
  {
    int lo=a;
    int ro=a+(int)Math.pow(2,b)-1;
    int cnt=0;
    for(int i=lo;i<=ro;i++)
    {
      int p=A[i];
      for(int j=i;j<=ro;j++)
      {
        p=p&A[j];
        //System.out.println(p);
        if(perfect(p))
          cnt++;
      }
    }
    return cnt;
  }
          
        
        
  
  public static boolean perfect(int c)
  {
    int d=(int)Math.sqrt(c);
    if(d*d==c) return true;
    else return false;
  }
}
                      
      