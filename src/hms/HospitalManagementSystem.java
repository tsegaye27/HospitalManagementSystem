package hms;

import java.util.ArrayList;
import java.util.Scanner;

public class HospitalManagementSystem {
    static ArrayList<Doctor> doctors = new ArrayList<>();
    static ArrayList<Department> departments = new ArrayList<>();
    static ArrayList<Patient> patients = new ArrayList<>();
    public static void main(String[] args) {

        Department cardiology = new Department(1, "Cardiology");
        Department neurology = new Department(2, "Neurology");
        Department oncology = new Department(3,"Oncology");
        Department orthopedics = new Department(4,"Orthopedics");
        Department pediatrics = new Department(5,"Pediatrics");
        Department psychiatry = new Department(6,"Psychiatry");

        Doctor tsegaye = new Doctor("Tsegaye", "Neurology");
        Doctor jemberu = new Doctor("Jemberu", "Cardiology");
        Doctor tadele = new Doctor("Tadele","Oncology");
        Doctor henok = new Doctor("Henok","Orthopedics");
        Doctor helen = new Doctor("Helen","Pediatrics");
        Doctor abraham = new Doctor("Abraham","Psychiatry");

        doctors.add(tsegaye);
        doctors.add(jemberu);
        doctors.add(tadele);
        doctors.add(henok);
        doctors.add(helen);
        doctors.add(abraham);

        departments.add(cardiology);
        departments.add(oncology);
        departments.add(orthopedics);
        departments.add(pediatrics);
        departments.add(psychiatry);
        departments.add(neurology);

        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--------------------Welcome to Our Hospital Management System--------------------\n");
            System.out.println("Please select an option to Login: ");
            System.out.println("1. Admin");
            System.out.println("2. Patient");
            System.out.println("3. Doctor");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = scan.nextInt();
            int adminChoice;
            int patientChoice;
            switch (choice) {
                case 1:
                    do {
                        System.out.println("\n--------------------Admin Options--------------------\n");
                        System.out.println("1. Add Doctor");
                        System.out.println("2. Remove Doctor");
                        System.out.println("3. View List of Doctors");
                        System.out.println("4. Add Department");
                        System.out.println("5. Remove Department");
                        System.out.println("6. View List of Departments");
                        System.out.println("7. Logout");
                        System.out.print("\nEnter your choice: ");
                        adminChoice = scan.nextInt();
                        switch (adminChoice) {
                            case 1:
                                System.out.println("\nEnter Doctor Name: ");
                                scan.nextLine();
                                String doctorName = scan.nextLine();
                                System.out.println("Enter Doctor Specialization: ");
                                String specialization = scan.next();
                                Doctor doctor = new Doctor(doctorName, specialization);
                                doctors.add(doctor);
                                System.out.println("\nDoctor added successfully\n");
                                break;
                            case 2:
                                System.out.println("\nEnter the name of the doctor to remove:");
                                scan.nextLine();
                                String name = scan.nextLine();
                                int index = findDoctor(name);
                                if (index == -1) {
                                    System.out.println("\nDoctor not found\n");
                                    break;
                                }
                                doctors.remove(index);
                                System.out.println("\nDoctor removed successfully\n");
                                break;
                            case 3:
                                System.out.println("\nList of Doctors: ");
                                if (doctors.isEmpty()){
                                    System.out.println("\nThere are no Doctors currently.\n");
                                }
                                else {
                                    for (int i = 0; i < doctors.size(); i++) {
                                        System.out.println((i + 1) + ". " + doctors.get(i).getName() + " - " + doctors.get(i).getSpecialization());
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("\nEnter Department ID: ");
                                int departmentId = scan.nextInt();
                                System.out.println("Enter Department Name: ");
                                scan.nextLine();
                                String departmentName = scan.nextLine();
                                Department department = new Department(departmentId, departmentName);
                                departments.add(department);
                                System.out.println("\nDepartment added successfully\n");
                                break;
                            case 5:
                                System.out.println("\nEnter the ID of the department you want to remove: ");
                                int id = scan.nextInt();
                                Department foundDepartment = findDepartment(departments, id);
                                if (foundDepartment == null) {
                                    System.out.println("\nDepartment not found with ID " + id + "\n");
                                } else {
                                    departments.remove(foundDepartment);
                                    System.out.println("\nDepartment removed successfully.\n");
                                }
                                break;
                            case 6:
                                System.out.println("\nList of Departments: ");
                                if (departments.isEmpty()){
                                    System.out.println("\nThere are no departments currently.\n");
                                }
                                else {
                                    for (int i = 0; i < departments.size(); i++) {
                                        System.out.println((i + 1) + ". " + departments.get(i).getDepartmentId() + " - " + departments.get(i).getDepartmentName());
                                    }
                                }
                                break;
                            case 7:
                                System.out.println("\nYou have successfully logged out\n");
                                break;
                            default:
                                System.out.println("\nInvalid choice. Try again.\n");
                                break;
                        }
                    } while ( adminChoice != 7);
                    break;

                case 2:
                    do {
                        System.out.println("\n--------------------Patient Options--------------------\n");
                        System.out.println("1. Register Patient");
                        System.out.println("2. Pay My Bill");
                        System.out.println("3. Logout");
                        System.out.print("\nEnter your choice: ");
                        patientChoice = scan.nextInt();
                        switch (patientChoice){
                            case 1:
                                System.out.println("\nEnter your name:");
                                scan.nextLine();
                                String name = scan.nextLine();
                                System.out.println("Enter your Id:");
                                int id = scan.nextInt();
                                System.out.println("Enter your age:");
                                int age = scan.nextInt();
                                System.out.println("Enter your gender (male/female):");
                                String gender = scan.next();
                                System.out.println("Enter your room number:");
                                int roomNo = scan.nextInt();
                                Patient newPatient = new Patient(id,name,age,gender,roomNo);
                                patients.add(newPatient);
                                System.out.println("\nYou Have Registered Successfully\n");
                                break;

                            case 2:
                                System.out.print("\nEnter Your ID: ");
                                int pId = scan.nextInt();
                                Patient existingPatient = null;
                                for (Patient p: patients){
                                    if (p.getId() == pId){
                                        existingPatient = p;
                                        break;
                                    }
                                }
                                if (existingPatient == null){
                                    System.out.println("\nPatient not found\n");
                                }
                                else {
                                    System.out.println("Enter Card Amount: ");
                                    float cardAmount = scan.nextFloat();
                                    System.out.println("Enter Medical Amount: ");
                                    float medAmount = scan.nextFloat();
                                    System.out.println("Enter Card Number: ");
                                    String cardNo;
                                    scan.nextLine();
                                    cardNo = scan.nextLine();
                                    Accountant ac = new Accountant();
                                    Bill b = ac.generateBill(existingPatient, cardAmount, medAmount, cardNo);
                                    ac.receiveBill(b);
                                    System.out.println("\nBill Paid Successfully\n");
                                }
                                break;
                            case 3:
                                System.out.println("\nYou have logged out successfully.");
                                break;
                            default:
                                System.out.println("\nInvalid choice. Try again.\n");
                                break;
                        }
                    }while(patientChoice != 3);
                    break;

                case 3:
                        System.out.println("\nEnter your name: ");
                        scan.nextLine();
                        String name = scan.nextLine();
                        int doctorIndex = findDoctor(name);
                        if (doctorIndex == -1) {
                            System.out.println("\nDoctor not found.\n");
                        } else {
                            Doctor d = doctors.get(doctorIndex);
                            int ch;
                            do {
                                System.out.println("\n----------Welcome Dr. " + d.getName() + "----------\n");
                                System.out.println("1. Prescribe Medicine");
                                System.out.println("2. Check Report");
                                System.out.println("3. Logout");
                                System.out.println("\nEnter your choice: ");
                                ch = scan.nextInt();
                                switch (ch) {
                                    case 1:
                                        System.out.println("\nEnter the Patient's name: ");
                                        scan.nextLine();
                                        String patientName = scan.nextLine();
                                        System.out.println("Enter the Patient's ID: ");
                                        int patientID = scan.nextInt();
                                        Patient p = new Patient(patientID, patientName);
                                        System.out.println(d.prescribeMedicine(p));
                                        break;
                                    case 2:
                                        System.out.println("\nEnter the Patient's name: ");
                                        scan.nextLine();
                                        String ptName = scan.nextLine();
                                        System.out.println("Enter the Patient's ID: ");
                                        int ptId = scan.nextInt();
                                        Patient pt = new Patient(ptId, ptName);
                                        System.out.println(d.checkReport(pt));
                                        break;
                                    case 3:
                                        System.out.println("\nLogging out...\n");
                                        break;
                                    default:
                                        System.out.println("\nInvalid choice!\n");
                                        break;
                                }
                            } while (ch != 3);
                        }
                    break;
                case 4:
                    System.out.println("\nExiting...\n");
                    break;
                default:
                    System.out.println("\nInvalid choice. Try again.\n");
                    break;
            }
        }while(choice!=4);
    }
    private static int findDoctor(String name) {
        for (int i = 0; i < doctors.size(); i++) {
            if (doctors.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    private static Department findDepartment(ArrayList<Department> departments, int id) {
        for (Department d : departments) {
            if (d.getDepartmentId() == id) {
                return d;
            }
        }
        return null;
    }

}
