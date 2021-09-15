package numbersAndClasses;

public class Task4 {
    public static void main(String[] args) {
        Vector v1 = new Vector(2, 2, 2);
        Vector v2 = new Vector(3, 3, 3);
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
    }

    double findVectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    double scalarVectors(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    numbersAndClasses.Vector multiplicationVectors(Vector v){ //псевдовектор
        return new Vector(
                y * v.z - z * v.y,
                z * v.x - x * v.z,
                x * v.y - y * v.x);
    }

    double cosVector(Vector v){
        return scalarVectors(v)/(findVectorLength()*v.findVectorLength());
    }

    public Vector add(Vector v) {
        return new Vector(
                x + v.x,
                y + v.y,
                z + v.z
        );
    }

    public Vector subtract(Vector v) {
        return new Vector(
                x - v.x,
                y - v.y,
                z - v.z
        );
    }

    public static Vector[] randomVector (int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
}
