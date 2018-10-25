import java.util.Scanner;

public class MailGeneration {


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Populate array with empty employees
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
        }

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            // Insert name
            System.out.println("Insert name: ");
            String name = in.nextLine();
            // Insert surname
            System.out.println("Insert surname: ");
            String surname = in.nextLine();

            // Check how many existing employees have same name and surname
            int counter = 0;
            for (int j = 0; j < employees.length; j++) {
                System.out.println(employees[j].getName() + "|||" + name);
                if(employees[j].getName().equals(name) && employees[j].getSurname().equals(surname)){
                    counter++;
                }
            }

            // Create employee using user's input
            employees[i].setName(name);
            employees[i].setSurname(surname);

            // Create mail
            String mail;
            if(counter > 0){
                mail = employees[i].getSurname().toLowerCase() + "." + employees[i].getName().toLowerCase() + counter + "@mex.com";
            }else{
                mail = employees[i].getSurname().toLowerCase() + "." + employees[i].getName().toLowerCase() + "@mex.com";
            }
            // Set appropriate mail
            employees[i].setMail(mail);

            System.out.println("Employee: " + employees[i].getName() + " " + employees[i].getSurname());
            System.out.println("Mail: " + employees[i].getMail());

        }

        // Display users
        for (int i = 0; i < employees.length; i++) {
            System.out.println("i " + i + " " + employees[i]);
        }

    }
}
