import java.util.Scanner;

public class Input {
    private double fl_oz, gal, oz, lb, in, ft, mi;
    Scanner sc = new Scanner(System.in);

    public void setFl_oz(double fl_oz) {
        this.fl_oz = sc.nextDouble();
    }

    public void setGal(double gal) {
        this.gal = sc.nextDouble();
    }

    public void setOz(double oz) {
        this.oz = sc.nextDouble();
    }

    public void setLb(double lb) {
        this.lb = sc.nextDouble();
    }

    public void setIn(double in) {
        this.in = sc.nextDouble();
    }

    public void setFt(double ft) {
        this.ft = sc.nextDouble();
    }

    public void setMi(double mi) {
        this.mi = sc.nextDouble();
    }

    public double getFl_oz() {
        return sc.nextDouble();
    }

    public double getGal() {
        return sc.nextDouble();
    }

    public double getOz() {
        return sc.nextDouble();
    }

    public double getLb() {
        return sc.nextDouble();
    }

    public double getIn() {
        return sc.nextDouble();
    }

    public double getFt() {
        return sc.nextDouble();
    }

    public double getMi() {
        return sc.nextDouble();
    }

}
