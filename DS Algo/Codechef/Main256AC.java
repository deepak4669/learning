import java.util.Scanner;
public class Main256AC
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    
    String[] a={"00","01","81"};
    String[] b={"0000","0001","2025","3025","9801"};
    String[] c={"000000","000001","088209","494209","998001"};
    String[] d={"00000000", 
      "00000001", 
      "04941729",
      "07441984", 
      "24502500", 
      "25502500",
      "52881984", 
      "60481729", 
      "99980001"};
    while(sc.hasNextInt())
    {
      int n=sc.nextInt();
      if(n==2)
      {
        for(int i=0;i<a.length;i++)
          System.out.println(a[i]);
      }
      else if(n==4)
      {
        for(int i=0;i<b.length;i++)
          System.out.println(b[i]);
      }
      else if(n==6)
      {
        for(int i=0;i<c.length;i++)
          System.out.println(c[i]);
      }
      else if(n==8)
      {
        for(int i=0;i<d.length;i++)
          System.out.println(d[i]);
      }
      

    }
  
  }
}