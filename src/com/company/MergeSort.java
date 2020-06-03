package com.company;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] array, int length) {
        if (length < 2) {
            return;
        }
        int middle = length/2;
        int []leftSideArray = new int[middle];
        int []rightSideArray = new int[length - middle];
        for (int i=0; i<middle;i++) {
            leftSideArray[i]=array[i];
        }
        for (int i=middle; i<array.length;i++) {
            rightSideArray[i-middle]=array[i];
        }
        mergeSort(leftSideArray, middle);
        mergeSort(rightSideArray, length-middle);
        merge(array, leftSideArray, rightSideArray, middle, length-middle);
    }

    private static void merge(int[] array, int[] leftSideArray, int[] rightSideArray, int leftSideIndex, int rightSideIndex) {
        int i = 0, j = 0, k = 0;

        while(i<leftSideIndex && j<rightSideIndex) {
            if(leftSideArray[i]<rightSideArray[j]) {
                array[k++]=leftSideArray[i++];
            } else {
                array[k++]=rightSideArray[j++];
            }
        }
        while(i<leftSideIndex) {
            array[k++]=leftSideArray[i++];
        }
        while(j<rightSideIndex) {
            array[k++]=rightSideArray[j++];
        }
    }
}
