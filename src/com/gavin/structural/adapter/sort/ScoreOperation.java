package com.gavin.structural.adapter.sort;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 分数操作接口 定义排序 查找 算法 被客户端使用
 */
public interface ScoreOperation {

    int[] sort(int[] array);

    int search(int[] array,int key);
}
