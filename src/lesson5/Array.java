package lesson5;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = arr.clone();
        arr[0] = 12;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString("Дока".toCharArray()));
        char[] g1 ="Дока".toCharArray();
        for (char ch : g1) {
            ch+=1;
            System.out.println(ch);
        }

        for (int i = 0; i < g1.length; i++) {
            System.out.println(g1[i]);
        }

        int[] arr4 = {1,2,3,4,5,6,7,8,9};

        for (int el: arr4) {
            if (el % 2 == 0) {
                System.out.println(el);
            }
        }

        int count = 1;
        while (count < 100) count++;
        System.out.println(count);
    }
}
