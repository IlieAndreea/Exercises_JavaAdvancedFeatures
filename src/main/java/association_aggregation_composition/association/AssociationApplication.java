/** Understanding Association */

package association_aggregation_composition.association;

public class AssociationApplication {

    public static void main (String[] args) {
        Bank bank = new Bank("Axis");
        Employee emp = new Employee("John");

        System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
    }
}
