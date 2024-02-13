public class StarPattern {

    public static void main(String[] args) {
        drawH();
        drawE();
        drawT();
    }

    public static void drawH() {
        for (int i = 0; i < 5; i++) {
            System.out.print("**     **\n");
        }
        System.out.print("*********\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("**     **\n");
        }
        System.out.println();
    }

    public static void drawE() {
        System.out.print("********\n");
        for (int i = 0; i < 2; i++) {
            System.out.print("**      \n");
        }
        System.out.print("*****   \n");
        for (int i = 0; i < 2; i++) {
            System.out.print("**      \n");
        }
        System.out.print("********\n");
        System.out.println();
    }

    public static void drawT() {
        System.out.print("*********\n");
        for (int i = 0; i < 4; i++) {
            System.out.print("   **   \n");
        }
        System.out.println();
    }
}
