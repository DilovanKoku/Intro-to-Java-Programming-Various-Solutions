public class Chapter1Problems {
    public static void main(String[] args) {
        //Question 1.1
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");

        //Question 1.2
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        //Question 1.3
        System.out.println("      J      A      V     V      A");
        System.out.println("      J     A A      V   V      A A");
        System.out.println("  J   J    AAAAA      V V      AAAAA");
        System.out.println("   J J    A     A      V      A     A");

        //Question 1.4
        System.out.println("a      a^2      a^3");
        System.out.println("1      1        1");
        System.out.println("2      4        8");
        System.out.println("3      9        27");
        System.out.println("4      16       64");

        //Question 1.5
        System.out.println((9.5 * 4.5 - 2.5 * 3)/(45.5 - 3.5));

        //Question 1.6
        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);

        //Question 1.7
        System.out.println( 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) ));
        System.out.println(4 * (1.0 - (1.0/3.0) + (1/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0)));

        //Question 1.8
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter = " + perimeter);
        System.out.println("area = " + area);

        //Question 1.9
        double width = 4.5;
        double height = 7.9;
        System.out.println("area = " + width * height);

        //Question 1.10
        double kmToMiles = (14/1.6);
        System.out.println("The runner runs " + (kmToMiles/45.30) + "miles/hour");
        System.out.println("--------------------------------------------------------------------");

        //Question 1.11
        int secondsInOneYear = 31536000;
        int birthPerYear = (secondsInOneYear / 7);
        int deathPerYear = (secondsInOneYear / 13);
        int immigrantPerYear = (secondsInOneYear/ 45);
        int totalPopulation1 = (312032486 - deathPerYear + birthPerYear + immigrantPerYear);
        int totalPopulation2 = (totalPopulation1 - deathPerYear + birthPerYear +immigrantPerYear);
        int totalPopulation3 = (totalPopulation2 - deathPerYear + birthPerYear + immigrantPerYear);
        int totalPopulation4 = (totalPopulation3 - deathPerYear + birthPerYear + immigrantPerYear);
        int totalPopulation5 = (totalPopulation4 - deathPerYear + birthPerYear + immigrantPerYear);

        // Year 1
        System.out.println("The total population after 1 year is " + totalPopulation1);
        //Year 2
        System.out.println("The total population after 2 years is " + totalPopulation2);
        //Year 3
        System.out.println("The total population after 3 years is " + totalPopulation3);
        //Year 4
        System.out.println("The total population after 4 years is " + totalPopulation4);
        //Year 5
        System.out.println("The total population after 5 years is " + totalPopulation5);
        System.out.println("------------------------------------------------------------------------------------");

        //Question 1.12
        double milesToKm = (24 * 1.6);
        double totalHours = (1 + (40.0/60) + (35.0/3600));
        System.out.println("The runner ran " + (milesToKm/totalHours) + " Km/hour");

        //Question 1.13
        double x = (((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
        double y = (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
        System.out.println("Solving 3.4x + 50.2y we get " + (3.4* x + 50.2 * y) + " ,this answer is equal to 44.5");
        System.out.println("Solving for 2.1x + 0.55y we get " + (2.1 * x + 0.55 * y) + " ,this answer is equal to 5.9");






    }














 








}

