import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class java055_Bufferedreader_PrintWriter {
    public static void main(String[] args) throws IOException {
        /**
         * 简单的读取写入方法
         *
         * 注意: 读取写入的操作 中 容易出现的 异常 IOException(父类)
         */

        // 构建 读取对象
        BufferedReader reader = new BufferedReader(new FileReader(new File("./src/csCode/004.txt")));
        // 构建写入对象
        // 不支持 续写
//        PrintWriter writer = new PrintWriter("./src/csCode/005.txt", Charset.forName("utf-8"));
        // 支持续写 append参数 设为 true
        FileOutputStream fos = new FileOutputStream("./src/csCode/005.txt",true);
        // readline 读取一行,读到最后 返回 -1
        // ready 方法 做判断，是否还有数据
        while (reader.ready()){
            String lines = reader.readLine();
            System.out.println(lines);
            // 可以操作 读取的 字符串数据
            lines = lines.replace("英语","编程");

            //写入数据，Pw的写入
//            writer.println(lines);
//            writer.flush();     // 必须调用该方法

            // fos的写入,支持续写
            fos.write((lines+"\n").getBytes(StandardCharsets.UTF_8));
            if (!reader.ready()) fos.close();
        }



    }
}
