package com.dom;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:一句话的功能说明
 * @Author: chendom
 * @Date: 2019/10/18 15:02
 * @Version 1.0
 */
public class Demo {

    public static void main(String[] args) {
        Date date = new Date(1575623613703L);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
