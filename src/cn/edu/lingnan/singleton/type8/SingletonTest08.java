package cn.edu.lingnan.singleton.type8;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 19:00 2020/4/23
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        System.out.println(singleton == singleton1);
    }
}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok~");
    }
}
