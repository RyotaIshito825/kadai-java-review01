
public class Review01 {

    public static void main(String[] args) {
        int goods_price = 1500;
        double tax = 0.08;
        int goods_tax = tax(goods_price, tax);
        int goods_total_price = goods_price + goods_tax;

        String str = goods_price + "円の商品の税込価格は" + goods_total_price + "円（消費税は" + goods_tax + "円）です。";

        System.out.println(str);

    }

    public static int tax(int price, double tax) {
        int tax_amount = (int)Math.round(price * tax);
        return tax_amount;
    }

    public static double tax(double price, double tax) {
        int tax_amount = (int)Math.round(price * tax);
        return tax_amount;
    }

}
