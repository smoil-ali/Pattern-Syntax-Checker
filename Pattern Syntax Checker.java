import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String p = in.nextLine();
            try{
                Pattern.compile(p);
            }
            catch(PatternSyntaxException exception){
                System.out.println("Invalid");
                testCases--;
                continue;
            }
            System.out.println("Valid");
            testCases--;
		}
	}
}



