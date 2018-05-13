基于任务三代码的修改

1.webapp/page           任务四用到的页面
webapp/page/component  组件页面
webapp/page/template   模版页面


2.web-inf 下的firstDemo.tld文件是自定义jstl的tag标签的配置文件
对应的标签处理类在util包下tagDemo.java类里。
自定义标签的作用用于将long的毫秒值转化为日期格式。


3.在Springmvc.xml里，有配置了对tiles页面的视图解析器支持，并将优先级设置的高于普通jsp,不然会报错
order代表优先级，值越小优先级越高，任务二时的那个视图解析器order我设置的11，只要大于10就好。

下面也有tiles的definition.xml所在路径。

<bean id="tilesConfigurer" class="org.springframework.web.servlet.view.tiles3.TilesConfigurer">
        <property name="definitions">
            <list>
                <value>/WEB-INF/tiles/tiles-definitions.xml</value>
            </list>
        </property>
    </bean>
    <bean id="viewResolver" class="org.springframework.web.servlet.view.UrlBasedViewResolver">
        <property name="viewClass" value="org.springframework.web.servlet.view.tiles3.TilesView"/>
        <property name="order" value="10"/>
    </bean>

4.在webapp/page/component/body路径下的vocationbody.jsp，这个jsp里对foreach的用法很值得以后借鉴，以前只是中规中矩的用，
这次用出了花。其实就是一些嵌套。


5.由于在部署到服务器时出现了多个项目包导致的webAppRootKey问题，所以我在web.xml里添加了获取webAppRootKey的配置。
# Task4   by LittleSong
