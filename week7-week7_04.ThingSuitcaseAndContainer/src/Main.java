
public class Main {

    public static void main(String[] args) {

        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int weight = 0;
        while (weight < 100) {
            Thing brick = new Thing("Brick", weight+1);
            Suitcase suitcase = new Suitcase(101);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            weight++;
        }
    }

}
