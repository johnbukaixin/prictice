package com.ptl.practice.designpatterns;

/**
 * created by panta on 2019/1/15.
 *  懒汉式
 * @author panta
 */
public enum  EnumTypeSingleton {
    INSTANCE;

    private EnumTypeSingleton() {
    }

   public void doSomething(){
       System.out.printf("haha");
   }
}
