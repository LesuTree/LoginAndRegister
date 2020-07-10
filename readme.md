#代码说明


 ##参考文章
    https://blog.csdn.net/yurong33333/article/details/88604219

##src-com-atguigu


  下分1：databaseTools包含jdbc,databaseFunction
              jdbc初始化连接数据库
              databaseFunction用于增加数据，查询数据


  下分2：userDevelopment:包含user，包含的数据是每一位用户的信息，进行和数据库相关的增加数据和查询数据相关的操作


  下分3：servlet:包含两个servlet，LoginServlet用于接收login.jsp页面发送的请求，判断方法是传入数据合法，查询操作成功转发至Success.jsp，并对相应的用户进行欢迎
                                                    RegisterServlet用于接收register.jsp页面发送的请求，判断方法是传入的数据完整，则增添数据，否则重新返回register.jsp



##webcontent:



  下有1：success.jsp:登录成功后对特定的用户欢迎


  下有2：login.jsp：登录页面,下有关于register.jsp页面的超链接，和sumbit指向LoginServlet的按钮


  下有3：register.jsp:注册页面，下有sumbit指向RegisterServlet的按钮

##数据库


  id(主键)，firstname,lastname,email均为varchar类型。
