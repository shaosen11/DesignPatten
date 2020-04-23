package cn.edu.lingnan.singleton.type1;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 18:09 2020/4/23
 */
public class singletonTest01 {
    public static void main(String[] args) {
        System.out.println("饿汉式");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode()=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode()=" + singleton2.hashCode());
    }
}

//饿汉式
class Singleton {
    //1.构造器私有化
    private Singleton() {

    }

    //2.本类内创建对象实例
    private final static Singleton instance = new Singleton();

    //3.提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance() {
        return instance;
    }
}
