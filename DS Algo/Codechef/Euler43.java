import java.util.*;
public class Euler43
{
  private static Integer[] nextPermutation(Integer[] a)
  {
    int first=getFirst(a);
    if(first==-1)
      return null;
    int toSwap=a.length-1;
    while(a[first].compareTo(a[toSwap])>=0)
      --toSwap;
    swap(a,first++,toSwap);
    toSwap=a.length-1;
    while(first<toSwap)
    {
      swap(a,first++,toSwap--);
    }
    return a;
  }
  private static int getFirst(Integer[] a)
  {
    for(int i=a.length-2;i>=0;i--)
    {
      if(a[i].compareTo(a[i+1])<0)
        return i;
    }
    return -1;
  }
  private static void swap(Integer[] a, int i,int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
  
  
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    Integer[] a={0,1,2,3,4,5,6,7,8,9};
    int cnt=0;
    long ans=0;
    while(a!=null)
    {
      String s="";
      for(int i=0;i<10;i++)
        s+=a[i]+"";
      
      int x1=Integer.parseInt(s.substring(1,4));
      int x2=Integer.parseInt(s.substring(2,5));
      int x3=Integer.parseInt(s.substring(3,6));
      int x4=Integer.parseInt(s.substring(4,7));
      int x5=Integer.parseInt(s.substring(5,8));
      
      int x6=Integer.parseInt(s.substring(6,9));
      int x7=Integer.parseInt(s.substring(7,10));
      if(x1%2==0&&x2%3==0&&x3%5==0&&x4%7==0&&x5%11==0&&x6%13==0&&x7%17==0)
      {
        ans+=Long.parseLong(s);
        cnt++;
      }
      a=nextPermutation(a);
    }
    System.out.println(ans);
  }
}
        
      
        
       