package com.company;

public class QuickSort {

    public static void quickSort(int[] arr, int begin, int end) {
    if (begin<end) {
        int partition = partition(arr, begin, end);
        quickSort(arr, 0,partition-1);
        quickSort(arr, partition+1, end);
    }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int k=begin; k<end; k++) {
            if (arr[k]<=pivot) {
                i++;
                int tempSwap = arr[i];
                arr[i]=arr[k];
                arr[k]=tempSwap;
            }
        }
        int tempSwap = arr[++i];
        arr[i]=arr[end];
        arr[end]=tempSwap;
        return i;
    }

}
