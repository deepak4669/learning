import java.io.*;
import java.util.*;
public class S1
{
    static int[][] a;
    static int level=0;
    static boolean[][] marked;
    static int n;
    static int m;
    static boolean flag;
    static void dfs(int i,int j)
    {
        marked[i][j]=true;
        if(a[i][j]==3)
        {
            flag=true;
            return;
        }
        if(j-1>0&&!marked[i][j-1]&&(a[i][j-1]==1||a[i][j-1]==3))
            dfs(i,j-1);
        if(j+1<=m&&!marked[i][j+1]&&(a[i][j+1]==1||a[i][j+1]==3))
            dfs(i,j+1);
        int h=1;
        while(h<=level&&i+h<=n)
        {
            if((a[i+h][j]==1||a[i+h][j]==3)&&!marked[i+h][j])
            {
                dfs(i+h,j);
            }
            h++;
        
        }
        h=1;
        while(h<=level&&i-h>0)
        {
            if((a[i-h][j]==1||a[i-h][j]==3)&&!marked[i-h][j])
            {
                dfs(i-h,j);
            }
            h++;
        }


    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=new int[n+1][m+1];
        marked=new boolean[n+1][m+1];
        level=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                a[i][j]=sc.nextInt();

            }
        }
        while(true)
        {
            flag=false;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=m;j++)
                {
                    marked[i][j]=false;
                }

            }
            dfs(n,1);
            if(flag)
            {
                System.out.println(level);
                break;

            }
            level++;
        }

    }


}