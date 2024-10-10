package Task2;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<String>();




public ArrayList<String> getCoffeeMenu(){
    return coffeeMenu;
}

public void loadMenuData(){
    File file = new File("data/coffee.txt");
    try{
    Scanner scan = new Scanner(file);
    while(scan.hasNextLine()){
        String coffee = scan.nextLine();
        coffeeMenu.add(coffee);
        //System.out.println(coffee);
    }
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}


}
