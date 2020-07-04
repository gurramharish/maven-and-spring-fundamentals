# Maven Fundamentals

1. Maven at is simplest is a build tool.

1. Maven produces 1 output it is called artifact.(jar, war, ear, zip)

1. Manage dependencies.(Spring)

1. Handling version/releases

1. Produces javadocs/site information.

1. Repetiable builds

1. Transitive dependencies.

1. Maven create a maven repo locally.

1. If we are using maven without springboot parent, you need to include required plugins to compile and choose which java version to use.

## Without Springboot maven pom.xml sample

1. To set the java source and target version for maven, we have two approaches

    i. By setting maven.compiler.source and maven.compiler.target in properties like bellow
      ```xml
      <project>
        [...]
        <properties>
          <maven.compiler.source>1.8</maven.compiler.source>
          <maven.compiler.target>1.8</maven.compiler.target>
        </properties>
        [...]
      </project>
      ```
    ii. By adding maven-compiler-plugin and configuring source and tatget.
      ```xml
      <project>
        [...]
        <build>
          [...]
          <plugins>
            <plugin>
              <groupId>org.apache.maven.plugins</groupId>
              <artifactId>maven-compiler-plugin</artifactId>
              <version>3.8.1</version>
              <configuration>
                <source>1.8</source>
                <target>1.8</target>
              </configuration>
            </plugin>
          </plugins>
          [...]
        </build>
        [...]
      </project>
      ```

1. For examples lets take you are using some of the java 6 or higher version java features in your code, without telling the source in maven-compiler-plugin or not setting the source and traget properties,  maven will choose deafult version as 1.5 and thorw error like bellow.

    ```log
    [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile) on project maven-and-spring-fundamentals: Compilation failure
    [ERROR] .../maven-and-spring-fundamentals/src/main/java/com/hans/msf/App.java:[14,40] lambda expressions are not supported in -source 1.5
    [ERROR]   (use -source 8 or higher to enable lambda expressions)
    ```

1. If your Maven project contains code generation using annotation processor, Maven compiler plugin has a configuration for you, called annotationProcessorPath. It defines classpath elements to supply as annotation processor path. If specified, the compiler will detect annotation processors only in those classpath elements.

    ```xml
    <plugin>
      <artifactId>maven-compiler-plugin</artifactId>
      <version>3.8.0</version>
      <configuration>
        <annotationProcessorPaths>
          <annotationProcessorPath>
            <groupId>com.google.auto.value</groupId>
            <artifactId>auto-value</artifactId>
            <version>1.6.2</version>
          </annotationProcessorPath>
        </annotationProcessorPaths>
      </configuration>
    </plugin>
    ```
    The main benefit of using annotationProcessorPath is that the dependencies declared here is not included in your dependency tree. Therefore, it won’t be used by your clients transitively by mistake.

1. The Surefire Plugin is used during the test phase of the build lifecycle to execute the unit tests of an application. It generates reports in two different file formats:
Plain text files (*.txt)
XML files (*.xml)
By default, these files are generated in ${basedir}/target/surefire-reports/TEST-*.xml.

    ```xml
    <build>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.0.0-M5</version>
          <configuration>
            <excludes>
              <exclude>**/SampleTest.java</exclude>
            </excludes>
          </configuration>
        </plugin>
      </plugins>
    </build>
    ```


1. We can system properties which can be used by test cases in maven-surefire-plugin.

    ```xml
    <configuration>
      <systemProperties>
        <property>
          <name>environment</name>
          <value>test</value>
        </property>
      </systemProperties>
    </configuration>
    ```

1. We have maven-surefire-report-plugin to generate reports in html format so that we can see in browser.
By using the command 
    ```bash
    mvn surefire-report:report
    ```

    ```xml
    <reporting>
      <plugins>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-surefire-report-plugin</artifactId>
          <version>3.0.0-M5</version>
        </plugin>
      </plugins>
    </reporting>
    ```


1. Jacoco pulgin to get the code coverage by running the test cases.


# Spring Fundamentals

1. Spring framework is intially developed as inversion of control container, which also known as dependency injection.

1. It increase the testability, maintainability, Scalability.

1. It decouple things, we can introduce caching layers.

1. Add bellow dependency for spring dependency injection.

    ```xml
    <dependency>
		    <groupId>org.springframework</groupId>
		    <artifactId>spring-context</artifactId>
		    <version>5.2.7.RELEASE</version>
		</dependency>
    ```

1. 5 scopes of spring beans Singleton, Prototype, Request, Session, Global.

# Java 8 Notes

1.