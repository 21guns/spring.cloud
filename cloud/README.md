## 注册中心
1. eureka
    启动该spring boot项目
2. consul
    启动consul可以使用docker启动，命令
    `docker run --name consul -p 8400:8400 -p 8500:8500 -p 8600:53/udp -h node1 -d progrium/consul -server -bootstrap -ui-dir /ui`
