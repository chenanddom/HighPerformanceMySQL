# MySQL的架构
MySQL的逻辑架构图主要如下:

![拓扑图](https://github.com/chenanddom/HighPerformanceMySQL/blob/master/images/%E6%95%B0%E6%8D%AE%E5%BA%93%E6%9E%B6%E6%9E%84.PNG?raw=true)


由架构图可以得知，MySQL的架构主要由三层组成
* 最上层是很多应用都有的,主要是客户端/服务器的的C/S架构，这一层主要负责连接处理，授权认证，安全等.

* 第二层是MySQL的核心服务功能，这一层包括了查询解析，分析，优化，缓存一级所有的内置函数(例如，日期前，时间，数学和加密函数)，
所有的存储引擎的功能都在这一层实现:存储过程，触发器，试图等

* 第三层包含了存储引擎。存储引擎负责MySQL中数据的存储和提取。和GUN/Linux下的格字文件系统一样，每个存储引擎都有他的又是和劣势。
服务器通过API与存储引起进行通信。这些接口屏蔽了了不同的存储引擎之间的差异，是的这些差异对上层的查询过程是透明的。存储引擎的API包
含了几十个底层的函数，用于执行注入"开始一个事务"或者"根据注解提取一行记录"等操作。但是存储引擎不会去解析SQL，不同的存储引起之间
也不会互相通信。
