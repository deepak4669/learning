import java.util.Scanner;
public class LIGHTUP
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    int max=0;
    for(int i=1;i<m;i++)
    {
      int value=calcr(a,i,m);
      System.out.println(i+"i");
      if(value>max) max=value;
    }
    System.out.println(max);
  }
  public static int calcr(int[] a,int i,int m)
  {
    int value=0;
    boolean turned=false;
    //System.out.println("d");
    if(i<a[0]){ value+=(i);
      //System.out.println(value+"ddd");
    }
    //System.out.println(value);
    else{
      value+=a[0];
      turned=true;
    }
    //System.out.println(value);
    for(int k=1;k<a.length;k++)
    {
      if(turned){
        turned=false;
      }
      else
      {
        if(a[k]>i&&i>a[k-1])
        {
          value+=(i-a[k-1]);
          turned=false;
          System.out.println(value);
        }
        else
        {
          value+=(a[k]-a[k-1]);
          turned=true;
        }
      }
    }
    if(turned) return value;
    else return value+(m-a[a.length-1]);
  }
}
      
    
    
      