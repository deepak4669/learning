import java.util.Scanner;
public class Main144A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int max_index=max(a);
    int min_index=min(a);
    if(max_index>min_index)
      System.out.println(max_index+n-1-min_index-1);
    else if(max_index<min_index)
      System.out.println(max_index+n-1-min_index);
    else if(max_index==min_index)
      System.out.println(0);
    
  }
}
      
    