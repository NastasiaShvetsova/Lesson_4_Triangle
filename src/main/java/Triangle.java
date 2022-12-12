public class Triangle {

    static public double getTriangleSquare (double a, double b, double c) throws MyException {

        if (a <= 0 || b <= 0 || c <= 0) throw new MyException("It's not a triangle !!!");
        if (a > (b + c) || b > (a + c) || c > (a + b)) throw new MyException("One of the sides of the triangle cannot be more than the sums of two sides of the same triangle !!!");
        double p, s;
            p = (a + b + c) / 2.0; //  полупериметр
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //  площадь по трем сторонам
            return s;
        }
}
