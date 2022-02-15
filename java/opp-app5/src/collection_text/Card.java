package collection_text;

/**
 * Description:
 *
 * @Author KC萧寒
 * Date: 2022-02-15
 * Time: 19:16
 */
public class Card {
    private  String size;
    private  String color;
    private  int index;
    public Card() {
    }

    public Card(String size, String color,int index) {
        this.size = size;
        this.color = color;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return size + color;
    }
}
