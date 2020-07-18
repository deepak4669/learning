import java.util.*;
public class S2
{
    static int h;
    static int[] t;
    static int[] e;
    static int ans=Integer.MAX_VALUE;

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int testC=sc.nextInt();
        while(testC-->0)
        {
            int h=sc.nextInt();
            int d=sc.nextInt();
            t=new int[5];
            e=new int[5];
            for(int i=0;i<5;i++)
            {
                t[i]=sc.nextInt();
                e[i]=sc.nextInt();
            }
            for(int i=0;i<5;i++)
            {
                move(d,h,0,i);
            }
            System.out.println(ans);

        }
        

    }
    public static void move(int d,int h,int ti,int i)
    {
        if(ti>ans||h<0)
            return;
        if(d==0)
        {
            ans=Math.min(ans,ti);
            return;

        }
        for(i=0;i<5;i++)
        {
            move(d-1,h-e[i],ti+t[i],i);
        }
    }
}