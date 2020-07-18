import java.util.Scanner;
public class Main34
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    int[][] res=new int[t][10000];
    for(int i=0;i<t;i++)
    {
      int a=sc.nextInt();
      int b=sc.nextInt();
      
      if(a<=b)
      {
        int d=b-a;
        