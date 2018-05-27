### 2.4.1 堆溢出
-Xms20m 堆内存初始值 <br>
-Xmx20m 堆内存最大值 <br>
-XX:+HeapDumpOnOutOfMemoryError 内存溢出Dump当前内存缓存快照 <br>
-Xlog:gc*    //打印jvm内存日志 <br>
### 2.4.2.1 栈溢出
-Xss128k 栈溢出 <br>
-Xlog:gc*    //打印jvm内存日志 <br>
### 2.4.3 方法区和运行时常量池溢出
-XX:PermSize=10M 永久代 (JDK 1.6之前有效) <br>
-XX:MaxPermSize=10M  (JDK 1.6之前有效) <br>
-Xlog:gc*    //打印jvm内存日志 <br>

#### gclib
-XX:PermSize=10M 永久代 (JDK 1.6之前有效) <br>
-XX:MaxPermSize=10M  (JDK 1.6之前有效) <br>
-Xlog:gc*    //打印jvm内存日志 <br>

### 2.4.4 本机直接内存溢出
-Xmx20m 堆内存最大值 <br>
-XX:MaxDirectMemorySize=10M 本机直接内存最大值 <br>
-Xlog:gc*    //打印jvm内存日志 <br>
-XX:+HeapDumpOnOutOfMemoryError 内存溢出Dump当前内存缓存快照 <br>