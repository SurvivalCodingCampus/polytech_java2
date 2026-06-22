public abstract class TangibleAsset extends Asset implements Thing{
    int price;
    String color;
    double weight;

    public TangibleAsset(String name,int price,String color, double weight) {
        super(name);
        this.price=price;
        this.color=color;
        this.weight=weight;
    }

    @Override
    public double getWeight(){
        return weight;
    }

    @Override
    public void setWeight(double weight){
    this.weight=weight;
    }
}
