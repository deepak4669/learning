import java.util.Scanner;
public class Main27
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    String[][] res=new String[t][100];
    for(int i=0;i<t;i++)
    {
      int n=sc.nextInt();
      int k=sc.nextInt();
      String[] s=new String[n];
      for(int j=0;j<n;j++)
        s[j]=sc.nextLine();
      int l=sc.nextInt();
      String[][] p=new String[k][l];
      
      for(int 