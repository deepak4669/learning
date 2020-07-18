public class Selection
{
  public static void sor(Comparable[] a)
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
    return v.compareTo(w);
  }
  private static void exch(Comparable[] a,int v,int w)
  {
    Comparable swap=a[i];
    a[i]=a[j];
    a[j]=swap;
  }
}
    