maven中没有找到可以用的ojdbc jar，配置本地jar包依赖
下载地址：http://www.oracle.com/technetwork/database/features/jdbc/jdbc-ucp-122-3110062.html
下载后将jar包配置为本地pom jar
C:\Users\z003xp9h\Downloads>mvn install:install-file -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=12.2.0.1 -Dpackaging=jar -Dfile=ojdbc8.jar -DgeneratePom=true
最后在pom中配置加入依赖
<dependency>
<groupId>com.oracle</groupId>
<artifactId>ojdbc8</artifactId>
<version>12.2.0.1</version>
</dependency>
