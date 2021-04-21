public class Chapter5Question18 {
    public static void main(String[] args) {
        // Question 5.18


        //Pattern A
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }

        //Pattern B
        System.out.println("\nPattern B");
        for (int i = 6; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        //Pattern C
        System.out.println("\nPattern C");
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= 6 - i; j++){
                System.out.print("  ");
            }
            for (int leftTriangle = 1; leftTriangle <= i; leftTriangle ++){
                System.out.print(leftTriangle + " ");
            }
            System.out.println();

        }

        //Pattern D
        System.out.println("\nPattern D");
        for (int i = 1; i <= 6; i++){
            for (int j = 2; j <= i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k <= 6 - i + 1; k++){
                System.out.print(k + " ");
            }

            System.out.println();

        }




    }
}
