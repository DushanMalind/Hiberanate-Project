package lk.ijse.hiberanate.embedded;

import javax.persistence.Embeddable;

@Embeddable
public class MobilNumber {
    private String type;
    private String mobilNumber;

    public MobilNumber() {
    }

    public MobilNumber(String type, String mobilNumber) {
        this.type = type;
        this.mobilNumber = mobilNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMobilNumber() {
        return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
        this.mobilNumber = mobilNumber;
    }

    @Override
    public String toString() {
        return "MobilNumber{" +
                "type='" + type + '\'' +
                ", mobilNumber='" + mobilNumber + '\'' +
                '}';
    }
}
