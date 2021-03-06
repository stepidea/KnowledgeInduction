专有名词解释：

**1、服务器方面：**

RPS：（Requests per second）**吞吐率**，即每秒的请求数。

QPS：（Queries Per Second）**每秒查询率**，是一台服务器每秒能够响应的查询次数，是对一个特定的查询服务器（比如是读写分离的架构，就是读的服务器）在规定时间内所处理流量多少的衡量标准。

TPS：（Transactions Per Second）**每秒事务数**，一个事务是指一个客户机向服务器发送请求然后服务器做出反应的过程。客户机在发送请求时开始计时，收到服务器响应后结束计时，以此来计算使用的时间和完成的事务个数。

QPS计算PV和机器的方式：
QPS = 总请求数 / (进程总数 * 请求时间)
QPS: 单个进程每秒请求服务器的成功次数

PV：（Page View）页面访问量

单台服务器每天PV计算
公式1：每天总PV = QPS * 3600 * 6
公式2：每天总PV = QPS * 3600 * 8

服务器计算
服务器数量 = ceil(每天总PV / 单台服务器每天总PV)

值QPS和机器计算公式

原理：每天80%的访问集中在20%的时间里，这20%时间叫做峰值时间
公式：(总PV数 * 80%) / (每天秒数 * 20%) = 峰值时间每秒请求数(QPS)
机器：峰值时间每秒QPS / 单台机器的QPS = 需要的机器

问：每天300w PV 的在单台机器上，这台机器需要多少QPS？
答：(3000000 * 0.8) / (86400 * 0.2) = 139 (QPS)

问：如果一台机器的QPS是58，需要几台机器来支持？

答：139 / 58 = 3

**2、网络通信方面**

SSL：（Secure Sockets Layer）安全套接层

TLS：（Transport Layer Security）传输层安全性协议