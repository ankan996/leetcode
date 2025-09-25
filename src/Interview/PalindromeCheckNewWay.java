package Interview;

public class PalindromeCheckNewWay {
    public static void main(String[] args) {
        String inputString = "m,  a,  d, a!! m";
        boolean isPalindrome = checkPalindrome(inputString);
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else System.out.println("Not Palindrome");
    }

    public static boolean checkPalindrome(String inputString) {

       int start = 0;
       int end = inputString.length() - 1;

       while (start < end) {

           char c1 = inputString.charAt(start);
           char c2 = inputString.charAt(end);

           if (Character.isLetterOrDigit(c1) ==  false) {
               start++;
           } else if (Character.isLetterOrDigit(c2) == false) {
               end--;
           } else {
               if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                   return false;
               }
               start++;
               end--;
           }
       }

        return true;

    }

}

