# learn-leishen-ssm
## 事务

### 事务传播

| 类别          | 描述                                                         | 是否常用 |
| ------------- | ------------------------------------------------------------ | -------- |
| REQUIRED      | 如果有事务在运行，当前的方法就在这个事务内运行，否则，就启动一个新的事务，并在字节的事务内运行 | 是       |
| REQUIRED_NEW  | 当前的方法必须启动新事务，并在它自己的事务内运行，如果有事务正在运行，应该将它挂起 | 是       |
| SUPPORTS      | 如果有事务正在运行，当前的方法就在这个事务内运行，否则它可以不运行在事务中 | 否       |
| NOT_SUPPORTED | 当前的方法不应该运行在事务中，如果有运行的事务，将它挂起     | 否       |
| MANDATORY     | 当前的方法必须运行在事务内部，如果没有正在运行的事务，就抛出异常 | 否       |
| NEVER         | 当前的方法不应该运行在事务中，如果有运行的事务，就抛出异常   | 否       |
| NESTED        | 如果有事务在运行，当前的方法就应该在这个事务的嵌套事务内运行，否则，就启动一个新的事务，并在它字节的事务内运行 | 否       |



### xml版

```xml
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource" />
</bean>

<aop:config>
    <aop:pointcut id="txPoint" expression="execution(* com.ww.spring.service.*.*(..))" />
    <aop:advisor advice-ref="txAdvice" pointcut-ref="txPoint" />
</aop:config>

<tx:advice transaction-manager="transactionManager" id="txAdvice">
    <tx:attributes>
        <tx:method name="batchInsert" propagation="REQUIRED" timeout="-1"/>
    </tx:attributes>
</tx:advice>
```



### 注解版

```java
<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
    <property name="dataSource" ref="dataSource" />
</bean>

<tx:annotation-driven transaction-manager="transactionManager" />
```

