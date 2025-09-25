package test_jpmc;

public class Test1 {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7,0,1,2,3};
        int k = 0;

        // sample o/p = {5}

        for (int i = 0; i < arr.length; i++) {

            if (k == arr[i]) {
                System.out.println(k + " is found at index: " + i);
            } else {
                System.out.println(k + " is not found!");
            }

        }



    }
}
