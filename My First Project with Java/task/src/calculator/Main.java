package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bubblegum = 202;
        double toffee = 118;
        double iceCream = 2250;
        double milkChocolate = 1680;
        double doughnut = 1075;
        double pancake = 80;
        double totalEarnings = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        // Printing the earned amount first
        System.out.println("Earned amount: \n" +
                "Bubblegum: $" + bubblegum + "\n" +
                "Toffee: $" + toffee + "\n" +
                "Ice Cream: $" + iceCream + "\n" +
                "Milk chocolate: $" + milkChocolate + "\n" +
                "Doughnut: $" + doughnut + "\n" +
                "Pancake: $" + pancake + "\n" +
                "Income: $" + totalEarnings);

        // Prompting the user to enter staff expenses and other expenses
        System.out.print("Enter the staff expenses: ");
        double staffExpenses = scanner.nextDouble();
        System.out.print("Enter the other expenses: ");
        double otherExpenses = scanner.nextDouble();

        // Calculating net income
        double netIncome = totalEarnings - (staffExpenses + otherExpenses);

        // Printing the net income
        System.out.println("Staff expenses: $" + staffExpenses);
        System.out.println("Other expenses: $" + otherExpenses);
        System.out.println("Your net income is: $" + netIncome);
    }
}
