public class Practice7 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        /* 論理演算子の練習 */
        System.out.println((a != a) && (b != b));
        System.out.println((++a < a) && (++b < b));
        System.out.println("a:" + a + " " + "b:" + b);
        System.out.println((++a < a) & (++b < b));
        System.out.println("a:" + a + " " + "b:" + b);
        System.out.println(true ^ false);
        System.out.println(true ^ true);
        System.out.println(!true);
    }
}
