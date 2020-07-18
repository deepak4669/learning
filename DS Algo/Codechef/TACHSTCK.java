import java.util.Scanner;
import java.util.Arrays;
class TACHSTCK
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int d=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    Arrays.sort(a);
    int count=0;
    for(int i=0;i<n-1;i++)
    {
      if(a[i+1]-a[i]<=d){
        count++;
        i++;
      }
    }
    System.out.println(count);
  }
}
      
      