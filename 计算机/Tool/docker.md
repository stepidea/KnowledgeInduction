# docker 镜像可以理解为只读的文件系统，docker 容器就是在镜像上面加一层可写操作，变成可读可写的文件系统

1. 搜索镜像：docker search 镜像名字
2. 下载镜像：docker pull 镜像名字
3. docker容器输出"hello word": docker run 镜像(learn/tutorial) 命令echo "hello word"
4. 在learn/tutorial镜像里面安装ping程序：docker run learn/tutorial apt-get install -y ping
5. 检查运行中的镜像：docker ps -l 或 docker inspect efe（查看更详细信息）
   > 查看容器
6. 保存对容器的修改：docker commit 容器ID 新镜像名
   > 生成镜像
7. 运行新的镜像：docker run lean/ping ping www.google.com
8. 发布docker镜像：docker push 镜像名称
9. 查看安装的镜像：docker images
10. docker 站点：
 * https://www.docker.org.cn （中文）
 * https://docs.docker.com （英文）
 * https://index.docker.io (镜像存储地址)
