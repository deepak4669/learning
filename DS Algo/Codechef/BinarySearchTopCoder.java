public class BinarySearchTopCoder
{//computes first x for which p(x)==true
  public static int binary_Search(lo,hi,p)
  {
    while(lo<hi)
    {
      mid = lo+(hi-lo)/2;
      if(p(mid)==true)//We can discard the right half of the array
        hi=mid;//But we keep middle
      else
        lo=mid+1;//No need to keep middle
    }
    assert p(lo)!=false;//p(x) false for all values;
    return lo;
  }
// computes greates x for which p(x) is false;
  public static int binary_Search(lo,hi,p)
  {
    while(lo<hi)
    {
      mid=lo+(hi-lo+1)/2;//division truncates
      if(p(mid)==true)
        hi=mid=mid-1;
      else
        lo=mid;
    }
    assert p(lo)!=false;
    return lo;
  }
  