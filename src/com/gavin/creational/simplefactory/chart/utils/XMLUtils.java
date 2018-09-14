package com.gavin.creational.simplefactory.chart.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @author gf
 * @date 2018-09-14 15:05
 * @description xml工具类
 */
public class XMLUtils {
    private static final Logger logger = LoggerFactory.getLogger(XMLUtils.class);

    public static String getChartType(){
        String type = "";
        try {
            //1、单例获取工厂
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            //2、工厂方法获取文档构建器
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(XMLUtils.class.getResourceAsStream("../config.xml"));
            NodeList chartTypeNodes = document.getElementsByTagName("chartType");
            Node chartTypeNode = chartTypeNodes.item(0);
            type = chartTypeNode.getFirstChild().getNodeValue();
        } catch (ParserConfigurationException e) {
            logger.error("解析配置失败");
            e.printStackTrace();
        } catch (SAXException e) {
            logger.error("解析XML配置失败");
            e.printStackTrace();
        } catch (IOException e) {
            logger.error("IO失败");
            e.printStackTrace();
        }
        return type;
    }
}
