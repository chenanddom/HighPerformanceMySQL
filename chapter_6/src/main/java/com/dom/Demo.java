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




        for (int i=1;i<=35;i++) {
            String st1 = " USE `skyway_public_"+i+"`;";
            String st2 = "CREATE TABLE `recommend_launcher_item` (\n" +
                    "  `id` BIGINT(20) NOT NULL,\n" +
                    "  `create_time` DATETIME DEFAULT NULL,\n" +
                    "  `created_by` VARCHAR(32) DEFAULT NULL,\n" +
                    "  `update_time` DATETIME DEFAULT NULL,\n" +
                    "  `updated_by` VARCHAR(32) DEFAULT NULL,\n" +
                    "  `deleted_flag` TINYINT(4) DEFAULT NULL,\n" +
                    "  `title_name` VARCHAR(64) NOT NULL COMMENT '标题名称',\n" +
                    "  `config_id` BIGINT(20) NOT NULL COMMENT '配置id',\n" +
                    "  `entry_id` BIGINT(20) NOT NULL COMMENT '条目id',\n" +
                    "  `entry_name` VARCHAR(64) NOT NULL COMMENT '条目名称',\n" +
                    "  `app_name` VARCHAR(64) DEFAULT NULL COMMENT 'app名称',\n" +
                    "  `package_name` VARCHAR(64) NOT NULL COMMENT '包名',\n" +
                    "  `item_order` INT(11) NOT NULL COMMENT '序号',\n" +
                    "  PRIMARY KEY (`id`) USING BTREE\n" +
                    ") ENGINE=INNODB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=DYNAMIC;";
            System.out.println(st1);
            System.out.println(st2);
            System.out.println();
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date(1577342953429L)));

//        System.out.println(System.currentTimeMillis());


    }
}
