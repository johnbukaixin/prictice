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

    public Adapter(Source source) {
        this.source = source;
    }

    @Override
    public void print() {
        System.out.println("普通打印");
        source.printColor();
    }

    public static void main(String[] args) {
        Target adapter = new Adapter(new Source1());
        adapter.print();
        Target adapter1 = new Adapter(new Source1());
        adapter1.print();
    }
}
