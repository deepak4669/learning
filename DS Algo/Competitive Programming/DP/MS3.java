import java.util.*;
public class MS3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int n=sc.nextInt();
        int[][] xy=new int[n][2];
        for(int i=0;i<n;i++)
        {
            xy[i][0]=sc.nextInt();
            xy[i][1]=sc.nextInt();
        }
        long dmax=(xy[0][0]-xy[1][0])*(xy[0][0]-xy[1][0])+(xy[0][1]-xy[1][1])*(xy[0][1]-xy[1][1]);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                dmax=Math.max(dmax,(xy[i][0]-xy[j][0])*(xy[i][0]-xy[j][0])+(xy[i][1]-xy[j][1])*(xy[i][1]-xy[j][1]));


            }
        }
        double ans=Math.sqrt(dmax);
        ans=ans/v;
        System.out.println(String.format("%.6f",ans));
    }
}