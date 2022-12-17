import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuList_2 {
    public static void main(String[] args) {

        //Menuクラスのインスタンスを使用
        List<Menu> menus = List.of(new Menu("ブラックコーヒー",420),
                             new Menu("カプチーノ",520),
                             new Menu("ホワイトモカ",480),
                             new Menu("キャラメルラテ",620));

        //通常のfor文
        for (int i = 0; i < menus.size(); i++) {
            System.out.println(menus.get(i).getName() + "の値段は" + menus.get(i).getPrice() + "円です。");
        }

        System.out.println("\n");
        //拡張for文
        for (Menu menu : menus) {
            System.out.println(menu.getName() + "の値段は" + menu.getPrice() + "円です。");
        }

        System.out.println("\n");
        //try-catch文
        try {
            for (int i =  0 ; i <= menus.size(); i++) {
                System.out.println((menus.get(i).getName() + "の値段は" + menus.get(i).getPrice() + "円です。"));
            }
        }catch (IndexOutOfBoundsException e) {//リストの範囲を超えた指示がされた際の例外クラス
            System.out.println("リストの範囲を超えた指定です。");
        }
    }
}
