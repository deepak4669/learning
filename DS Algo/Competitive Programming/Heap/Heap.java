public class Heap
{
  public static void sort(int[] a)
  {
    int N=a.length;
    for(int k=N/2;k>=1;k--)
      sink(a,k,N);
    while(N>1)
    {
      exch(a,1,N);
      sink(a,1,--N);
    }
  }
  public static void sink(int[] a,int k,int N)
  {
    while(2*k<=N)
    {
      int j=2*k;
      if(j<N&&a[j]<a[j+1]) j++;
      if(!(a[k]<a[j])) break;
      exch(a,k,j);
      k=j;
    }
  }
  public static void exch(int[] a, int i,int j)
  {
    int temp=a[i];
    a[i]=a[j];
    a[j]=temp;
  }
}
     
     