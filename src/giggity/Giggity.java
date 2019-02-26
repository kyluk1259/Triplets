package giggity;

import java.util.ArrayList;

public class Giggity {
    public static void main(String[] args) {
        //This program will use dynamic arrays
        ArrayList<String> nouns = new ArrayList<String>();
        nouns.add("cat");
        nouns.add("dog");
        nouns.add("horse");
        nouns.add("goat");
        nouns.add("eagle");
        nouns.add("lion");
        nouns.add("giraffe");

        ArrayList<String> verbs = new ArrayList<String>();
        verbs.add("ate");
        verbs.add("slept");
        verbs.add("jumped");
        verbs.add("raced");
        verbs.add("ran");
        verbs.add("tripped");
        verbs.add("guessed");
        verbs.add("tapped");
        
        ArrayList<String> verbs2 = new ArrayList<String>();
        verbs2.add("eat");
        verbs2.add("sleep");
        verbs2.add("jump");
        verbs2.add("race");
        verbs2.add("run");
        verbs2.add("trip");
        verbs2.add("guess");
        verbs2.add("tap");

        ArrayList<String> rhymingNouns = new ArrayList<String>();
        rhymingNouns.add("mouse");
        rhymingNouns.add("blouse");
        rhymingNouns.add("grouse");
        rhymingNouns.add("house");
        rhymingNouns.add("spouse");
        rhymingNouns.add("doghouse");
        rhymingNouns.add("beachhouse");
        rhymingNouns.add("treehouse");

        String noun, verb1, verb2, verb3, rhymingNoun1, rhymingNoun2, rhymingNoun3;
        int randomNum;

        //get a random noun from the nouns ArrayList
        //use .size() method to get the # of elements in the ArrayList
        randomNum = (int)(Math.random() * nouns.size());
        noun = nouns.get(randomNum);

        //get the first verb & remove it from the array
        randomNum = (int)(Math.random() * verbs.size());
        verb1 = verbs.get(randomNum);
        verbs.remove(randomNum);

        //get the second and third verb
        randomNum = (int)(Math.random() * verbs2.size());
        verb2 = verbs2.get(randomNum);
        randomNum = (int)(randomNum);
        verb3 = verbs.get(randomNum);

        //get the three rhyming nouns
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun1 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);

        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun2 = rhymingNouns.get(randomNum);
        rhymingNouns.remove(randomNum);
        
        randomNum = (int)(Math.random() * rhymingNouns.size());
        rhymingNoun3 = rhymingNouns.get(randomNum);

        //Display the poem
        System.out.println("The " + noun + " " + verb1 + " a " + rhymingNoun1 + "\n" +
                "So it could " + verb2 + " the " + rhymingNoun2 + "\n"
                + "But it " + verb3 + " a " + rhymingNoun3); 


    }

}