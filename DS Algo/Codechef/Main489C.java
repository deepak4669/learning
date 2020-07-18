import java.util.Scanner;
public class Main489C
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int s=sc.nextInt();
    if((s==0&&m>1)||s>(m*9))
    {
      System.out.println(-1+" "+-1);
    }
    else{
    int[] ch=new int[m];
    int value=s;
    for(int i=m;i>=1;i--)
    {
      if(value<10&&i>1)
      {
        ch[i-1]=value-1;
        value-=(value-1);
         
      }
      else if(i==1)
      {
        ch[i-1]=value;
        value=0;
      }
      else{
        ch[i-1]=9;
        value-=9;
      }
    }
    value=s;
    int[] ch2=new int[m];
    
    for(int i=1;i<=m;i++)
    {
      if(value>0&&value<10&&i<=m)
      {
        ch2[i-1]=value;
        value=0;
      }
      else if(value==0&&i<=m)
      {
        ch2[i-1]=0;
      }
      else
      {
        ch2[i-1]=9;
        value-=9;
      }
    }
    for(int i=0;i<m;i++)
    {
      System.out.print(ch[i]);
    }
    System.out.print(" ");
    for(int i=0;i<m;i++)
    {
      System.out.print(ch2[i]);
    }
    }
  }
}
      
        
      
        
        
      
      
  