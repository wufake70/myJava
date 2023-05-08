import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class java054_file_stream_copy {
    public static void main(String[] args) throws IOException {
        /**
         * 文件流 操作
         *
         *
         */

        System.out.println("================创建对象==============");
        // 创建文件对象,传入文件路径
        File file = new File(".");

        System.out.println("================判断是否存在==============");
        System.out.println("该路径是否存在 "+(file.exists()?"是":"否"));
//        file = new File("D:/.important2");    切换路径
//        System.out.println("该路径是否存在 "+(file.exists()?"是":"否"));

        System.out.println("================对文件操作==============");
        System.out.println("是"+(file.isFile()?" 文件":" 文件夹"));
        System.out.println("是"+(file.isDirectory()?" 文件夹":" 文件"));

        System.out.println("=============创建文件目录============");
        file = new File("./src/csCode");
        // mkdir() 创建一级文件夹，mkdirs 创建多级文件夹
//        System.out.println(file.exists() ? "存在 不作处理..." : "不存在 即刻创建..." + file.mkdir());
        file = new File("./src/csCode/001");
        System.out.println(file.exists() ? "存在 不作处理..." : "不存在 即刻创建..." + file.mkdirs());

        System.out.println("=============创建文件==============");
        file = new File("./src/csCode/001.txt");
        // createNewFile
        System.out.println(file.exists() ? "存在 不作处理..." : "不存在 即刻创建..." + file.createNewFile());

        System.out.println("=============后去当前文件的绝对路径===========");
        System.out.println("当前文件绝对路径: "+file.getAbsoluteFile());



        System.out.println("=============获取当前文件夹的文件列表==============");
        file = new File("./src");
        // list方法返回 String数组，但是String数组的操作 太少了，
        // 可转换为 列表
        List fli = Arrays.asList(file.list());
        System.out.println(fli);
//        for (Object s : fli) System.out.print(s.toString()+"这是第"+fli.indexOf(s)+"个文件"+(fli.indexOf(s)%2 ==0?"\n":"\t\t\t\t\t"));

        // listFiles 获取 文件对象数组，再转列表
//        File[] fliobj = file.listFiles();
//        List<File> fliobj = Arrays.asList(file.listFiles());        // ****这里要 传入泛型 参数 File，否则 默认的Object 类型，会造成 多态 限制 对象自身的方法；****
//        for (File o : fliobj) System.out.println(o);




        System.out.println("===============文件的复制(读取/写入)==============");
        File f1 = new File("./src/csCode/001.txt");
        File f2 = new File("./src/csCode/002.txt");
        System.out.println(f1.exists() ? "存在" : "创建..."+f1.createNewFile());
//        System.out.println(f2.exists() ? "存在" : "创建..."+f2.createNewFile());
        // 文件输入流,
        FileInputStream inp = null;
        // 文件输出流,
        FileOutputStream out = null;
        try{
            // 创建输入输出 管道
            inp = new FileInputStream(f1);
            out = new FileOutputStream(f2);
            // 打开阀门 读取数据
            int data = inp.read();    //读取一个,就关闭阀门,并返回int 数据，
                                        // -1表示读取完毕
            while (data != -1){
                out.write(data);        //如果文件不存在 会自动创建，写数据会覆盖 之前内容。
                data = inp.read();
            }

//            byte[] data = inp.readAllBytes();   //读取全部
            // 打开阀门 写入数据
//            out.write(data);

        }catch (RuntimeException e){        // 可能会报错
            System.out.println(e);
        }finally {
            // 收回管道
            if(inp != null) {
                try {
                    inp.close();
                }
                catch(RuntimeException e){
                    System.out.println(e);
                }
            }
            if(out != null) {
                try{
                    out.close();
                }catch (RuntimeException e) {
                    System.out.println(e);
                }
            }
        }


    }
}
