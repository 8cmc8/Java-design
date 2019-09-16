package design.patterns.singleton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 一个经典的单例模式实现(注意多线程情况会出现多个实例)
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance =  new Singleton();
        }
        return uniqueInstance;
    }
}

//解决方案1：若getInstance()的性能对应用程序不是很关键，只需用synchronized关键词修饰即可（每次都要进入同步方法）
//（如将getInstance()的程序使用在频繁运行的地方，就要重新考虑了）
class Singleton1 {
    private static Singleton1 uniqueInstance;

    private Singleton1() {

    }

    public synchronized static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance =  new Singleton1();
        }
        return uniqueInstance;
    }
}

//解决方案2：提前实例化，而不用延迟实例化的做法(饿汉式)
class Singleton2 {
    //保证了线程安全（JVM在加载类时就创建此唯一单例，保证任何线程在访问uniqueInstance静态变量之前，一定先创建此实例。）
    private static Singleton2 uniqueInstance = new Singleton2();

    private Singleton2() {

    }

    public Singleton2 getInstance() {
        return uniqueInstance;
    }
}

//解决方案3：用"双重检验加锁"(更注重性能)
class Singleton3 {
    //对象的创建可能发生指令的重排序，使用 volatile可以禁止指令的重排序，保证多线程环境内的系统安全。
    //new实例背后的指令：
    //1、分配对象内存
    //2、调用构造器方法，执行初始化
    //3、将对象引用赋值给变量
    //以上代码 2,3 可能发生重排序，但是并不会重排序 1 的顺序。（ 2,3 指令需要依托 1 指令执行结果。）
    //volatile主要包含两个功能
    //保证可见性:使用 volatile定义的变量，将会保证对所有线程的可见性;
    //禁止指令重排序优化。
    //由于 volatile禁止对象创建时指令之间重排序，所以其他线程不会访问到一个未初始化的对象，从而保证安全性。
    //注意，volatile禁止指令重排序在 JDK 5 之后才被修复
    private volatile static Singleton3 uniqueInstance;

    private Singleton3() {

    }

    public static Singleton3 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
