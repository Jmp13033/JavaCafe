import javax.security.auth.SubjectDomainCombiner;
import java.util.ArrayList;

public class CafeUtil 
{
    String getStreakGoal() {
        int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		return "Sum of first 10 numbers is: " + sum;

    }

    double getOrderTotal(double[] prices) {  
        double sum = 0;
        for (int i = 0; i < prices.length; i++) 
            sum = sum + prices[i];
        return sum;
        

    }

    void displayMenu(ArrayList<String> menuItems) {

        for(int i = 0; i < menuItems.size(); i ++) {
            System.out.println(i);
            System.out.println(menuItems.get(i));
        }


    }

    void addCustomer(ArrayList<String> customers) {

        String userName = System.console().readLine();

        System.out.println("Hello" + " " + userName);
        customers.add(userName);
        System.out.print(" hi " + userName + " there are " + (customers.size() - 1) + " ahead of you ");
        System.out.println(customers);
        

    }



}