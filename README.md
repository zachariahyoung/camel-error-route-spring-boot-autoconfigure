# camel-error-route-spring-boot-autoconfigure

This is a simple error camel route that can be used to route poison messages to an error location.

Configure the route in an out parameters in the applications.properties file.

```java
error.route.in-url=direct:error
error.route.out-url=activemq:EXCEPTION
```

Reference the direct:error


```java
   from("activemqtx:JPATX").routeId("TriggerTX")
                    .onException(UpperCaseException.class)
                    .maximumRedeliveries(2)
                    .handled(true)
                    .to("direct:error")
                    .markRollbackOnlyLast()
                    .end()
                .transacted()
                .bean("exceptionService")
                .to("log:out");
    }
```
