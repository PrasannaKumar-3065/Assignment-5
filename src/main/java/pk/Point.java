package pk;

public class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    String check(int x, int y){
        return (this.x == x && this.y == y) ? "\n true the values are same":"\n false the values are same";    
    }
    Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
