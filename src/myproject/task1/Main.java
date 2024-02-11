package myproject.task1;

public class Main {

    public static void main(String[] arg) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.cats = 99;
        vr.setDogs(199);
        vr.birds = 32;
        vr.displayStatistics();
        System.out.println("The class method says there are " + vr.getAnimalsCount() + " animals");
    }
}
