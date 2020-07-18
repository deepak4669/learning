public class EULER4
{
  public static void main(String[] args)
  {
    int max=0;
    for(int i=999;i>=100;i--)
    {
      for(int j=999;j>=100;j--)
      {
        if(palindrome(i*j))
        {
          if(i*j>max) max=i*j;
        }
      }
    }
    System.out.println(max);
  }
  public static boolean palindrome(int n)
  {
    int rev=0;
    int dupl=n;
    while(n>0)
    {
      rev=(rev*10)+n%10;
      n/=10;
    }
    if(rev==dupl) return true;
    else return false;
  }
}
      
  
          