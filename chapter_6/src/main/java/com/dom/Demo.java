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
            String st2 = "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452251','2019-12-27 16:20:29','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:20:29','7fd372fc1122454aa84602d690eba0ea','0','Recommend','com.skyway.recommend','com.skyway.recommend','1','11');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452252','2019-12-27 16:21:00','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:21:00','7fd372fc1122454aa84602d690eba0ea','0','Featured APP','com.skyway.featuredapp','com.skyway.featuredapp','1','12');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452253','2019-12-27 16:21:33','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:21:33','7fd372fc1122454aa84602d690eba0ea','0','Featured Game','com.skyway.featuredgame','com.skyway.featuredgame','1','13');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452254','2019-12-27 16:21:59','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:21:59','7fd372fc1122454aa84602d690eba0ea','0','NETFLIX','com.skyway.netflix','com.skyway.netflix','2','21');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452255','2019-12-27 16:22:12','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:22:12','7fd372fc1122454aa84602d690eba0ea','0','Youtube','com.skyway.youtube','com.skyway.youtube','2','22');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452270','2019-12-27 16:44:25','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:44:25','7fd372fc1122454aa84602d690eba0ea','0','All Apps','com.skyway.allapps','com.skyway.allapps','1','14');\n" +
                    "INSERT INTO `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) VALUES('3906007429814452271','2019-12-27 16:44:42','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:44:42','7fd372fc1122454aa84602d690eba0ea','0','Recents','com.skyway.recents','com.skyway.recents','1','15');\n";
            System.out.println(st1);
            System.out.println(st2);
            System.out.println();
        }

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date(1577342953429L)));

//        System.out.println(System.currentTimeMillis());


    }
}
