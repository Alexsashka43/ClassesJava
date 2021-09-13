package numbersAndClasses;

public class Task4 {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2, 2, 2);
        Vector vector2 = new Vector(2, 2, 2);
        System.out.println(vector1.findVectorLength());
        System.out.println(vector1.scalarProduct(vectorArray));
    }
}

class Vector {
    double x;
    double y;
    double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        double [] vectorArray = {x, y, z};

    }

//    double[] vectorArray() {
//
//    }


    double findVectorLength() {
        double vectorLength = Math.sqrt(x * x + y * y + z * z);
        return vectorLength;
    }

    double[] scalarProduct(double [] a, double [] b) {
        double [] c = new double[3];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        return c;
