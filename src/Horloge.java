public class Horloge {
    int sec, min, h;

    public Horloge(int sec, int min, int h) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    @Override
    public String toString() {
        return "Horloge{" +
                "sec=" + sec +
                ", min=" + min +
                ", h=" + h +
                '}';
    }

    public static void main(String[] argc){
        Horloge h = new Horloge(4,5,6);
        System.out.println(h.toString());
    }
}
