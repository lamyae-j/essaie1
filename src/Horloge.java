public class Horloge {
    int sec, min,h;

    public Horloge(int sec, int min, int h) {
        this.sec = sec;
        this.min = min;
        this.h = h;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public static void main(String[] argc){
        Horloge h = new Horloge(4,5,6);
        System.out.println(h.sec+"\t");
    }
}
