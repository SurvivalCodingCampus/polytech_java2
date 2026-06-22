public class TangibleAsset extends Asset {
    private String color;

    //생성자 ..상속포함
    TangibleAsset(String name, int price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
