import java.util.Scanner;
import java.util.Arrays;
public class Acodefor
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] a=new String[n];
    String[] b=new String[n];
    
    for(int i=0;i<n;i++)
    {
      a[i]=sc.next();
    }
    int count=0;
    for(int i=0;i<n;i++)
    {
      b[i]=sc.next();
      int index=binarySearch(a,b[i]);
      if(index!=-1){
        a[index]="DONE";
      }
      else count++;
    }
    System.out.println(count);
  }
  public static int binarySearch(String[] a,String item)
  {
    for(int i=0;i<a.length;i++)
    {
      if(a[i].equals(item)) return i;
    }
    return -1;
  }
}
    
      