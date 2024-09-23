public class Main{
    public static void main(String[] args) {
        double inputWinter = 145.36;
        double inputSpring = 167.25;
        double inputSummer = 237.84;
        double inputFall = 150.11;
        double totalCost;

        totalCost = inputWinter + inputSpring + inputSummer + inputFall;
        System.out.println("Winter maintenance cost: "+ inputWinter);
        System.out.println("Spring maintenance cost: "+ inputSpring);
        System.out.println("Summer maintenance cost: "+ inputSummer);
        System.out.println("Fall maintenance cost: "+ inputFall);
        System.out.println("Total yearly maintenance cost: "+ totalCost);
    }
}