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


        for (int i=1;i<=30;i++) {
            String st1 = " USE `skyway_public_"+i+"`;";
            String st2 = "insert into `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) values('3906007429814452252','2019-12-27 16:21:00','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:21:00','7fd372fc1122454aa84602d690eba0ea','0','Featured APP','com.nes.featuredapps','com.nes.featuredapps','2','23');\n" +
                    "insert into `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) values('3906007429814452254','2019-12-27 16:21:59','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:21:59','7fd372fc1122454aa84602d690eba0ea','0','NETFLIX','com.netflix.ninja','com.netflix.ninja','2','21');\n" +
                    "insert into `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) values('3906007429814452255','2019-12-27 16:22:12','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:22:12','7fd372fc1122454aa84602d690eba0ea','0','Youtube','com.google.android.youtube.tv','com.google.android.youtube.tv','2','22');\n" +
                    "insert into `recommend_entry` (`id`, `create_time`, `created_by`, `update_time`, `updated_by`, `deleted_flag`, `entry_name`, `app_name`, `package_name`, `tabs`, `entry_type`) values('3906007429814452270','2019-12-27 16:44:25','7fd372fc1122454aa84602d690eba0ea','2019-12-27 16:44:25','7fd372fc1122454aa84602d690eba0ea','0','All Apps','','','1','13');\n";
            System.out.println(st1);
            System.out.println(st2);
            System.out.println();
        }

  /*      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(format.format(new Date(1577342953429L)));
*/
//        System.out.println(System.currentTimeMillis());


    }
}
