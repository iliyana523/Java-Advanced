package SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberOfCompounds=Integer.parseInt(scanner.nextLine());

        TreeSet<String> elements=new TreeSet<>();
        for (int i = 0; i <numberOfCompounds ; i++) {
            String[] compound= scanner.nextLine().split(" ");
            for (String element:compound) {
                elements.add(element);
            }

        }
        for (String element:elements) {
            System.out.print(element+" ");
        }
    }
}
