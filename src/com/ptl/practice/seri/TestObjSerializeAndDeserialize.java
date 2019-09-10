package com.ptl.practice.seri;

import java.io.*;

/**
 * created by panta on 2019/9/10.
 *
 * @author panta
 */
public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws Exception {

        // 序列化DataObject对象
//        Serialize();

        // 反序列DataObject对象
        TestObject object = Deserialize();

        // 静态成员属于类级别的，所以不能序列化，序列化只是序列化了对象而已，
        // 这里的不能序列化的意思，是序列化信息中不包含这个静态成员域，下面
        // 之所以i输出还是2，是因为测试都在同一个机器（而且是同一个进程），因为这个jvm
        // 已经把i加载进来了，所以获取的是加载好的i，如果是传到另一台机器或者关掉程序重新
        // 写个程序读入DataObject.txt，此时因为别的机器或新的进程是重新加载i的，所以i信息就是初始时的信息，即0
        System.out.println(object);
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     * @author
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static void Serialize() throws FileNotFoundException, IOException {

        TestObject object = new TestObject();
        object.setHello("123");
        object.setWorld("word");

        // 创建ObjectOutputStream对象输出流，其中用到了文件的描述符对象和文件输出流对象
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("d:\\TestObject.txt")));

        // 将DataObject对象存储到DataObject.txt文件中，完成对DataObject对象的序列化操作
        oo.writeObject(object);

        System.out.println("Person对象序列化成功！");

        // 最后一定记得关闭对象描述符！！！
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列DataObject对象
     * @author
     * @return
     * @throws Exception
     * @throws IOException
     */
    private static TestObject Deserialize() throws Exception, IOException {

        // 创建ObjectInputStream对象输入流，其中用到了文件的描述符对象和文件输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("d:\\TestObject.txt")));

        // 从DataObject.txt文件中读取DataObject对象，完成对DataObject对象的反序列化操作
        TestObject object = (TestObject) ois.readObject();
        System.out.println("Person对象反序列化成功！");

        // 最后一定记得关闭对象描述符！！！
        ois.close();

        return object;
    }

}
