package domino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));

        Collections.sort(dominoes);
        for (Domino domino : dominoes){
            System.out.println(domino.toString());
        }
        List<Thing> things = new ArrayList<>();
        things.add(new Thing("Attila"));
        things.get(0).complete();
        things.add(new Thing("Ferike"));
        things.get(1).complete();
        things.add(new Thing("Terike"));
        things.add(new Thing("Betti"));
        things.add(new Thing("Xavér"));
        things.get(4).complete();
        things.add(new Thing("Xenia"));
        System.out.println(things.toString());
        Collections.sort(things);
        System.out.println(things.toString());
    }
}
