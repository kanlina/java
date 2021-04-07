package demo01;

import java.util.Arrays;

public class MpSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 0, 9, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            //外循环只需要比较arr.length-1次就可以了
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //-1为了防止索引越界,-i为了提高效率
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
