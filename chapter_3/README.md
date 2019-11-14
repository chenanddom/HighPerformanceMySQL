# 补充
1. 安装 percona-toolkit
 
2. 下载percona-toolkit安装包yum install https://www.percona.com/downloads/percona-toolkit/3.1.0/binary/redhat/7/x86_64/percona-toolkit-3.1.0-2.el7.x86_64.rpm
 
3. 查看可用的安装包yum list |grep percona-toolkit
![percona-toolkit](images/percona-intsall.png)


4. 安装percona-toolkit: yum install percona-toolkit
安装的过程如果发生了如下的提示    
![percona-toolkit](images/percona-toolkit_2.png)
需要执行以下的命令进行更新
![percona-toolkit](images/percona-toolkit_3.png)


使用percona-toolkit分析慢查询日志:

首先mysql需要开启慢查询日志,可以使用下面的语句:
    
        SET GLOBAL slow_query_log = ON; 

开启了慢查询日志之后就会得到如下的一个慢查询的日志:
![percona-toolkit](images/percona-toolkit_4.png)

 
 
 
 
 



# 服务器性能剖析

* 优化的原则

1. 确定优化要达到什么目的

2. 有效的测量才能进行有效的优化








