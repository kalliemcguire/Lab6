
public class LandTract {
    private double length;
    private double width;
    private double area;

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
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
    
    public double getArea(double length, double width) {
       area = length * width;
       return area;
    }
    
    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "LandTract{" + "length: " + length + " width: " + width + "}"; 
    }

    public boolean equals(LandTract land) {
        return this.getLength() == land.getLength() && this.getWidth() == land.getWidth(); 
    }

}
