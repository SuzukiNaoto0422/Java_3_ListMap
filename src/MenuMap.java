import java.util.HashMap;
import java.util.Map;

public class MenuMap {
    public static void main(String[] args) throws Exception {

        Map<String, Integer> cafeMenu = new HashMap<>();//格納順で取り出したい場合はLinkedHashMap、自然順序で取り出したい場合はTreeMapを使用
        cafeMenu.put("ブラックコーヒー", 420);//Mapにおいての要素の追加はaddではなくput
        cafeMenu.put("カプチーノ", 520);
        cafeMenu.put("ホワイトモカ", 480);
        cafeMenu.put("キャラメルラテ", 620);

        try {//下記４つの商品のキー以外が選択された場合、"メニューにない商品です。"と表示する。

        Integer blackCoffeePrice = cafeMenu.get("ブラックコーヒー"); //getで対応する値の取得
        Integer cappuccinoPrice = cafeMenu.get("カプチーノ");
        Integer whiteMocha = cafeMenu.get("ホワイトモカ");
        Integer caramelLatte = cafeMenu.get("キャラメルラテ");

        //拡張for文
        for (String menuName : cafeMenu.keySet()) {
            int menuPrice = cafeMenu.get(menuName);
            System.out.println(menuName + "の値段は" + menuPrice + "円です。");
        }

        System.out.println("合計金額は" +( blackCoffeePrice + cappuccinoPrice + whiteMocha + caramelLatte )+ "円です。");//（）でくくらないと合計金額は420520480620円です。と実行される。

        }catch (NullPointerException e) {
            System.out.println("メニューにない商品です。");
        }
    }
}
