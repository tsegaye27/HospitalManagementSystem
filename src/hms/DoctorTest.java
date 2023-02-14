package hms;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoctorTest {

    @Test
    public void testDoctorMethods() {
        Doctor doctor = new Doctor();
        doctor.setSpecialization("Cardiology");

        assertEquals("Cardiology",doctor.getSpecialization());
    }
}