public class Main {
    public static void main(String[] args) {
       //int fallCost, int winterCost, int springCost, int summerCost, int yearlyCost

        int fallCost = 242;
        int winterCost = 422;
        int springCost = 230;
        int summerCost = 334;

        int yearlyCost = fallCost + winterCost + springCost + summerCost;

        System.out.println("Your home maintenance cost for fall is " + fallCost);
        System.out.println("Your home maintenance cost for winter is " + winterCost);
        System.out.println("Your home maintenance cost for summer is " + summerCost);
        System.out.println("Your home maintenance cost for spring is " + springCost);
        System.out.println("Your total home maintenance cost for the year is " + yearlyCost);
    }
}