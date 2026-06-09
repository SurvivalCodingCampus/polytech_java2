public class Cleric {
    static final int MX_HP = 50;
    static final int MX_MP = 10;
    String name;
    int hp;
    int mp;

    void selfAid() {
        if (mp >= 5) {
            mp -= 5;
            hp = MX_HP;
            System.out.println("회복완료");
        } else System.out.println("MP 부족");
    }

    int pray(int time) {
        int r = time + (int) (Math.random() * 3);
        int before = mp;
        mp += r;
        if (mp > MX_MP)
            mp = MX_MP;
        return mp - before;
    }
}

