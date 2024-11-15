
public class Clock {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int result = getSeconds(18, 32, 47);
        System.out.println(result + "秒");

    }

    public static int getSeconds(int hour, int minute, int second) {
        int result = hour * 60 * 60 + minute * 60 + second;

        return result;
    }

}
