### 装饰器模式    

#### 定义
允许向一个现有的对象添加新的功能，同时又不改变其结构。    

#### 意图          
动态地给一个对象添加一些额外的职责。

#### 主要解决   
一般的，我们为了扩展一个类经常使用继承方式实现，由于继承为类引入静态特征，并且随着扩展功能的增多，子类会很膨胀。

####  何时使用      
在不想增加很多子类的情况下扩展类。      

#### 如何解决       
将具体功能职责划分，同时继承装饰者模式。

#### 关键代码
1、Component 类充当抽象角色，不应该具体实现。        
2、修饰类引用和继承 Component 类，具体扩展类重写父类方法。          

#### 应用实例      
1、在 JAVA AWT 和 SWING 中，对于 Button 和 Checkbox 是树叶，Container 是树枝。         

#### 优点         
1、装饰类和被装饰类可以独立发展，不会相互耦合，装饰模式是继承的一个替代模式，装饰模式可以动态扩展一个实现类的功能。         

#### 缺点     
多层装饰比较复杂。     

#### 使用场景      
1、扩展一个类的功能。       
2、动态增加功能，动态撤销。

#### 注意事项       
定义时为具体类。

#### 实现     
我们将创建一个 Shape 接口和实现了 Shape 接口的实体类。然后我们创建一个实现了 Shape 接口的抽象装饰类 ShapeDecorator，并把 Shape 对象作为它的实例变量。
RedShapeDecorator 是实现了 ShapeDecorator 的实体类。
DecoratorPatternDemo，我们的演示类使用 RedShapeDecorator 来装饰 Shape 对象。      
![Alt text](./images/decorator_pattern.jpg)

#### 示例Java代码
[装饰器模式](../src/main/java/com/lvt/pattern_10)