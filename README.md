### 产生乱码原因编码不一致
#### 1.创建数据库没有用utf8编码
#### 2.连接数据库没用utf-8
#### 3.不同页面的编码不一致
配置文件中写url

```sql
jdbc:mysql://localhost:3306/db2?serverTimezone=UTC&amp;useUnicode=true&amp;characterEncoding=UTF-8"
```
在类中中赋值
```sql
jdbc:mysql://localhost:3306/db2?serverTimezone=UTCuseUnicode=true&characterEncoding=UTF-8"
```

#### 常见的注解

* @Lazy
---

```
懒加载
```
* @Bean
---

```
作用：
该注解只能写在方法上，表明使用此方法创建一个对象，并且放入 spring 容器。
属性：
name：给当前@Bean 注解方法创建的对象指定一个名称(即 bean 的 id）。
```
  
* @Configuration
---

```
用于指定当前类是一个 spring 配置类，当创建容器时会从该类上加载注解。获取容器时需要使用
AnnotationApplicationContext(有@Configuration 注解的类.class)。

```
* @ComponentScan(basePackages = "cn.edu.hebuee")
---

```
作用：
用于指定 spring 在初始化容器时要扫描的包。作用和在 spring 的 xml 配置文件中的：
<context:component-scan base-package="com.itheima"/>是一样的。
属性：
basePackages：用于指定要扫描的包。和该注解中的 value 属性作用一样。
```

* @Repository("accountDao")
---  
```
 是 Spring 的注解，用于声明一个 Bean
```

* @Autowired
---  
```
用于向组件内自动装配一个bean，默认按类型装配，如果同样类型有多个，取属性名作为id从容器中获取
```
* @Scope
---
```
@Scope注解是springIoc容器中的一个作用域，在 Spring IoC 容器中具有以下几种作用域：
基本作用域singleton（单例）、prototype(多例)，Web 作用域（reqeust、session、globalsession），自定义作用域
```
* @Service("accountService")
---
```
都是用来标记Spring容器组件的，只是场景不同；Controller Service Repository 在Component上扩展
@Resource是java的标准，不指定名称时，按属性名称装配；如果没有，按类型装配
```
*  @PropertySource
```
用于加载.properties 文件中的配置。例如我们配置数据源时，可以把连接数据库的信息写到
properties 配置文件中，就可以使用此注解指定 properties 配置文件的位置。
属性：
value[]：用于指定 properties 文件位置。如果是在类路径下，需要写上 classpath:

```
*  @Import
```
导入其他配置类
属性：
value：用于指定配置类的字节码

```

#### 依赖选择

NoClassDefFoundError: javax/servlet/ServletContext

```
一开始用的spring-context依赖版本是5.0.2.RELEASE配合spring-test5.0.5.RELEASE

org.springframework spring-context 5.0.2.RELEASE org.springframework spring-test 5.0.5.RELEASE
更改为spring-context依5.0.5.RELEASE,配合spring-test5.0.5.RELEASE就可以了

```

junit 选择版本 12

@RunWith(SpringJUnit4ClassRunner.class)报错

spring5要用junit版本4.12以上

改test 改junit版本
不知道的代码启啥作用
```
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-surefire-plugin</artifactId>
            <version>2.4.2</version>
            <configuration>
                <skipTests>true</skipTests>
            </configuration>
        </plugin>
    </plugins>
```


