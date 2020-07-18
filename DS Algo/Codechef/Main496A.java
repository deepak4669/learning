import java.util.Scanner;
public class Main496A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int min=10000000;
    int index=0;
    for(int i=1;i<n-1;i++)
    {
      if(a[i+1]-a[i-1]<min)
      {
        min=a[i+1]-a[i-1];
        index=i;
      }
    }
    int max=0;
    for(int i=0;i<n-1;i++)
    {
      if(i==index-1)
      {
        if((a[index+1]-a[index-1])>max)
          max=a[index+1]-a[index-1];
        i++;
      }
      else
      {
        if(a[i+1]-a[i]>max) max=a[i+1]-a[i];
      }
    }
    
    System.out.println(max);
  }
}