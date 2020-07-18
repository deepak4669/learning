//Next Permutation
public class Permutation
{
  public static void main(String[] args)
  {
    Integer[] a={4,4,7,7};
    while(a!=null)
    {
      for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
      System.out.println();
      a=nextPermutation(a);
    }
      
      
  }
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
}