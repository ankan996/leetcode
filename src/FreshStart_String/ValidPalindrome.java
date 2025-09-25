package FreshStart_String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = checkPalindrome(s);
        System.out.println(result);
    }

    public static boolean checkPalindrome(String s) {

        int p1 = 0, p2 = s.length() - 1;
        while (p1 <= p2 ) {

            // pick one character by both the pointers to compare

            char c1 = s.charAt(p1);
            char c2 = s.charAt(p2);

            // logic to check if both c1 & c2 are letters/digits

            if (Character.isLetterOrDigit(c1) == false) {
                p1++;
            } else if (Character.isLetterOrDigit(c2) == false) {
                p2--;
            } else{
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                return false;
            }
                p1++;
                p2--;
        }

        }
        return true;

    }

}
