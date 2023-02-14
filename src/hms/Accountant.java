package hms;
public class Accountant extends Person{
    public Bill generateBill(Patient patient, float cardAmount , float medAmount, String cardNo) {
        float amount = cardAmount + medAmount;
        Bill bill = new Bill(patient.getId(), patient.getName(), cardNo , amount);
        System.out.println("\nBill generated for patient " + patient.getName() + " is " + amount+" Birr");
        return bill;
    }

    public void receiveBill(Bill bill) {
        System.out.println("\nBill received for patient " + bill.getPatientName() + " is " + bill.getAmount()+" Birr");
    }
}