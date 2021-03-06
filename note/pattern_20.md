### 观察者模式   

#### 定义
当对象间存在一对多关系时，则使用观察者模式。    

#### 意图          
定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。

#### 主要解决   
一个对象状态改变给其他对象通知的问题，而且要考虑到易用和低耦合，保证高度的协作。      

####  何时使用      
一个对象（目标对象）的状态发生改变，所有的依赖对象（观察者对象）都将得到通知，进行广播通知。          

#### 如何解决       
使用面向对象技术，可以将这种依赖关系弱化。

#### 关键代码
在抽象类里有一个 ArrayList 存放观察者们。        

#### 应用实例      
1、拍卖的时候，拍卖师观察最高标价，然后通知给其他竞价者竞价。  

#### 优点         
1、观察者和被观察者是抽象耦合的。      
2、建立一套触发机制。      

#### 缺点     
1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。     
2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。      
3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。      

#### 使用场景      
1、一个对象的改变将导致其他一个或多个对象也发生改变，而不知道具体有多少对象将发生改变，可以降低对象之间的耦合度。       
2、一个对象必须通知其他对象，而并不知道这些对象是谁。

#### 注意事项       
JAVA 中已经有了对观察者模式的支持类。避免循环引用。如果顺序执行，某一观察者错误会导致系统卡壳，一般采用异步方式。            

#### 实现     
观察者模式使用三个类 Subject、Observer 和 Client。Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。我们创建 Subject 类、Observer 抽象类和扩展了抽象类 Observer 的实体类。
ObserverPatternDemo，我们的演示类使用 Subject 和实体类对象来演示观察者模式。      
![Alt text](./images/observer_pattern.jpg)

#### 示例Java代码
[观察者模式](../src/main/java/com/lvt/pattern_20)