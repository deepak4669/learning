import java.util.Scanner;
public class RAINBOWA
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
      int n=sc.nextInt();
      String[] a=new String[n];
      int q=sc.nextInt();
      sc.nextLine();
      a=sc.nextLine().split(" ");
      System.out.println("l");
      
      String res[]=new String[n];
      for(int i=0;i<q;i++)
      {
        int h=sc.nextInt();
        String[] kl=new String[1];
        
        kl =sc.nextLine().split(" ");
        System.out.print(kl);
        String[] g=new String[h];
        g=sc.nextLine().split(" ");
        System.out.println("g");
        for(int j=0;j<h;j++)
          System.out.println(g[j]);
        
        
        
        for(int j=0;j<h;j++)
        {
          for(int k=0;k<n;k++)
          {
            if(g[j]==a[k]||res[k]=="YES") res[k]="YES";
            else res[k]="NO";
          }
        }
      }
      for(int i=0;i<n;i++)
      {
        System.out.println(res[i]);
      }
      t--;
    }
  }
}
             
          
          
        