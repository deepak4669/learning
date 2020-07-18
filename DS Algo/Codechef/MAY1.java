
import java.util.*;
import java.io.*;
public class MAY1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            int ansMax=1;
            int ansMin=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
            {
                int ahead=0;
                int behind=0;
                for(int j=i+1;j<n;j++)
                {
                    if((a[j]-a[j-1])<=2)
                        ahead++;
                    else
                        break;
                }
                for(int j=i-1;j>=0;j--)
                {
                    if((a[j+1]-a[j])<=2)
                        behind++;
                    else
                        break;
                }
                ansMax=Math.max(ansMax,behind+ahead+1);
                ansMin=Math.min(ansMin,behind+ahead+1);

            }
        
            System.out.println(ansMin+" "+ansMax);
        }
    }

}
