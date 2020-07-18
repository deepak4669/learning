public class Selection
{
  public static void sort(Comparable[] a)
  {
    int N=a.length;
    for(int i=0;i<a.length;i++)
    {
      int min=i;
      
      for(int j=i+1;j<a.length;j++)
      {
        if(less(a[j],a[min])) min=j;
      }
      exch(a,i,min);
    }
  }
  public static boolean less(Comparable v,Comparable w)
  {
    return v.compareTo(w)<0;
  }
  private static void exch(Comparable[] a,int v,int w)
  {
    Comparable swap=a[v];
    a[v]=a[w];
    a[w]=swap;
  }
  private static boolean isSorted(Comparable[] a)
  {
    for(int i=1;i<a.length;i++)
    {
      if(less(a[i],a[i-1])) return false;
    }
    return true;
  }
}
    