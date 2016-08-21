package module2;

/**
 * This is homework for Module 2 of JavaCore course.
 * Here are tasks 2.1, 2.2 and 2.3
 */

public class Task2 {

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > 1000) {
                result[index] = names[i];
                index++;
            }
        }

        return result;
    }

    //HOMEWORK 2.1
    // Write method which withdraw money from account and takes commision 5% of the transaction. Print OK + commision
    // + balance after withdrawal. Print NO is withdrawal is not possible
    static double withdrawBalance(double balance, double withdrawal) {


        return 0;
    }

    //HOMEWORK 2.2
    //You need to write method which withdraw money of particular account owner if he/she can. Print name + NO of
    // withdrawal fs not possible and name + sum of withdrawal + balance after withdrawal in other case. Commision is
    // 5% for all cases.
    static double withdrawBalance(String ownerName, double withdrawal) {


        return 0;
    }

    //HOMEWORK 2.3
    //You need to write method which will fund (пополнение) balance of particular user. Print name + balance after funding
    static double fundBalance(String ownerName, double fund) {


        return 0;
    }


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 200, 500, 4000, 30};




    }
}
