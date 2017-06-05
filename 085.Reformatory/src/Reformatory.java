
public class Reformatory {

    private int counter;

    public Reformatory() {
        this.counter = 0;
    }

    public int weight(Person person) {
        // return the weight of the person
        this.counter++;
        return person.getWeight();
    }

    public void feed(Person person) {

        int tmp = person.getWeight();
        tmp += 1;

        person.setWeight(tmp);
    }

    public int totalWeightsMeasured() {
       return this.counter;
    }
}
