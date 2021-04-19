import com.flyweight.Forest;

public class Application {

    public static void main(String[] args) {
        Forest forest = new Forest();
        forest.plantTree(10,10,"Arueira", "marrom", "opaca");
        forest.plantTree(9,9,"Arueira", "marrom", "opaca");
        forest.plantTree(8,8,"Arueira", "marrom", "opaca");
        forest.plantTree(10,10,"Balsamo", "marrom", "solido");
        forest.plantTree(11,13,"Balsamo", "marrom", "solido");
        forest.plantTree(12,14,"Balsamo", "marrom", "solido");
        forest.draw("Tela");
    }

}
