public class Main {
    public static void main(String[] args) {
        int a = 12, b = 15, c = 20;
        int i = (a > b && a>c)?a:(b>c)?b:c;
        System.out.println(i);
    }
}