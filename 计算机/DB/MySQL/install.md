1. 下载Windows安装包：[官网](https://dev.mysql.com/downloads/mysql/)
2. 解压后在文件根目录下新建my.ini文件，配置信息：

```
[mysqld]
#设置3306端口
port=3306
# 设置mysql的安装目录
basedir=D:\Program Files\mysql-8.0.19-winx64
# 设置mysql数据库的数据的存放目录
datadir=D:\Program Files\mysql-8.0.19-winx64\data
# 允许最大连接数
max_connections=200
# 允许连接失败的次数。这是为了防止有人从该主机试图攻击数据库系统
max_connect_errors=10
# 服务端使用的字符集默认为UTF8
character-set-server=utf8
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB
# 默认使用“mysql_native_password”插件认证
default_authentication_plugin=mysql_native_password

[mysql]
# 设置mysql客户端默认字符集
default-character-set=utf8mb4

[client]
# 设置mysql客户端连接服务端时默认使用的端口
port=3306
default-character-set=utf8mb4
```

3. 配置path系统变量:D:\Program Files\mysql-8.0.19-winx64\bin 。
4. 初始化并启动MySQL服务

```
mysqld --initialize --console  #初始化并记住随机生成的密码。

mysqld --install   #安装MySQL服务

net start mysql   #启动服务器命令
#net stop mysql   #停止服务命令  
#sc delete MySQL/mysqld -remove   #卸载 MySQL 服务命令

mysql -u root -p   #登陆数据库 

set password for root@localhost='123456';   #修改密码

show databases;   #显示数据库
```

注：若本地已安装旧版本，可先停服务后删除文件