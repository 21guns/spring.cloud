## 注册中心
1. eureka
    启动该spring boot项目
2. consul
    启动consul可以使用docker启动，命令
    `docker run --name consul -p 8400:8400 -p 8500:8500 -p 8600:53/udp -h node1 -d progrium/consul -server -bootstrap -ui-dir /ui`

## 熔断监控中心
hystrix.dashboard
- 使用rabbitmq，docker安装 
   * docker run -d --hostname rabbit --name web-rabbit -p 9191:15672 -p 5672:5672 -e RABBITMQ_ERLANG_COOKIE='123456' rabbitmq:3-management 
