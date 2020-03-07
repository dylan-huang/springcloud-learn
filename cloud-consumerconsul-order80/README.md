consul使用容器安装，调用时服务报错
```java
2020-03-07 22:14:38.897 ERROR 41521 --- [TaskScheduler-1] o.s.c.c.discovery.ConsulDiscoveryClient  : Error watching Consul CatalogServices
Caused by: java.net.ConnectException: Connection refused (Connection refused)
	at java.net.PlainSocketImpl.socketConnect(Native Method) ~[na:1.8.0_221]
	at java.net.AbstractPlainSocketImpl.doConnect(AbstractPlainSocketImpl.java:350) ~[na:1.8.0_221]
	at java.net.AbstractPlainSocketImpl.connectToAddress(AbstractPlainSocketImpl.java:206) ~[na:1.8.0_221]
	at java.net.AbstractPlainSocketImpl.connect(AbstractPlainSocketImpl.java:188) ~[na:1.8.0_221]
	at java.net.SocksSocketImpl.connect(SocksSocketImpl.java:392) ~[na:1.8.0_221]
	at java.net.Socket.connect(Socket.java:589) ~[na:1.8.0_221]
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:75) ~[httpclient-4.5.10.jar:4.5.10]
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142) ~[httpclient-4.5.10.jar:4.5.10]
	... 25 common frames omitted
```