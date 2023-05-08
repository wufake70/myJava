public class java032_common_object_array_sort {
    public static void main(String[] args){

        int[] a = {18,5,88,100,29,9,8,5,7,1,4,3,2,4};

        fun1(a);
//        for(int i:a) System.out.println(i);


    }
    // 数组排序----冒泡排序,从小到大
    public static void fun1(int[] a){

        for(int i=0;i< a.length;i++){
            for(int ii=0;ii<a.length-1;ii++){
                if(ii>a.length-i-1) {
                    System.out.println("优化处理......");
                    break;
                }
                int x = a[a.length - ii - 1];    // 从最后一个元素开始
                int y = a[a.length - ii - 2];    // 他的上一个元素
                if(x<y) {           // 元素的值 交换

                    a[a.length - ii - 1] = y;
                    a[a.length - ii - 2] = x;
                }

            }
        }

//        for(int i:a) System.out.println(i);

    }
}
