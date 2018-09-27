package com.gavin.structural.facade.encrypt;

/**
 * @author gavin
 * @date 2018/9/27
 * @description
 */
public class Client {

    public static void main(String args[]){
        FacadeSample facadeSample = new FacadeSample();
        facadeSample.fileEncrypt("src.txt","dest.txt");
    }
}
