package design.patterns.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 测试两个保护代理
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        DynamicProxyTest dynamicProxyTest = new DynamicProxyTest();
        dynamicProxyTest.drive();
    }

    public void drive() {
        PersonBean mike = new PersonBeanImpl();
        PersonBean ownerProxy = getOwnerProxy(mike);
        ownerProxy.setName("mike");
        System.out.println("Name: " + ownerProxy.getName());
        try {
            ownerProxy.setHotOrNotRating(8);
        } catch (Exception e) {
            System.out.println("Can't set hotOrNotRating");
        }

        PersonBean nonOwnerProxy = getNonOwnerProxy(mike);
        System.out.println("Name: " + nonOwnerProxy.getName());
        nonOwnerProxy.setHotOrNotRating(9);
        System.out.println("Rating: " + nonOwnerProxy.getHotOrNotRating());
        try {
            nonOwnerProxy.setName("jack");
        } catch (Exception e) {
            System.out.println("Can't set name");
        }

        System.out.println(ownerProxy.getHotOrNotRating());
        System.out.println(mike.getHotOrNotRating());
    }

    //动态生成代理（权限为自己）
    PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
    }

    //动态生成代理（权限为他人）
    PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
    }
}
