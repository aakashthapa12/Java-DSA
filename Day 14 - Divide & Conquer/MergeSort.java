// // convert Unsorted Array to Sorted Array (Depth First Technique)

// // Time Complexity - O(logn), Space Complexity - O(n)

public class MergeSort {
    static int[] mergeSort(int arr[], int si, int ei) {
        if (si == ei) {
            int[] ba = new int[1];
            ba[0] = arr[si];
            return ba;
        }
        int mid = si + (ei - si) / 2;
        int[] fsh = mergeSort(arr, si, mid);
        int[] ssh = mergeSort(arr, mid + 1, ei);
        int[] fsa = mergeTwoSortedArrays(fsh, ssh);
        return fsa;
    }
    
    static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0; 

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {
                res[k] = b[j];
                j++;
                k++;
            }
        }
        
        while (i < a.length) {
            res[k] = a[i];
                i++;
                k++;
        }
        while (j < b.length) {
            res[k] = b[j];
                j++;
                k++;
        }
        return res;
    }
    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int a[] = mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// public class MergeSort {
//     static void printarr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     static int partition(int arr[], int si, int ei) {
//         int pivot = arr[ei];
//         int i = (si-1);

//         for (int j = si; j < ei; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
        
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i;
//     }
//     static void QuickSort(int arr[], int si, int ei) {
//         if (si >= ei) {
//             return;
//         }
//         int pIdx = partition(arr, si, ei);
//         QuickSort(arr, si, pIdx-1);
//         QuickSort(arr, pIdx+1, ei);
//     }
//     public static void main(String args[]) {
//         int arr[] = { 6, 3, 9, 8, 2, 5 };
//         QuickSort(arr, 0, arr.length - 1);
//         printarr(arr);
//     }
// }

