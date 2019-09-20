package design.patterns.adapter.javaCustomAdapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 将枚举转迭代器适配器
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    //Enumeration是一个"只读"接口，不支持迭代器的remove()。也可以不重写该方法，默认就会抛出异常
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
