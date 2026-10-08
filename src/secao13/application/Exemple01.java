package secao13.application;

import secao13.entities.Employee;
import secao13.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exemple01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            System.out.println("Employee #"+i+" data:");

            System.out.print("Outsourced (y/n): ");
            char out = scanner.next().charAt(0);

            scanner.nextLine();//limpar o buffer

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hour = scanner.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            if(out == 'y'){
                System.out.print("Additional charge: ");
                double addCharge = scanner.nextDouble();
                Employee emp = new OutsourcedEmployee(name, hour, valuePerHour, addCharge);
                employees.add(emp);
                //list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }else{
                Employee emp = new Employee(name, hour, valuePerHour);
                employees.add(emp);
                //list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("------------PAYMENTS------------");
        for(Employee emp : employees){
            System.out.println(emp.getName() +" - $"+ String.format("%.2f", emp.payment()));
        }

        scanner.close();
    }
}
