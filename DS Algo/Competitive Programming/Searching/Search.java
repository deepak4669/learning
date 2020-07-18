//Searching

public class Search
{
  public static int binarySearch(int[] a,int key)
  {
    int lo=0,hi=a.length-1;
    while(lo<=hi)
    {
      int mid=lo+(hi-lo)/2;
      if(a[mid]>key)
        hi=mid-1;
      else if(a[mid]<key)
        lo=mid+1;
      else
        return mid;
    }
    return -1;
  }
  public static void main(String[] args)
  {
    int[] a={-1,2,3,4,5,6,7,8,10};
    System.out.println(binarySearch(a,6));
    System.out.println(binarySearch(a,11));
  }
  
  
}
        
    
  