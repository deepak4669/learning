import java.util.*;
public class ThreesumFaster
{
  public static void main(String[] args)
  {
    int a[]={5,8,-2,-8,0,3};
    int ans=Threesum(a);
    System.out.println(ans);
  }
  
  public static int Threesum(int[] a)
  {
    int n=a.length;
    Arrays.sort(a);
    int count=0;
    for(int i=0;i<n-1;i++)
    {
      int j=i+1;
      int k=n-1;
      while(k>j)
      {
        if((a[j]+a[k])==-a[i])
        {
          j++;
          count++;
        }
        else if((a[j]+a[k])>(-a[i]))
          k--;
        else
          j++;
      }
    }
    return count;
  }
}
    
      