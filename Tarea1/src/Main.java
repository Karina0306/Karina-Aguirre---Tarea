import LombokBuilder.People;
import MysteryColors.Color;
import MysteryColors.MysteryColorAnalyzerImpl;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        People people = new People(14,"Carla","Rocio");
        System.out.println(people.greet());
        ArrayList<Color> color = new ArrayList<>();
        MysteryColorAnalyzerImpl mysteryColorAnalyzer = new MysteryColorAnalyzerImpl();
        color.add(Color.BLUE);
        color.add(Color.GREEN);
        color.add(Color.RED);
        color.add(Color.BLUE);
        color.add(Color.GREEN);
        color.add(Color.GREEN);
        System.out.println(mysteryColorAnalyzer.numberOfDistinctColors(color));
        System.out.println(mysteryColorAnalyzer.colorOccurrence(color,Color.BLUE));
    }
}
