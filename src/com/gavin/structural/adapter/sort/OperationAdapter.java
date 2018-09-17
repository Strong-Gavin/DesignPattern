package com.gavin.structural.adapter.sort;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 适配器类
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort quickSort;
    private BinarySearch binarySearch;

    public OperationAdapter(){
        quickSort = new QuickSort();
        binarySearch = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return quickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return binarySearch.binarySearch(array,key);
    }
}
