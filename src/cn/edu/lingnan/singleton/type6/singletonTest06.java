package cn.edu.lingnan.singleton.type6;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 18:09 2020/4/23
 */
public class singletonTest06 {
    public static void main(String[] args) {
        System.out.println("懒汉式，双重检查");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode()=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode()=" + singleton2.hashCode());
    }
}

//懒汉式(双重锁)
class Singleton {
    private static volatile Singleton instance;

    //1.构造器私有化
    private Singleton() {
    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
