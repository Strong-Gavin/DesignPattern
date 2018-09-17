package com.gavin.structural.adapter.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * @author gavin
 * @date 2018/9/17
 * @decription 客户端测试类
 */
public class Client {
    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String args[]){
        ScoreOperation scoreOperation = (ScoreOperation) XMLUtils.getBean();

        int[] arr  = new int[]{24,15,36,49,21};

        int[] resultArr = scoreOperation.sort(arr);
        logger.info(Arrays.toString(resultArr));
        int isExist = scoreOperation.search(resultArr,36);
        logger.info("是否存在:{}",isExist);
    }
}
