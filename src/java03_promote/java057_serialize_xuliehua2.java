import java.io.*;

public class java057_serialize_xuliehua2{
    public static void main(String[] args) throws Exception {
        /**
         *  序列化: 一个对象转换为一组字节，以便在网络上传输或在磁盘上存储
         *  反序列化: 则是将一组字节还原为一个对象
         *
         */

        // 对象输出流
        ObjectOutputStream outObj = new ObjectOutputStream(new FileOutputStream("./src/csCode/006.txt"));
        // 对象输入流
        ObjectInputStream inObj = new ObjectInputStream(new FileInputStream("./src/csCode/006.txt"));

        User56[] objArr = {new User56("无法可", 29, 1), new User56("张三", 33, 0)};

        // 将整个数组 对象写入
        outObj.writeObject(objArr);
        outObj.flush();

        // 读取文件中的对象,读取 出的类型 为Object，需要 强制转换
        User56[] arr = (User56[])(inObj.readObject());
        for (User56 user56 : arr) {
            System.out.println(user56.name+"\t\t"+user56.age+"\t"+user56.gender);

        }


    }
}

// 使用 接口 ，标记要序列化
class User56 implements Serializable{
    String name;
    int age,gender;
    User56(String a,int b,int c){
        this.name = a;
        this.age = b;
        this.gender = c;
    }
}
