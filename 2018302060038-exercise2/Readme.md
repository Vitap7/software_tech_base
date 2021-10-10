### 实验过程

1. 编写index.html文件，创建Form表单，添加控件，引入外部.css文件进行美化。
2. 在web.xml文件中配置`servlet-name`、`servlet-class`以及`servlet-mapping`。
3. 将相关文件放入tomcat安装路径下的webapps文件夹中。
4. 启动tomcat，浏览器中输入`localhost:8080/ex2/index.html`进入。

### 实验过程中遇到的问题及解决方法

##### 问题1

提交表单后gender显示为`on`，hobbies图片显示失败。

###### 解决方法

查看网页源代码，发现图片src属性均为`./resource/img/on.jpg`。

搜索相关问题发现，原因是`radio`及`checkbox`的`value`值默认为`on`。所以如果没有设置`value`属性值，会导致servlet获取`radio`及`checkbox`的值时，出现选中的值为`on`的情况。为`radio`及`checkbox`设置`value`值后，问题解决。

##### 问题2

index.html文件采用了utf-8编码，但特殊符号仍显示为乱码。

###### 解决方法

原因是文件保存时默认为ANSI编码，未采用utf-8编码。修改编码格式后问题解决。