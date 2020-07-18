public class Shell
{
  public static void sort(Comparable[] a)
  {
    int N=a.length;
    int h=1;
    while(h<N/3) h=3*h+1;
    
    while(h>=1)
    {
      //h-sort
      for(int i=h;i<N;i++)
      {
        for(int j=i;i>=h&&less(a[j],a[j-h]);j-=h)
          exch(a,j,j-h);
      }
      h/=3;
    }
  }
  private static boolean less(Comparable v, Comparable w)
  {
    return v.compareTo(w)<0;
  }
  
  private static void exch(Comparable[] a, int v,int w)
  {
    Comparable swap=a[v];
    a[v]=a[w];
    a[w]=swap;
  }
}
      