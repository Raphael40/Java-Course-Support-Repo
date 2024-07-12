package main.java.conditionals;

public class Switch {
    public static void main(String[] args) {
        int day = 5;

        switch(day) {
            case 1:
                System.out.println("The day today is Monday");
                break;
            case 2:
                System.out.println("The day today is Tuesday");
                break;
            case 3:
                System.out.println("The day today is Wednesday");
                break;
            case 4:
                System.out.println("The day today is Thursday");
                break;
            case 5:
                System.out.println("The day today is Friday");
                break;
            case 6:
                System.out.println("The day today is Saturday");
                break;
            case 7:
                System.out.println("The day today is Sunday");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}
