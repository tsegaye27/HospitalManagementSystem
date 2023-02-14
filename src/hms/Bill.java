package hms;

public class Bill {
    private int id;
    private String patientName;
    private String cardNo;
    private float amount;

    public Bill(int id, String patientName, String cardNo, float amount) {
        this.id = id;
        this.patientName = patientName;
        this.cardNo = cardNo;
        this.amount = amount;
    }
    public Bill(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
