package Interview;

public class LongCommonSuffix {

    public static void main(String[] args) {

        String str1 = "helloworld";
        String str2 = "myworld";


        int i = str1.length() - 1;
        int j = str2.length() - 1;
        StringBuilder suffix = new StringBuilder();
        while (i >= 0 && j >= 0 && str1.charAt(i) == str2.charAt(j)) {
            suffix.insert(0, str1.charAt(i));
            i--;
            j--;
        }

        System.out.println(suffix);


    }


}
