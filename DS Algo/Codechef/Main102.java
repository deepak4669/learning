import java.util.Scanner;
public class Main102
{
  public static void main(String[] args)
  {
    String[] bin={"BCG","BGC","CBG","CGB","GBC","GCB"};
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt())
    {
      int[] a=new int[9];
      
      for(int i=0;i<9;i++)
        a[i]=sc.nextInt();
      int min=a[1]+a[2]+a[3]+a[4]+a[6]+a[8];
      
      int ans=0;
      for(int i=1;i<6;i++)
      {
        String s=bin[i];
        int p=f(s.charAt(0));
        int q=f(s.charAt(1))+3;
        int r=f(s.charAt(2))+6;
        int sum=(a[0]+a[1]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8])-a[p]-a[q]-a[r];
        //System.out.println(sum);
        //System.out.println(min);
        
        if(sum<min){
          ans=i;
          min=sum;
        }
      }
      System.out.println(bin[ans]+" "+min);
    }
  }
  public static int f(Character ch)
  {
    if(ch=='B') return 0;
    else if(ch=='G') return 1;
    else return 2;
  }
}
        
        
      
      