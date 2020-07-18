import java.util.Scanner;
public class BeautifulMatrix
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int posi=0,posj=0;
    for(int i=0;i<5;i++)
    {
      for(int j=0;j<5;j++)
      {
        int a=sc.nextInt();
        if(a==1){
          posi=i;
          posj=j;
        }
      }
    }
    int manhattan=Math.abs(2-posi)+Math.abs(2-posj);
    System.out.println(manhattan);
  }
}
        