import java.util.Scanner;
public class Main725
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int b=0;
    while(true)
    {
      int n=sc.nextInt();
      if(n==0) break;
      if(b>=1){
      System.out.println();
      }
        
      int[] a=new int[10];
      int number=0;
      for(int p=1234;p<=98765/n;p++)
      {
        int q=p*n;
        boolean flag=p<10000;
        int k=0;
        int count=0;
        if(flag){
          count=1;
          a[0]=0;
          k++;}
        int temp=p;
        
        while(temp>0)
        {
          int digit=temp%10;
          if(!contains(digit,a,k))
          {
            a[k++]=digit;
            count++;
          }
          temp/=10;
        }
        temp=q;
        while(temp>0)
        {
          int digit=temp%10;
          if(!contains(digit,a,k))
          {
            a[k++]=digit;
            count++;
          }
          temp/=10;
        }
        if(count==10)
        {
          number++;
          System.out.println(q+" / "+(flag?("0"+p):p)+" = "+n);
        }
      }
      if(number==0)
      {
        System.out.println("There are no solutions for "+n+".");
      }
      b++;
      
    }
  }
  public static boolean contains(int k,int[] a,int g)
  {
    for(int i=0;i<g;i++)
      if(a[i]==k) return true;
    return false;
  }
}
      

            