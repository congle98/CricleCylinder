package demo;

public class Cylinder extends Circle {
    private double Height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        Height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        Height = height;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }
    public double getVolume(){
        return super.getArea()*this.Height;
    }

    @Override
    public String toString() {
        return "demo.demo.Cylinder{" +
                "color='" + this.getColor() + '\'' +
                ", Height=" + Height +
                ", Radius"+ this.getRadius()+
                '}';
    }
}
