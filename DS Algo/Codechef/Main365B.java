import java.util.Scanner;
public class Main365B
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    
    if(n==1)
      System.out.println(1);
    else if(n==2)
      System.out.println(2);
      
    else{
      int lo=0;
      int ro=2;
      int maxLength=2;
      //int length=2;
      boolean flag=false;
      for(;ro<n;ro++)
      {
        if(a[ro]==(a[ro-1]+a[ro-2]))
        {
          //ro++;
          //length++;
          if(flag) lo++;
          flag=false;
          if(ro-lo+1>maxLength){
            //System.out.println(ro);
            maxLength=ro-lo+1;
          }
        }
        else
        {
          lo=ro-2;
          flag=true;
          
        }
      }
      //System.out.println(lo+" "+ro);
      System.out.println(maxLength);
    }
  }
}
