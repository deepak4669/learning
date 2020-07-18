import java.util.Scanner;
public class Main300A
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int neg=0;
    int neg_index=0;
    int pos=0;
    int pos_index=0;
    int zero=0;
    int zer=0;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]<0&&neg==0){
        neg_index=i;
        neg++;
      }
        
      else if(a[i]>0&&pos==0){
        pos++;
        pos_index=i;
      }
      else if(a[i]==0){
        zero=i;
        zer++;
      }
    }
    if(pos==0)
    {
      System.out.println("1 "+a[neg_index]);
      System.out.print("2 ");
      int p1=0,p2=0;
      int i=0;
      for(i=0;i<n;i++)
      {
        if(a[i]!=0&&i!=neg_index&&pos<2)
        {
          System.out.print(a[i]+" ");
          pos++;
        }
        else if(pos>=2)
        {
          break;
        }
      }
      System.out.println();
      System.out.print(n-3+" "+a[zero]+" ");
      for(;i<n;i++)
      {
        if(i==zero)
          continue;
        System.out.print(a[i]+" ");
      }
    }
    else{
          
        
      
    System.out.println("1 "+a[neg_index]);
    System.out.println("1 "+a[pos_index]);
    
    System.out.print(n-2+" ");
    for(int i=0;i<n;i++)
    {
      if(i==neg_index||i==pos_index)
        continue;
      else
      {
        System.out.print(a[i]+" ");
      }
    }
  }
  }}
      
    
  