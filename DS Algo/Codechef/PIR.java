import java.util.Scanner;
public class PIR
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      double u=sc.nextDouble();
      double v=sc.nextDouble();
      double w=sc.nextDouble();
      double W=sc.nextDouble();
      double V=sc.nextDouble();
      double U=sc.nextDouble();
      double X=(w-U+v)*(U+v+w);
      double x=(U-v+w)*(v-w+U);
      double Y=(u-V+w)*(V+w+u);
      double y=(V-w+u)*(w-u+V);
      double Z=(v-W+u)*(W+u+v);
      double z=(W-u+v)*(u-v+W);
      double a=Math.sqrt(x*Y*Z);
      double b=Math.sqrt(y*Z*X);
      double c=Math.sqrt(z*X*Y);
      double d=Math.sqrt(x*y*z);
      double volume=(Math.sqrt((-a+b+c+d)*(a-b+c+d)*(a+b-c+d)*(a+b+c-d))/(192*u*v*w));
      //System.out.println(volume);
      System.out.println((double)Math.round(volume*10000d)/10000d);
    }
  }
}
        
                     
      
      
      