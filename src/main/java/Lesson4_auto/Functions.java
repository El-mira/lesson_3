package Lesson4_auto;

public class Functions {
    // вычисление суммы углов треугольника
    public boolean isSumAngleTriangle(double alfa, double beta, double gamma) {
         double sum = alfa + beta + gamma;
         if ( sum != 180){
             return false;
         } else return true;
    }

    // вычисление площади треугольника
    public double squareTriangle(double a, double b, double c){
        double p = (a + b + c) / 2;
        double result = (p * (p - a) * (p - b) * (p - c)) * 0.5;
        return result;
    }

    // сторона треугольника больше 0
    public boolean isSidePositive(double a, double b, double c){
        if ( a > 0 && b > 0 && c > 0 ) {
            return true;
        } else return false;
    }

    // Любая из сторон треугольника меньше двух оставшихся, но больше их разности.
    public boolean isTriangle(double a, double b, double c){
        if (a < (b+c) && a > Math.abs(b - c)) {
            return true;}
       else return false;
   }
}
