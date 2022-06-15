import SupermarketSettings.*;

public class RunMarket {
        public static void main(String[] args) {
            // 创建一个小超市类
            Supermarket supermarket = new Supermarket(
                    "Costco777", "上海",
                    150, 100, 200);
            System.out.println("利润最高的商品为");
            supermarket.getBiggestProfitMerchandise().describe();

        }
}
