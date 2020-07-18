import java.util.*;
public class MS2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int m=sc.nextInt();
        Queue<pair> queue=new Queue<pair>();
        pair v=new pair(2,0);
        queue.add(v);
        int ans=0;
        while(queue.size()!=0)
        {
            v=queue.pop();
            ans=(ans+1)%m;
            if(v.b+1<l)
            {
                int y=(v.a*v.a+1)%m;
                for(int i=0;i<y;i++)
                {
                    queue.add(new pair(i,v.b+1));
                }
            }


        }
        System.out.println(ans);
    }
}