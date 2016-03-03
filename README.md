# CAS Server support Ajax

CAS without the login screen and authentication with AJAX.

## Requirements

* JDK 1.7+
* CAS Server 4.1+
* JSONP (cross-domain login)
## How to use ?

#### Get login ticket on the login page

###### 1. Add dependency to cas-server-webapp `pom.xml`

```xml
<dependency>
    <groupId>io.jstack</groupId>
    <artifactId>cas-server-support-ajax</artifactId>
    <version>0.0.1</version>
<dependency>
```

##### 2. Edit the cas-server-webapp `web.xml`: add `classpath:spring/ajax-content.xml` to `contextConfigLocation` param value.
e.g:

```xml
<init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/cas-servlet.xml, /WEB-INF/cas-servlet-*.xml,classpath:spring/ajax-context.xml
    </param-value>
</init-param>
```

Start the cas-server-webapp, you can get the login ticket access http://cas.server.host/a/logins/ticket, like this: 

![Alt text](http://ww4.sinaimg.cn/large/6a70578fjw1f1k3higjg1j20vg04pwge.jpg)
