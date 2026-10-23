
import java.util.Scanner;

class FreelancerProject {
    int projectId;
    String freelancerName;
    String projectName;
    double projectAmount;
    double paidAmount;

    void addProject(Scanner sc) {
        System.out.print("Enter Project ID: ");
        projectId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Freelancer Name: ");
        freelancerName = sc.nextLine();

        System.out.print("Enter Project Name: ");
        projectName = sc.nextLine();

        System.out.print("Enter Project Amount: ");
        projectAmount = sc.nextDouble();

        System.out.print("Enter Paid Amount: ");
        paidAmount = sc.nextDouble();

        System.out.println("Project Added Successfully!");
    }

    void displayProject() {
        System.out.println("\n--- Project Details ---");
        System.out.println("Project ID: " + projectId);
        System.out.println("Freelancer Name: " + freelancerName);
        System.out.println("Project Name: " + projectName);
        System.out.println("Project Amount: Rs. " + projectAmount);
        System.out.println("Paid Amount: Rs. " + paidAmount);
        System.out.println("Balance Amount: Rs. "
                + (projectAmount - paidAmount));

        if (paidAmount >= projectAmount) {
            System.out.println("Payment Status: Completed");
        } else {
            System.out.println("Payment Status: Pending");
        }
    }
}

public class FreelancerProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FreelancerProject project = new FreelancerProject();
        int choice;
        boolean added = false;

        do {
            System.out.println("\n=== Freelancer Project Management ===");
            System.out.println("1. Add Project");
            System.out.println("2. View Project Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    project.addProject(sc);
                    added = true;
                    break;

                case 2:
                    if (added) {
                        project.displayProject();
                    } else {
                        System.out.println(
                                "Please add a project first!");
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}
