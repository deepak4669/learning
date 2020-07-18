import java.util.*;
public class SolutionIB {
    public static String findDigitsInBinary(int A) {
        Vector<Integer> digits=new Vector<Integer>();
        String sol="";
        while(A>=1)
        {
            int x=A%2;
            System.out.println(A);
            digits.add(x);
            A/=2;
        }
        System.out.println(digits.size()+"d ");
        for(int i=digits.size()-1;i>=0;i--)
        {
            sol+=digits.elementAt(i)+"";
            
        }
        return sol;
    
    }
    public static void main(String[] args)
    {
      System.out.println(findDigitsInBinary(2));
    }
}
