public interface Thing {
    //interface 에서 변수 정의(필드)는 상수로 public static final, 메소드는 추상화로 public abstract
    double getWeight() {
        return weight;
    }

    double setWeight(double weight) {
        this.weight = weight;
    }

    String getColor() {
        return color;
    }

    String setColor(String color) {
        this.color = color;
    }

}
