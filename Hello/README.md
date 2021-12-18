# 坑点
之前大学学 java 的时候，记得使用 javac 进行编译，java 执行，结果我被坑了。

```shell
javac Hello.java
```

发现生成了 Hello.class，于是执行

```shell
java Hello.class
```

结果竟然报错了，显示错误如下

```
[luojie@VM-0-14-centos Hello]$ ls 
Hello.class  Hello.java
[luojie@VM-0-14-centos Hello]$ java Hello.class
Error: Could not find or load main class Hello.class
```

搞了半天，才发现是使用 `java Hello` 来执行，并不是使用 `java Hello.class`。

CentOS 机器上安装 java 和 ，java-devel 才能正常的编译。

