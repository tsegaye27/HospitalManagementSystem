package hms;

import java.util.ArrayList;
import java.util.List;

    public class Department {
        private int departmentId;
        private String departmentName;
        private List<Doctor> doctors = new ArrayList<>();
        public List<Department> departments = new ArrayList<Department>();

        public List<Department> getDepartments() {
            return departments;
        }

        public List<Doctor> getDoctors() {
            return doctors;
        }

        public void setDoctors(List<Doctor> doctors) {
            this.doctors = doctors;
        }

        public Department(int departmentId, String departmentName) {
            this.departmentId = departmentId;
            this.departmentName = departmentName;
        }

        public Department(){

        }

        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
            System.out.println("Doctor " + doctor.getName() + " added to " + departmentName + " department");
        }
        public void deleteDoctor(Doctor doctor) {
            doctors.remove(doctor);
            System.out.println("Doctor " + doctor.getName() + " deleted from " + departmentName + " department");
        }

        public void addDepartment(Department department) {
            departments.add(department);
            System.out.println("Department " + department.getDepartmentName() + " with Department ID: " + department.getDepartmentId() + " was successfully added.");
        }

        public void deleteDepartment(Department department) {
            departments.remove(department);
            System.out.println("Department " + department.getDepartmentName() + " with Department ID: " + department.getDepartmentId() + " was successfully removed.");
        }

        public int getDepartmentId() {
            return departmentId;
        }

        public void setDepartmentId(int departmentId) {
            this.departmentId = departmentId;
        }

        public String getDepartmentName() {
            return departmentName;
        }

        public void setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
        }
    }
