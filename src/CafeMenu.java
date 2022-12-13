import java.util.ArrayList;
import java.util.Arrays;

public class CafeMenu {
    public static void main(String[] args) {

        ArrayList<String> maneList = new ArrayList<>();
        // 順に要素を追加
        maneList.add("ブラックコーヒー");
        maneList.add("カプチーノ");
        maneList.add("ホワイトモカ");
        maneList.add("キャラメルラテ");

        ArrayList<Integer> priceList = new ArrayList<>();
        //addAllを使用
        priceList.addAll(Arrays.asList(420,520,480,620));

        for (int i = 0; i < maneList.size(); i++) {
            String name = maneList.get(i);
            int price = priceList.get(i);
            System.out.println(name + "の値段は" + price + "円です。");
        }

    }
}