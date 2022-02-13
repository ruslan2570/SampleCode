import java.util.Scanner;

class SimpleCLI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "";
        int i = 0;
        while (true) {
            s = scan.nextLine();
            if (s.equals("plus")) {
                System.out.println(++i);
            } else if (s.equals("minus")) {
                System.out.println(--i);
            } else if (s.equals("info")) {
                System.out.println(i);
            } else if (s.equals("exit")) return;
            else {
                System.err.println("Wrong command!!!");
            }
        }
    }
}

