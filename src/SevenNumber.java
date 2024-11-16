
public class SevenNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || String.valueOf(i).contains("7")) {
                System.out.println("clap!");
            } else {
                System.out.println(i);
            }
        }
    }

}
