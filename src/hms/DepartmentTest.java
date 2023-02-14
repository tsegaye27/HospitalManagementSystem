package hms;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentTest {

    @Test
    public void testDepartmentId() {
        Department department = new Department();
        department.setDepartmentId(1);
        assertEquals(1,department.getDepartmentId());
    }
    @Test
    public void testDepartmentName() {
        Department department = new Department();
        department.setDepartmentName("Cardiology");
        assertEquals("Cardiology", department.getDepartmentName());
    }
    @Test
    public void testAddDoctor() {
        Department department = new Department();
        Doctor doctor = new Doctor();
        doctor.setSpecialization("Cardiology");
        department.addDoctor(doctor);
        assertTrue(department.getDoctors().contains(doctor));
    }
    @Test
    public void testDeleteDoctor() {
        Department department = new Department();
        Doctor doctor = new Doctor();
        doctor.setSpecialization("Cardiology");
        department.deleteDoctor(doctor);
        assertFalse(department.getDoctors().contains(doctor));
    }

    @Test
    public void testAddDepartment(){
        Department department = new Department();
        department.setDepartmentId(32);
        department.setDepartmentName("Neurology");
        department.addDepartment(department);
        assertTrue(department.getDepartments().contains(department));
    }

    @Test
    public void testDeleteDepartment(){
        Department department = new Department();
        department.setDepartmentId(545);
        department.setDepartmentName("Pediatrics");
        department.deleteDepartment(department);
        assertFalse(department.getDepartments().contains(department));
    }
}