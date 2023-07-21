// // 1. BubbleSort

// public class b {
//     static void bubbleSort(int arr[]) {
//         int n = arr.length;
//         for (int turn = 0; turn < n - 1; turn++) {
//             for (int j = 0; j < n - turn - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2};
//         bubbleSort(arr);
//         print(arr);
//     }
// }

//2. Selection Sort

// public class b {
//     static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minpos = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minpos] > arr[j]) {
//                     minpos = j;
//                 }
//             }
//             int temp = arr[minpos];
//             arr[minpos] = arr[i];
//             arr[i] = temp;
//         }
//     }
//         static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         selectionSort(arr);
//         print(arr);
//     }
// }

// 3. Insertion Sort
// public class b {
//     static void insertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;

//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             arr[prev + 1] = curr;
//         }
//     }

//     static void print(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = { 5, 4, 1, 3, 2 };
//         insertionSort(arr);
//         print(arr);
//     }
// }

import java.util.*;
public class b {
    static void print(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 3, 2 };
        print(arr);
        Arrays.sort(arr, Collections.reverseOrder());
        print(arr);

    }
}