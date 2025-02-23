public class ParametersAndArguments {
    public static void main(String[] args) {
        int length = 10;
        int width = 15;
        int area = calculateArea(length, width);
        System.out.println("The calculated area is: " + area);
    }

    public static int calculateArea(int length, int width) {
        return length * width;
    }
}
