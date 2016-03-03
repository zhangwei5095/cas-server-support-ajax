# CAS Server Support Ajax

CAS without the login screen and authentication with AJAX.


## Requirements

* JDK 1.7+
* CAS Server 4.1+

## Quick Start

##### 1. Add dependency to `cas-server-webapp` pom.xml

```xml
<dependency>
    <groupId>io.jstack</groupId>
    <artifactId>cas-server-support-ajax</artifactId>
    <version>0.0.1</version>
<dependency>
```

##### 2. Edit `cas-server-webapp` web.xml: add `classpath:spring/ajax-content.xml` to `contextConfigLocation`, e.g:

```xml
<init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/cas-servlet.xml, /WEB-INF/cas-servlet-*.xml,classpath:spring/ajax-context.xml
    </param-value>
</init-param>
```
