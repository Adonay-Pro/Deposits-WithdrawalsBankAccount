package tasksix;

public class TaskSix {
    public static void main(String[]args) {

        /*Define a three-dimensional array of ints representing deposits and withdrawals of
        customers of a bank in and out of their accounts (each customer may have several
        accounts).where
        • the first index indicates a customer;
        • the second index indicates, for a given customer, his/her account;
        • the third index indicates, for a given customer and his/her account, subsequent
        deposits (positive values) and withdrawals (negative values).
        The program should create an array of ints of dimension equal to the number of
        customers, the elements of which are sums of all deposits and withdrawals for subsequent customers, in and out of all his/her accounts (for the data as in the example
        above, these should be the numbers 235, 500 and 310).
        After modifications of the sizes and/or values of elements of the array oper, the
        program should work correctly without any other changes*/

        int[][][] opers = {
                {{100, -50, 25}, {150, -300}, {300, -90, 100}},
                {{90, -60, 250}, {300, 20, -100}},
                {{20, 50}, {300}, {20, -20, 40}, {100, -200}},
        };

        int [] result = new int[opers.length];

        for (int c = 0; c < opers.length; ++c) {  //Customers
                for (int a = 0; a < opers[c].length; ++a) {    //About Customer Accounts
                for (int g = 0; g < opers[c][a].length; ++g) {   //Total Deposits and withdrawals
                    result[c] += opers[c][a][g];
                }
            }
        }
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}





