package interfaces.shape;

public class Triangle implements Shape {
    private double aSide;
    private double bSide;
    private double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double getASide() {
        return aSide;
    }

    public void setASide(double aSide) {
        this.aSide = aSide;
    }

    public double getBSide() {
        return bSide;
    }

    public void setBSide(double bSide) {
        this.bSide = bSide;
    }

    public double getCSide() {
        return cSide;
    }

    public void setCSide(double cSide) {
        this.cSide = cSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "aSide=" + this.aSide +
                ", bSide=" + this.bSide +
                ", cSide=" + this.cSide +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.aSide, this.aSide) == 0 &&
                Double.compare(triangle.bSide, this.bSide) == 0 &&
                Double.compare(triangle.cSide, this.cSide) == 0;
    }

    @Override
    public double getArea() {
        // Heron's formula
        double p = (this.aSide + this.bSide + this.cSide) / 2;
        return Math.sqrt(p * (p - this.aSide) *	(p - this.bSide) * (p - this.cSide));
    }

    @Override
    public double getPerimeter() {
        return this.aSide + this.bSide + this.cSide;
    }
}
