//Elementary Sortings

public class Sort
{
  public static void Insertion(Comparable[] a)
  {
    int N=a.length;
    for(int i=1;i<N;i++)
    {
      for(int j=i;j>0;j--)
      {
        if(less(a[j],a[j-1]))
          exch(a,j,j-1);
        else
          break;
      }
    }
  }
  
  public static void Selection(Comparable[] a)
  {
    int N=a.length;
    for(int i=0;i<N;i++)
    {
      int min=i;
      for(int j=i+1;j<N;j++)
      {
        if(less(a[j],a[min]))
          min=j;
      }
      exch(a,i,min);
    }
    
  }
  public static boolean less(Comparable v,Comparable w)
  {
    return v.compareTo(w)<0;
  }
  public static void exch(Comparable[] a,int i,int j)
  {
    Comparable temp=a[j];
    a[j]=a[i];
    a[i]=temp;
  }
  public static boolean isSorted(Comparable[] a)
  {
    int N=a.length;
    for(int i=1;i<N;i++)
    {
      if(less(a[i],a[i-1]))
        return false;
    }
    return true;
  }
  
  public static void SortM(Comparable[] a)
  {
    Comparable[] aux=new Comparable[a.length];
    sort(a,aux,0,a.length-1);
  }
  public static void sort(Comparable[] a,Comparable[] aux,int lo,int hi)
  {
    if(hi<=lo) return;
    int mid=lo+(hi-lo)/2;
    sort(a,aux,lo,mid);
    sort(a,aux,mid+1,hi);
    merge(a,aux,lo,mid,hi);
  }
  public static void merge(Comparable[] a,Comparable[] aux,int lo,int mid,int hi)
  {
    for(int k=lo;k<=hi;k++)
      aux[k]=a[k];
    int i=lo,j=mid+1;
    for(int k=lo;k<=hi;k++)
    {
      if(i>mid) a[k]=aux[j++];
      else if(j>hi) a[k]=aux[i++];
      else if(less(aux[j],aux[i])) a[k]=aux[j++];
      else a[k]=aux[i++];
    }
  }
  
  
  public static void SortQ(Comparable[] a)
  {
    sort(a,0,a.length-1);
  }
  public static void sort(Comparable[] a, int lo,int hi)
  {
    if(hi<=lo) return;
    int j=partition(a,lo,hi);
    sort(a,lo,j-1);
    sort(a,j+1,hi);
  }
  public static int partition(Comparable[] a,int lo,int hi)
  {
    int i=lo,j=hi+1;
    while(true)
    {
      while(less(a[++i],a[lo]))
        if(i==hi) break;
      while(less(a[lo],a[--j]))
        if(j==lo) break;
      if(i>=j) break;
      exch(a,i,j);
    }
    exch(a,lo,j);
    return j;
  }
  
  
  
  
  
  public static void main(String[] args)
  {
    Integer[] a={-2,5,2,4,1,5,7,8,8,4,3,2,2,};
    SortQ(a);
    for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
  }
  
}
    
             