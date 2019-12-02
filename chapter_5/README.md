# 创建高性能的索引



索引时存储引擎用于快速找到记录的一种数据结构。这是所有的基本功能，所以索引对于良好的性能非常的重要，
数据量越多越重要。但是，在实际生活当中，索引经常被误解或者错误使用，导致性能逐渐下降。索引优化时对
查询优化最有效的手段了。



## 索引基础

索引可以包含一个或者多个列的值。如果所有包含多个列，那么列的顺寻也十分重要，MySQL只能搞笑的使用所有的最左前缀列


### 索引的类型

MySQL中有很多种类型，可以为不同的 常见场景提供更好的性能。索引时存储引擎层而不是服务器实现的。所以不同的存储
引擎的索引时不一样的，也不是所有的存储引擎层都支持所有的索引类型。




* B-Tree索引

当人们谈论索引的时候，如果没有特备的说明类型，那么多半是B-Tree索引，它使用B-Tree数据结构来存储数据。大所属的MySQL引擎都支持这种
索引。Archive引擎是一个例外，5.1之前是不支持任何的索引，5.1才开始支持自增列的索引.













































