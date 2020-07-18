import java.util.Scanner;
public class Main334A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int candies=((n*n)*(n*n+1))/2;
    int perCan=candies/n;
    int i=0;
    int j=0;
    int k=1;
    while(i<n)
    {
      j=0;
      while(j<n/2)
      {
        System.out.print(k+" "+(n*n+1-k)+" ");
        k++;
        j++;
      }
      System.out.println();
      i++;
    }
  }
  
        
  
}