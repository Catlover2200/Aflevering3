package D;

public class Square implements Comparable<Square> {
    public double height;
    public double width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double perimeterOfSquare() {
        return (height * width);
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public int compareTo(Square compareSquares) {

        if (this.perimeterOfSquare() > compareSquares.perimeterOfSquare()) {
            return 1;
        } else {
            return 0;
        }
    }
}