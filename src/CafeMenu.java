import java.util.ArrayList;
import java.util.Arrays;

public class CafeMenu {
    public static void main(String[] args) {

        ArrayList<String> menuList = new ArrayList<>();
        // 順に要素を追加する
        menuList.add("ブラックコーヒー");
        menuList.add("カプチーノ");
        menuList.add("ホワイトモカ");
        menuList.add("キャラメルラテ");

        ArrayList<Integer> priceList = new ArrayList<>();
        //addAllを使用して要素の追加
        priceList.addAll(Arrays.asList(420,520,480,620));

        //通常のfor文
        for (int i = 0; i < menuList.size(); i++) {
            String nameName = menuList.get(i);
            int price = priceList.get(i);
            System.out.println(nameName + "の値段は" + price + "円です。");
        }

        System.out.println("\n");

        //拡張for文
        for (String menu : menuList) {
            //引数menuが指定されたコーヒーのメニュー。menuList.indexOf(menu)は、その位置(0から始まるインデックス)を返します。priceList.get(...)は、指定された位置の要素を返す。
            //つまり、priceList.get(menuList.indexOf(menu))は、menuに対応するコーヒーの価格を返し、この値がint priceに格納される。
            //menuが"ブラックコーヒー"の場合、menuList.indexOf(menu)は0を返し、priceList.get(0)は420を返す。そのため、priceには420が格納される。
            int price = priceList.get(menuList.indexOf(menu));
            System.out.println(menu + " costs " + price + " yen.");
        }


    }
}