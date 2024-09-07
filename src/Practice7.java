public class Practice7 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        /* 論理演算子の練習 */
        System.out.println((a == a) && (b == b));    // 左右の条件が共にtrueならtrueを返す
        System.out.println((++a < a) && (++b < b));    // 左の条件がfalseの時点で右を評価せずfalseを返す
        System.out.println("a:" + a + " " + "b:" + b);

        System.out.println((++a < a) & (++b < b));    // ＆の場合は、左の条件がfalseでも右も評価する
        System.out.println("a:" + a + " " + "b:" + b);

        System.out.println(true ^ false);    // 左右の値が異なる場合はtrue
        System.out.println(true ^ true);    // 左右の値が同じ場合はfalse
        System.out.println(!true);    // trueをfalseに変換する
    }
}
