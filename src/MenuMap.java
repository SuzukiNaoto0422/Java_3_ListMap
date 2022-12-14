import java.util.HashMap;
import java.util.Map;

public class MenuMap {
    public static void main(String[] args) {

        Map<String,Integer> cafeMenu = new HashMap<>();//格納順で取り出したい場合はLinkedHashMap、自然順序で取り出したい場合はTreeMapを使用
        cafeMenu.put("ブラックコーヒー",420);//Mapにおいての要素の追加はaddではなくput
        cafeMenu.put("カプチーノ",520);
        cafeMenu.put("ホワイトモカ",480);
        cafeMenu.put("キャラメルラテ",620);

        //拡張for文
        for (String menuName : cafeMenu.keySet()) {
            int menuPrice = cafeMenu.get(menuName);
            System.out.println(menuName + "の値段は" + menuPrice + "円です。");
        }
    }
}