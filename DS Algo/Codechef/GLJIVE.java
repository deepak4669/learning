import java.util.Scanner;
public class GLJIVE
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int[] array=new int[10];
    for(int i=0;i<10;i++)
      array[i]=sc.nextInt();
    for(int i=0;i<10;i++)
    {
      int a=array[i];
      int s2=sum+a;
      if(Math.abs(s2-100)<=Math.abs(sum-100))
      {
        sum+=a;
      }
      if(s2>100) break;
    }
    System.out.println(sum);
  }
}
      
        