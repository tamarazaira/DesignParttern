import colors.GreenColor;
import colors.RedColor;
import entities.Pentagon;
import entities.Triangle;
import entities.form.Shape;

public class BridgeDesignMain {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
