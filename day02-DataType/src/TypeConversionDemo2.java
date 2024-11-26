public class TypeConversionDemo2 {
    /*
        类型转换 - 强制转换
        介绍 : 将取值范围大的数据或变量，给取值范围小的变量赋值，不允许直接赋值，需要加入强转
        注意:强制转换[有可能]会出现精度损失
     */
    public static void main(String[] args) {
        double a = 12.3;
        int b = (int) a;
        System.out.println(b); // 12
    }
}
