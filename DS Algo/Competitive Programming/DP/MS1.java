import java.util.*;
import java.io.*;
public class MS1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String s=sc.nextLine();
            if(s.equals("0")) break;
            int[] count=new int[128];
            for(int i=0;i<s.length();i++)
            {
                count[(int)s.charAt(i)]++;
            }
            int d=0;
            for(int i=0;i<128;i++)
            {
                d+=count[i]%2;
            }
            if(d>1)
            {
                System.out.println("Impossible");
            }
            else
            {
                int ans=0;
                int n=s.length();
                char[] t=s.toCharArray();
                for(int i=0;i<n/2;i++)
                {
                    if(t[i]!=t[n-i-1])
                    {
                        int j;
                        int k;
                        for(j=i+1;t[j]!=t[n-i-1];j++);
                        for(k=n-i-2;t[k]!=t[i];k--);
                        ans+=Math.min(j-i,n-i-1-k);
                        if(j-i<n-i-k)
                        {
                            char a=t[j];
                            for(int p=j;p>i;p--)
                            {
                                t[p]=t[p-1];
                            }
                            t[i]=a;
                        }
                        else
                        {
                            char a=t[k];
                            for(int p=k;p<n-i-1;p++)
                            {
                                t[p]=t[p+1];
                            }
                            t[n-i-1]=a;
                        }
                    }

                }
                System.out.println(ans);
            }
            
        }
    }
}