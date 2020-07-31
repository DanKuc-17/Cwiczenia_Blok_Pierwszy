package Kwadraty;

public class Square {

    private Point leftT;
    private Point leftB;
    private Point rightT;
    private Point rightB;

    private int length;

    public Square(Point leftT, int length){
        int x = leftT.getX();
        int y = leftT.getY();
        this.leftT = leftT;
        this.length = length;
        this.leftB = new Point(x,y-length);
        this.rightT = new Point(x+length,y);
        this.rightB = new Point(x+length,y-length);
    }
    public boolean covered (Square square2){

        boolean corner1 = compare(leftT);
        boolean corner2 = compare(rightT);
        boolean corner3 = compare(leftB);
        boolean corner4 = compare(rightB);

        if (corner1 || corner2 || corner3 || corner4){
            return true;
        } else {
            return false;
        }

    }

    public boolean compare (Point corner){

        int x2 = corner.getX();
        int y2 = corner.getY();

        int x1 = this.leftT.getX();
        int y1 = this.leftT.getY();
        int x3 = this.rightB.getX();
        int y3 = this.rightB.getY();

        if (x2>=x1 && x2<=x3 && y2<=y1 && y2>=y3){
            return true;
        } else {
            return false;
        }
    }

}
