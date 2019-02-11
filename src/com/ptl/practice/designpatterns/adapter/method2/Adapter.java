package com.ptl.practice.designpatterns.adapter.method2;

import com.ptl.practice.designpatterns.adapter.method2.Source1;
import com.ptl.practice.designpatterns.adapter.method2.Source2;

/**
 * created by panta on 2019/2/11.
 * 对象适配器模式
 * @author panta
 */
public class Adapter  implements Target{

    private Source source;

    public void setSource(Source source) {
        this.source = source;
    }

    @Override
    public void print() {
        System.out.println("普通打印");
        source.printColor();
    }

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        Source1 source = new Source1();
        adapter.setSource(source);
        adapter.print();
        Source2 source2 = new Source2();
        adapter.setSource(source2);
        adapter.print();
    }
}