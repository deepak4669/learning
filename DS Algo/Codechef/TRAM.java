import java.util.Scanner;
public class TRAM
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int max=0;
    int left=0;
    int took=0;
    int curr_cap=0;
    for(int i=0;i<n;i++)
    {
      left=sc.nextInt();
      took=sc.nextInt();
      curr_cap=(curr_cap-left+took);
      if(curr_cap>max) max=curr_cap;
    }
    System.out.println(max);
  }
}
  