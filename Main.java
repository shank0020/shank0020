//binary search program
package com.company;

import java.util.Scanner;

public class Main {

    public static int getBinarySearchUnsuccessfulComparisonCount(int[] arry, int key) {
        int last = arry.length - 1, first = 0, mid = 0;

        while (first <= last) {
            mid = (int) Math.floor((first + last)/2);
            if(arry[mid] == key) return mid;
            else if(key < arry[mid]) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        //Source bs = new Source();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getBinarySearchUnsuccessfulComparisonCount(array, key));

    }
}
