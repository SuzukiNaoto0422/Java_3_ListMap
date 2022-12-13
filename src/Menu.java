public class Menu {
    //リストに複数の要素（今回は文字列の商品名、数字の値段の２つの要素を持たせたい。）
    //ここで作成したクラスをMenuListクラスで使用したい。
    private String name; //商品名
    private int price; //値段

    public Menu(String name,int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public int getPrice() {return price;}
}