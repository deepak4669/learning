import java.util.Scanner;
import java.util.Arrays;
public class FACEFRND
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] f=new int[100*100];
    int[] a=new int[n];
    int ff=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      //System.out.println(a[i]);
      int m=sc.nextInt();
      for(int j=0;j<m;j++)
      {
        
        f[ff]=sc.nextInt();
        //System.out.println(f[ff]);
        ff++;
      }
        
    }
    int count=0;
    int[] friends=new int[10000];
    Arrays.sort(a);
    //Arrays.sort(f);
    for(int i=0;i<ff;i++)
    {
      //System.out.println(f[i]+" "+Arrays.binarySearch(a,f[i]));
      //System.out.println(f[i]+" "+search(a,f[i]));
      if(!search(a,f[i])&&!search(friends,f[i]))
        friends[count++]=f[i];
    }
    System.out.println(count);
  }
  public static boolean search(int[] a,int key)
  {
    for(int i=0;i<a.length;i++)
      if(a[i]==key) return true;
    return false;
  }


}
      