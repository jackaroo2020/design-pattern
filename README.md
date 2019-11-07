#### 设计模式
 <b>设计模式学习笔记源码总结记录。对于项目中有错误之处，欢迎提出改正，谢谢！</b>
 
设计模式（Design pattern）代表了最佳的实践，通常被有经验的面向对象的软件开发人员所采用。设计模式是软件开发人员在软件开发过程中面临的一般问题的解决方案。
这些解决方案是众多软件开发人员经过相当长的一段时间的试验和错误总结出来的。

#### 设计模式的类型
* 创建型模式
  这些设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用 new 运算符直接实例化对象。这使得程序在判断针对某个给定实例需要创建哪些对象时更加灵活。
      [工厂模式（Factory Pattern）](note/pattern_01.md) 
      [抽象工厂模式（Abstract Factory Pattern）](note/pattern_02.md) 
      单例模式（Singleton Pattern）
      建造者模式（Builder Pattern）
      原型模式（Prototype Pattern）

* 结构型模式
  这些设计模式关注类和对象的组合。继承的概念被用来组合接口和定义组合对象获得新功能的方式。
      适配器模式（Adapter Pattern）
      桥接模式（Bridge Pattern）
      过滤器模式（Filter、Criteria Pattern）
      组合模式（Composite Pattern）
      装饰器模式（Decorator Pattern）
      外观模式（Facade Pattern）
      享元模式（Flyweight Pattern）
      代理模式（Proxy Pattern）

* 行为型模式
  这些设计模式特别关注对象之间的通信。
      责任链模式（Chain of Responsibility Pattern）
      命令模式（Command Pattern）
      解释器模式（Interpreter Pattern）
      迭代器模式（Iterator Pattern）
      中介者模式（Mediator Pattern）
      备忘录模式（Memento Pattern）
      观察者模式（Observer Pattern）
      状态模式（State Pattern）
      空对象模式（Null Object Pattern）
      策略模式（Strategy Pattern）
      模板模式（Template Pattern）
      访问者模式（Visitor Pattern）

* J2EE 模式
  这些设计模式特别关注表示层。这些模式是由 Sun Java Center 鉴定的。
      MVC 模式（MVC Pattern）
      业务代表模式（Business Delegate Pattern）
      组合实体模式（Composite Entity Pattern）
      数据访问对象模式（Data Access Object Pattern）
      前端控制器模式（Front Controller Pattern）
      拦截过滤器模式（Intercepting Filter Pattern）
      服务定位器模式（Service Locator Pattern）
      传输对象模式（Transfer Object Pattern）

#### 设计模式的六大原则
1、开闭原则（Open Close Principle）
   开闭原则的意思是：对扩展开放，对修改关闭。

2、里氏代换原则（Liskov Substitution Principle）
   任何基类可以出现的地方，子类一定可以出现。里氏代换原则是对开闭原则的补充。里氏代换原则是对实现抽象化的具体步骤的规范。

3、依赖倒转原则（Dependence Inversion Principle）
   这个原则是开闭原则的基础，具体内容：针对接口编程，依赖于抽象而不依赖于具体。

4、接口隔离原则（Interface Segregation Principle）
   使用多个隔离的接口，比使用单个接口要好。它还有另外一个意思是：降低类之间的耦合度。

5、迪米特法则，又称最少知道原则（Demeter Principle）
   最少知道原则是指：一个实体应当尽量少地与其他实体之间发生相互作用，使得系统功能模块相对独立。

6、合成复用原则（Composite Reuse Principle）
   尽量使用合成/聚合的方式，而不是使用继承。
   
    
[工厂模式](note/pattern_01.md)  
[抽象工厂模式](note/pattern_02.md)
    