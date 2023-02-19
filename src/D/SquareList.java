package D;

import java.util.ArrayList;
import java.util.Collections;

public class SquareList {
        public static void exD(){
            Square square1 = new Square(20, 10);
            Square square2 = new Square(15, 5);

            System.out.println(square1.compareTo(square2));

            ArrayList<Square> squareList = new ArrayList<>();
            squareList.add(square1);
            squareList.add(square2);
            Collections.sort(squareList);
            System.out.println("The square with the smallest perimeter: " + squareList);
        }
    }
