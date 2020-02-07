package com.dom;

import org.apache.ibatis.builder.xml.XMLMapperEntityResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.text.ParseException;
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

//        for (int i=1;i<=30;i++) {
//            String st1 = " USE `skyway_public_"+i+"`;";
//            String st2 = "DELETE FROM `recommend_entry` WHERE id IN (\n" +
//                    "3906007429814452251,\n" +
//                    "3906007429814452252,\n" +
//                    "3906007429814452253,\n" +
//                    "3906007429814452254,\n" +
//                    "3906007429814452255,\n" +
//                    "3906007429814452270,\n" +
//                    "3906007429814452271,\n" +
//                    "3918228707714146312,\n" +
//                    "3918228707714146322);";
//            System.out.println(st1);
//            System.out.println(st2);
//            System.out.println();
//        }
//


//        for (int i=1;i<=30;i++) {
//            String st1 = " USE `skyway_public_"+i+"`;";
//            String st2 = "ALTER TABLE `diagnostic_task` CHANGE `mac` `mac` VARCHAR(32) CHARSET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '设备mac';";
//            System.out.println(st1);
//            System.out.println(st2);
//            System.out.println();
//        }
//
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(format.format(new Date(1577936852720L)));
//        System.out.println(format.format(new Date(1577936828670L)));
//        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis());


    }
}
