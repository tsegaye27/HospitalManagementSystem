package hms;

import org.junit.Test;

import static org.junit.Assert.*;

public class BillTest {

    @Test
    public void testBill() {
        Bill bill = new Bill();
        bill.setAmount(20000);
        assertEquals(20000, bill.getAmount(),0);
    }
}