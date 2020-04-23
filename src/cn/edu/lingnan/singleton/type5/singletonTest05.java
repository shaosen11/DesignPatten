package cn.edu.lingnan.singleton.type5;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 18:09 2020/4/23
 */
public class singletonTest05 {
    public static void main(String[] args) {
        System.out.println("懒汉式，线程安全");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode()=" + singleton1.hashCode());
        System.out.println("singleton2.hashCode()=" + singleton2.hashCode());
    }
}

//懒汉式(看似安全，实际不安全)
class Singleton {
    private static Singleton instance;

    //1.构造器私有化
    private Singleton() {
    }

    //提供一个静态的公有方法，加入同步处理的代码
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }
}
