#### 定义
是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

#### 意图          
提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。

#### 主要解决   
主要解决接口选择的问题。

####  何时使用      
系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

#### 如何解决       
在一个产品族里面，定义多个产品。

#### 关键代码
在一个工厂里聚合多个同类产品。

#### 应用实例       

#### 优点         
1、当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。  

#### 缺点     
产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。

#### 使用场景      
1、生成不同操作系统的程序。         

#### 注意事项       
产品族难扩展，产品等级易扩展

#### 实现     
创建 Shape 和 Color 接口和实现这些接口的实体类。下一步是创建抽象工厂类 AbstractFactory。接着定义工厂类 ShapeFactory 和 ColorFactory，这两个工厂类都是扩展了 AbstractFactory。
然后创建一个工厂创造器/生成器类 FactoryProducer。AbstractFactoryPatternDemo演示类使用 FactoryProducer 来获取 AbstractFactory 对象。它将向 AbstractFactory 传递形状信息 
Shape（CIRCLE / RECTANGLE / SQUARE），以便获取它所需对象的类型。同时它还向 AbstractFactory 传递颜色信息 Color（RED / GREEN / BLUE），以便获取它所需对象的类型。      
![Alt text](./images/abstract_factory_pattern.jpg)