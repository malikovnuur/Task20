public class Parallelepiped extends Exception {

    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    void Area() {
        double getArea = 2 * ((height * length) + (length * width) + (height * width));
    }

    void Volume() {
        double getVolume = length * width * height;


    }
}


