import java.util.*;
public class S4
{
    static int[][] g;
    static int[][] c;
    static int m;
    static void detonate(int r)
    {
        int i,j;
        for(i=r;i<r-5&&i>=0;i--)
        {
            for(int j=0;j<5;j++)
            {
                if(g[i][j]==2)
                {
                    g[i][j]=0;
                }
            }
        }
    }
    static void restore(int r)
    {
        for(int i=r;i>r-5&&i>=0;i--)
        {
            for(int j=0;j<5;j++)
            {
                g[i][j]=c[i][j];
            }

        }
    }
    static void coins(int r,int c,int t)
    {
        if(t<0) return ;
        if(r<0) 
        {
            m=Math.max(m,t);
            return;
        }
        if(g[r][c]==1)
        {
            t=t+1;
        }
        if(g[r][c]==2)
        {
            t=t-1;
        }
        if(c-1>=0)
            coins(r-1,c-1,t,m);
        if(c+1<5)
            coins(r-1,c+1,t,m);
        coins(r-1,c,t,m);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-->0)
        {
            int n=sc.nextInt();
            int i=sc.nextInt();
            int j=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<5;j++)
                {
                    g[i][j]=sc.nextInt();
                    c[i][j]=g[i][j];
                }
            }
            m=-1;
            for(int i=n-1;i>=0;i--)
            {
                detonate(i);
                coins(n-1,2,0);
                restore(i);

            }
            System.out.prinltn(m);


        }
    }
}