# 记录自己实现设计模式的过程

#参考文档
 菜鸟教程<设计模式>：https://www.runoob.com/design-pattern/prototype-pattern.html
 公众号:java知音《https://www.javazhiyin.com/tag/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F》

#对应关系
P01___工厂模式
P02___抽象工厂模式
P03___单例模式
P04___建造者模式
  适用场景：当创建一个对象比较复杂比较复杂（多顺序、多部件）时候可以考虑用建造者模式
  重要构成部分：
       抽象建造者（builder）：描述具体建造者的公共接口，一般用来定义建造细节的方法，并不涉及具体的对象部件的创建。
       具体建造者：描述具体建造者，并实现抽象建造者公共接口。
       指挥者（Director）:调用具体建造者来创建复杂对象（产品）的各个部分，并按照一定顺序（流程）来建造复杂对象。
       产品（Product）：描述一个由一系列部件组成较为复杂的对象
P05___原型模式
  使用场景：在一些重复创建对象的场景下，使用clone对象的方式创建对象，避免消耗资源。
  通过实现Cloneable接口，避免了重复创建对象，通过clone的方式创建，避免了创建对象是消耗的资源。例子：打飞机游戏中的敌机
P06___适配器模式
P07___桥接模式
P08___过滤器模式
P09___组合模式
P10___装饰器模式
  适用场景：
        a:想扩展一个类的方法，但又不想通过实现的方式
        b：想扩展一个类，但有不想影响其子类
  装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
  这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
  我们通过下面的实例来演示装饰器模式的用法。其中，我们将把一个形状装饰上不同的颜色，同时又不改变形状类。
  重要构成部分：
   构件（Component）：接口，用于定义整个实体空间的最基础的行为规范；
   构件实体（ConcreteComponent）：实现Component的实体类，本身具有一些功能，同时也是被装饰（被扩充）的类；
   装饰器（Decorator）：实现Component的类，其中维护一个ConcreteComponent的实例，具体的装饰功能由其子类实现；
   装饰器实体（ConcreteDecorator）：继承Decorator并实现具体的装饰功能。
   
P11___外观模式
P12___享元模式
    适用场景：
        a: 一个程序需要大量相识或者相同的对象，且造成很大开销的时候。
        b: 大部分对象可以根据内部状态分组。且可以将不同的部分外部化，这样每个组只需保存一个内部状态
    主要构成部分：
        a:抽象享元角色（Concrete Flyweight）:实现抽象享元角色中所规定的接口
        b:具体的享元角色（Concrete Flyweight）： 实现了抽象享元角色中所规定的的接口
        c:非享元角色（Unsharable Flyweight） 不共享的外部状态，以参数的形式注入到具体的享元相关方法中。
        d:享元工厂（Flyweight Factory）：负责创建和管理享元角色
P13___代理模式
P14___责任链模式
P15___命令模式
P16___解释器模式
P17___迭代器模式
P18___中介者模式
P19___备忘录模式
P20___观察者模式
P21___状态模式
P22___空对象模式
P23___策略模式
P24___模板模式
P25___访问者模式
P26___MVC 模式
P27___业务代表模式
P28___组合实体模式
P29___数据访问对象模式
P30___前端控制器模式
P31___拦截过滤器模式
P32___服务定位器模式
P33___传输对象模式


