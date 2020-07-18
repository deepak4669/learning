import java.util.Scanner;
public class EULER1
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
      long N=sc.nextLong();
      long n,M,k;
      if(N%3==0) n=(N/3)-1;
      else n=(N/3);
      if(N%5==0) M=(N/5)-1;
      else M=(N/5);
      if(N%15==0) k=(N/15)-1;
      else k=(N/15);
      long sum = (long)(n*(3+3*n))/2+(long)(M*(5+5*M))/2-(long)(k*(15+15*k))/2;
      System.out.println(sum);
    }
              
  }
}

