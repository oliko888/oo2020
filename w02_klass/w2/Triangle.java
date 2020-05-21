public class Triangle{

    public int calculate(int a, int b, int c){
        int circumference;
        circumference = a + b + c;
        return circumference;

    }

    public static void main(String[]args){
        Triangle x = new Triangle();
        System.out.println("Circumference is " + x.calculate(2,4,7));
    }
}
