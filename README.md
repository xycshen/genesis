代码生成工具的 maven 插件版本  

## 1
必备的jar包依赖 

```xml
        <!--第一步：引入依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!-- JPA依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <!-- validation依赖-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <!--MySQL JDBC驱动-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>5.1.44</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.6.1</version>
        </dependency>
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.6.1</version>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct-jdk8</artifactId>
            <version>1.3.1.Final</version>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct-processor</artifactId>
            <version>1.3.1.Final</version>
        </dependency>
```

## 3 
插件依赖 

```xml
<plugin>
    <groupId>com.myth</groupId>
    <artifactId>genesis</artifactId>
    <version>1.0-SNAPSHOT</version>
    <configuration>
        <!-- 输出目录(默认java.io.tmpdir) ,项目路径下-->
        <outputDir>src/main/java/</outputDir>
        <!-- 是否覆盖同名文件(默认false) -->
        <fileOverride>false</fileOverride>
        <!-- 开发者名称 -->
        <author>xuyucheng</author>
        <dataSource>
            <driverName>com.mysql.jdbc.Driver</driverName>
            <url>jdbc:mysql://121.40.139.93:3306/multi-tenancy-demo?useSSL=false</url>
            <username>root</username>
            <password>Yi19911024!@#</password>
        </dataSource>
        <strategy>
            <!-- 字段生成策略，四种类型，从名称就能看出来含义：
                nochange(默认),
                underline_to_camel,(下划线转驼峰)
                remove_prefix,(去除前缀，后面保持不变)
                remove_prefix_and_camel(去除前缀，后面转驼峰)  -->
            <naming>underline_to_camel</naming>
            <!-- 表前缀 -->
            <tablePrefix> </tablePrefix>
            <!--Entity中的ID生成策略（默认 id_worker）AUTO - 自动-->
            <idGenType>auto</idGenType>
            <!--自定义超类-->
            <superRepositoryClass>org.springframework.data.jpa.repository.JpaRepository</superRepositoryClass>
            <!-- 要包含的表 与exclude 二选一配置-->
            <include>
                <property>user</property>
                <!--                            <property>table1</property>-->
            </include>
            <!-- 要排除的表 -->
            <!--<exclude>-->
            <!--<property>schema_version</property>-->
            <!--</exclude>-->
        </strategy>
        <packageInfo>
            <!-- 父级包名称，如果不写，下面的service等就需要写全包 -->
            <parent>multi.tenancy</parent>
            <!--service包名(默认service)-->
            <service>service</service>
            <!--serviceImpl包名(默认service.impl)-->
            <serviceImpl>service.impl</serviceImpl>
            <!--entity包名(默认entity)-->
            <entity>entity</entity>
            <!--repository包名(默认repository)-->
            <repository>repository</repository>
        </packageInfo>
        <!--模板路径配置项-->
        <template>
            <!-- 定义controller模板的路径 -->
            <!--<controller>/template/controller1.java.vm</controller>-->
        </template>
    </configuration>
</plugin>
```