package myproject.task1;

public class VeterinaryReport {

    private int dogs;
    int cats;
    int birds;

    public int getDogs() {
        return dogs;
    }

    public void setDogs(int dogs) {
        this.dogs = dogs;
    }

    public int getAnimalsCount() {
        return dogs + cats + birds;
    }

    public void displayStatistics() {
        System.out.println("Total number of animals is " + getAnimalsCount());
    }
}
