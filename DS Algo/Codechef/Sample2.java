public class Sample2
{
  public static void main(String[] args)
  {
    //Scanner sc=new Scanner(System.in);
    System.out.println(perfect(4)+" "+perfect(1));
  }
  public static boolean perfect(int n)
  {
    int m=(int)Math.sqrt(n);
    if(m*m==n) return true;
    else
      return false;
  }
}