public class EmployeeSalary {
    public static void main(String[] args) {
        String fullTimeName = "sree";
        double fullTimeSalary = 50000;

        String partTimeName = "varshini";
        double partTimeHourlyRate = 20;
        int partTimeHoursWorked = 100;

        String freelancerName = "anandhan";
        double freelancerHourlyRate = 30;
        int freelancerHoursWorked = 80;
        double freelancerBonus = 200;
       
        double fullTimeEmployeeSalary = fullTimeSalary;
        double partTimeEmployeeSalary = partTimeHourlyRate * partTimeHoursWorked;
        double freelancerSalary = (freelancerHourlyRate * freelancerHoursWorked) + freelancerBonus;

        System.out.println(fullTimeName + "'s salary: " + fullTimeEmployeeSalary);
        System.out.println(partTimeName + "'s salary: " + partTimeEmployeeSalary);
        System.out.println(freelancerName + "'s salary: " + freelancerSalary);
    }
}

