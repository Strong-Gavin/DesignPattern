package com.gavin.creational.simplefactory.figure.utils;

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
 * @date 2018-09-14 16:01
 * @description XML工具类
 */
public class XMLUtils {

    public static String getFigureType(){
        String type = "";
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(XMLUtils.class.getResourceAsStream("../config.xml"));
            NodeList nodeList = document.getElementsByTagName("figureType");
            Node figureNode = nodeList.item(0);
            type = figureNode.getFirstChild().getNodeValue();
            return type;
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return type;
    }
}
