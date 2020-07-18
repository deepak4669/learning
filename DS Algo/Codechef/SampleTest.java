public class SampleTest
{
  static int[] t;
  public static void main(String[] args)
  {
    int[] a={0,-3,-3,1,1,2};
    t=new int[a.length*4];
    build(a,1,0,a.length-1);
    for(int i=0;i<t.length;i++)
    {
      System.out.println(t[i]);
    }
  }
  static public void build(int[] nums,int v,int lo,int ro)
  {
    if(lo==ro)
      t[v]=nums[lo];
    else
    {
      int mid=(lo+ro)/2;
      build(nums,2*v,lo,mid);
      build(nums,2*v+1,mid+1,ro);
      t[v]=t[2*v]+t[2*v+1];
    }
  }
}
