import java.util.Scanner;
public class BSHUFFLE3
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();        
    int[] p2=new int[n];
    p2[0]=n;
      for(int i=1;i<=n-1;i++)
        p2[i]=i;
      //p2=new char[n];
      
      int[] p1=ans(n);
    
    for(int i=0;i<n;i++)
      System.out.print(p1[i]+" ");
    System.out.println();
    for(int i=0;i<n;i++)
      System.out.print(p2[i]+" ");
    
      
  }
  static int[] ans(int n)
  {
    int[] a={-1};
    if(n==2)
    {
      int[] ch={1,2};
      return ch;
    }
    if(n==3)
    {
      int[] ch={1,3,2};
      return ch;
    }
    if(n==4)
    {
      int[] ch={2,1,4,3};
      return ch;
    }
    if(n==5)
    {
      int ch[]={2,3,1,5,4};
      return ch;
    }
    if(n==6)
    {
      int[] ch={2,3,1,5,6,4};
      return ch;
    }
    if(n==7)
    {
      int ch[]={2,3,1,5,6,7,4};
      return ch;
    }
    if(n==8)
    {
      int ch[]={2,3,4,1,6,7,8,5};
      return ch;
    }
    if(n==9)
    {
      int ch[]={2,3,4,5,1,7,8,9,6};
      return ch;
    }
    if(n==10)
    {
      int[] ch={2,3,4,5,1,7,8,9,10,6};
      return ch;
    }
    if(n==11){
      int ch[]={2,3,4,5,6,1,8,9,10,11,7};
      return ch;
    }
    if(n==12)
    {
      int ch[]={2,3,4,5,6,1,8,9,10,11,12,7};
      return ch;
    }
    if(n==13)
    {
      int[] ch={2,3,4,5,6,7,1,9,10,11,12,13,8};
      return ch;
    }
    if(n==14)
    {
      int[] ch={2,3,4,5,6,7,1,9,10,11,12,13,14,8};

      return ch;
    }
    if(n==15)
    {
      int ch[]={2,3,4,5,6,7,8,1,10,11,12,13,14,15,
      9};
      return ch;
    }
    if(n==16)
    {
      int ch[]={2,3,4,5,6,7,8,1,10,11,12,13,14,15,
      16,9};
      return ch;
    }
    if(n==17)
    {
      int ch[]={2,3,4,5,6,7,8,9,1,11,12,13,14,15,16,
      17,10};
      return  ch;
    }
    return a;
  }
      
}
      
