import java.util.*;
public class sample
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String[] ar={"xy","nm"};
    Arrays.sort(ar);
    System.out.println(ar[0]+" "+ar[1]);
    String s="12";
    String[] v=s.split("");
    for(int i=0;i<v.length;i++)
      System.out.println(v[i]);
    System.out.println(v.length);
    
  }
}