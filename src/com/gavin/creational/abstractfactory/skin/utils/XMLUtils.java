package com.gavin.creational.abstractfactory.skin.utils;

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
 * @date 2018-09-15 09:13
 * @description XML工具类
 */
public class XMLUtils {

    public static Object getBean(){
        Object object = null;
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = null;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(XMLUtils.class.getResourceAsStream("../config.xml"));
            NodeList nodeList = document.getElementsByTagName("className");
            Node classNameNode = nodeList.item(0);
            String className = classNameNode.getFirstChild().getNodeValue();
            Class<?> aClass = Class.forName(className);
             object = aClass.newInstance();
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
