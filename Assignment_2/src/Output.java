public class Output {
    public void work(){     //(ml, l, g, kg, mm, cm, m, km).
        Input ss = new Input();

        double fl_oz = ss.getFl_oz();
        double gal = ss.getGal();
        double oz = ss.getOz();
        double lb = ss.getLb();
        double in = ss.getIn();
        double ft = ss.getFt();
        double mi = ss.getMi();

        double ml = fl_oz * 29.5735;
        double l = gal * 3.78541;
        double g = oz * 28.3495;
        double kg = lb * 0.453592;
        double mm = in

        System.out.println("Convert from? ");

        System.out.println(fl_oz+ " fl_oz = " +ml +" ml");

    }
}
