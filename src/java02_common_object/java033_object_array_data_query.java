public class java033_object_array_data_query {
    public static void main(String[] args){
        /**
         * 数据查询     -- 前提 数据 已经排好序了
         * 二分法查询
         *
         */

        // 查找 17的索引位置
        int[] a = {1,2,4,5,7,9,11,14,17,20};
        System.out.println(fun(9, a));
    }

    // 二分法
    public static int fun(int who,int[] arr){
        int start = 0,
            end = arr.length-1,
            middle = arr.length/2;

        while (start < end){
            // 主要是 who与中间数作比较
            if (arr[middle] == who) return middle;
            else if(arr[middle] < who) {        // 在 中间值的 右边
                start = middle;
                middle += (end-start)/2;        // 整型做除法，会自动 舍去余数
                if (arr[middle] == who) return middle;
                if (arr[middle+1] == who) return middle+1;  // 最右边值
                if (start == middle) return -1;       // 不存在

            }else {                             // 在 中间值的 左边
                end = middle;
                middle -= (end-start)/2;        // 整型做除法，会自动 舍去余数
                if (arr[middle] == who) return middle;
                if (arr[middle-1] == who) return middle-1;  // 最左边值
                if (end == middle) return -1;       // 不存在

            }

        }
        return middle;

    }
}
