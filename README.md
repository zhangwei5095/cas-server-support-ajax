# CAS Server support AJAX

CAS without the login screen and cross-domain authentication with AJAX.

## Requirements

* JDK 1.7+
* CAS Server 4.1+
* JSONP (cross-domain login)

## How to use?

#### Configuration

* Edit the cas-server-webapp `pom.xml`, add the following to the pom.xml:
```xml
<dependency>
    <groupId>io.jstack</groupId>
    <artifactId>cas-server-support-ajax</artifactId>
    <version>0.0.1</version>
<dependency>
```

* Edit the cas-server-webapp `web.xml`, add `classpath:spring/ajax-content.xml` to `contextConfigLocation` param value.
e.g:
```xml
<init-param>
    <param-name>contextConfigLocation</param-name>
    <param-value>/WEB-INF/cas-servlet.xml, /WEB-INF/cas-servlet-*.xml,classpath:spring/ajax-context.xml
    </param-value>
</init-param>
```

Start the cas-server-webapp, You can try to access http://cas.server.host/a/logins/ticket and get the login ticket , like this: 

![Alt text](http://ww2.sinaimg.cn/large/6a70578fjw1f1k3wahw9rj20rq0490uh.jpg)


#### Get login ticket on the login page

Login from example:
```html
<from method="post" action="/a/logins">
<input name="username" type="input" id="username"/>
<input name="passport" type="passport" id="passport"/>

<input type="hidden" id="lt" name="lt" />
<input type="hidden" id="execution" name="execution" />
<input type="hidden" name="_eventId" value="submit"/>

<input type="submit" value="login" name="submit">
</form>
```


Initialize Login Ticket Using JQuery:

```js
var ticketApi = 'http://local.casserver:8080/a/logins/ticket?callback=?';
$.getJSON( ticketApi, {
    service: 'https://www.baidu.com'
}).done(function(data) {
    $("#lt_input").val(data.lt);
    $("#execution_input").val(data.execution);
})
```
