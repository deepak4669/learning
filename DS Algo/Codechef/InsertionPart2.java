import java.util.Scanner;
public class InsertionPart2
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    for(int i=1;i<n;i++)
    {
      for(int j=i;j>=0;j--)
      {
        if(a[j]<a[j-1])
        {
          int swap=a[j];
          a[j]=a[j-1];
          a[j-1]=swap;
        }
        else break;        
      }
      for(int j=0;j<n;j++)
        System.out.print(a[j]+" ");
      System.out.println();
    }
  }
}
      
          
                     
  
  