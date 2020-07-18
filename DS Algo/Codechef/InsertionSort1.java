import java.util.Scanner;
public class InsertionSort1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int e=a[n-1];
    for(int i=n-2;i>=0;i--)
    {
      if(a[i]>e) a[i+1]=a[i];
      else if(a[i]<=e){
        a[i+1]=e;
        break;
      }
      for(int j=0;j<n;j++)
        System.out.print(a[j]+" ");
      System.out.println();
    }
    if(e<a[0]) a[0]=e;
    for(int j=0;j<n;j++)
        System.out.print(a[j]+" ");
    System.out.println();
  }
}
      
      
      