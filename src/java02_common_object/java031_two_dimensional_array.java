public class java031_two_dimensional_array {
    public static void main(String[] args){
        /**
         * java 二维数组 并不是 正真的 二维数组(数表，有猎德概念)
         */

        // 数组里 再装数组
        int[][] a = {{1,2,4},{9,9,}};
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        // 声明二维数组
        int[][] b = new int[2][3];
        System.out.println(b.length);
        System.out.println(b[0].length);

        //使用二维数组 打印九层妖塔
        String[][] c = new String[9][1];
//        for(String[] i:c) i[0]="         ";
        for(int i=0;i<c.length;i++) {
            c[i][0] = "";
            for(int ii=0;ii<(c.length-i-1);ii++) c[i][0]+=" ";
            for(int ii=0;ii<i+1;ii++) c[i][0]+="*";
            for(int ii=0;ii<i;ii++) c[i][0]+="*";
            System.out.println(c[i][0]);
        }
    }
}
