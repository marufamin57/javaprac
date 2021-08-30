public class b {
    public static void main(String[] args) {
        ball b1= new ball();
        b1.radius=45;
        b1.color="eed";
        b1.print();
        ball b2= new ball();
        b2.radius=405;
        b2.color="sksls";
        b2.print();
        ball2 b3= new ball2(50, "jkl");
        b3.print();
    }
}

/**
 * ball
 */
class ball {

    double radius;
    String color;
    void print(){
        System.out.println("radius: "+ radius);
        System.out.println("color: "+ color);
    }
}
/**
 * ball2
 */
class ball2 {
    double rad;
    String col;
   public ball2(double rad,String col){
        this.rad=rad;
        this.col=col;
    }
    void print(){
        System.out.println("radius: "+ rad);
        System.out.println("color: "+ col);
    }
}