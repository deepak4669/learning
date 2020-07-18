import java.util.Scanner;
public class LOTTERY
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long ans=0;
    int[] a=new int[5];
    while(ans!=n)
    {
      if((ans+100)<=n)
      {
        ans+=100;
        a[4]++;
      }
      else if((ans+20)<=n)
      {
        ans+=20;
        a[3]++;
      }
      else if(ans+10<=n)
      {
        ans+=10;
        a[2]++;
      }
      else if(ans+5<=n)
      {
        ans+=5;
        a[1]++;
      }
      else if(ans+1<=n)
      {
        ans+=1;
        a[0]++;
      }
    }
    int notes=0;
    for(int i=0;i<5;i++)
      notes+=a[i];
    System.out.println(notes);
  }
}
      