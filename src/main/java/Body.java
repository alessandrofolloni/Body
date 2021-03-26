/**
 * Implement a Body class representing a two-dimensional point (x, y) capable of
 * moving with a certain speed (vx, vy).
 * <p>
 * The class have to implement three constructors: Body() - Setting x = y = vy =
 * vy = 0 Body(x, y) Setting x, y as parameters and vx = vy = 0 Body(x, y, vx,
 * vy) Setting x, y, vx, vy
 * <p>
 * The class have also to implement the following methods: getters and setters
 * for x, y, vx, vy progress(t) updating coordinates x, y by considering a
 * steady movement at velocity vx, vy toString() printing x, y, vx, vy
 * <p>
 * Also, a demonstrative main() function have to be implemented.
 *
 * @author Nicola Bicocchi
 * <p>
 * https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
 */

public class Body {
    double x;
    double y;
    double vx;
    double vy;

    /**
     * constructors
     */

    public Body() {
        this.x = 0;
        this.y = 0;
        this.vx = 0;
        this.vy = 0;
    }

    public Body(double x, double y) {
        this.x = x;
        this.y = y;
        this.vx = 0;
        this.vy = 0;
    }

    public Body(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    /**
     * getters
     * and
     * setters
     */

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVx() {
        return vx;
    }

    public void setSpeed(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    @Override
    public String toString() {
        return "Body{" +
                "x=" + x +
                ", y=" + y +
                ", vx=" + vx +
                ", vy=" + vy +
                '}';
    }

    public void progress(double t) {
        x += vx * t;
        y += vy * t;
    }

    public void setSpeed(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public static void main(String[] args) {
        Body b = new Body(0, 0);
        b.setSpeed(1, 1);
        b.progress(1);
        System.out.println(b);
        b.setSpeed(-1, -1);
        b.progress(2);
        System.out.println(b);
    }
}
