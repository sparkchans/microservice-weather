1. 城市数据服务, 其它服务通过该服务可以获取到城市的数据
2. 启动该服务前, 需要启动`weather-eureka-server`服务注册中心
2. 从`citylist.xml`文件中加载城市数据文件
3. 服务启动端口为`8762`, 从`localhost:8762/city/cities`获取城市数据
