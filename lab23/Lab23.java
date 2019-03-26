package lab23.palindrom;

/**
 *
 * @author terehin.andrey
 */
public class Lab23Palindrom {

    public static String reverseString(String s) {
        String res = "";
        
        int i = s.length() - 1;
        
        while(i>=0)
        {
            res += s.charAt(i);
            --i;
        }

        return res;
    }
    
    boolean isPalindrom(String input) {
        String reversedString = reverseString(input.replaceAll("[\\s-+.^:,*?!]",""));
        String inputStringres = input.replaceAll("[\\s-+.^:,*?!]",""); 
        
        System.out.println(inputStringres + " | " + reversedString + "\n");
        
        boolean result = inputStringres.equalsIgnoreCase(reversedString);
        return result;
    }
    
}
