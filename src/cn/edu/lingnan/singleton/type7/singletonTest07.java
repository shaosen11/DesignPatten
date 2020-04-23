package cn.edu.lingnan.singleton.type7;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 18:09 2020/4/23
 */
public class singletonTest07 {
    public static void main(String[] args) {
        System.out.println("使用静态内部类");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode()=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode()=" + singleton2.hashCode());
    }
}

//静态内部类
class Singleton {
    private static volatile Singleton instance;

    //1.构造器私有化
    private Singleton() {
    }

    //写一个静态内部类，该类有一个静态属性Singleton
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
