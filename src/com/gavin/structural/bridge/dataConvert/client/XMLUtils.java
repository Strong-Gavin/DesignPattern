package com.gavin.structural.bridge.dataConvert.client;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author gf
 * @description XML工具类
 * @date 2018-09-19 22:15
 */
public class XMLUtils {

    public static Object getBean(String classType){
        Object object = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(XMLUtils.class.getResourceAsStream("./config.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            String className = "";
            if(classType.equals("convert")){
                Node classNode = nodeList.item(0);
                className = classNode.getFirstChild().getNodeValue();
            }else if(classType.equals("database")){
                Node classNode = nodeList.item(1);
                className = classNode.getFirstChild().getNodeValue();
            }
            Class c = Class.forName(className);
            object = c.newInstance();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return object;
    }
}
