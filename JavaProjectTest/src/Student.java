import javax.swing.text.html.Option;
import java.util.Optional;

public class Student {
    private String name;
    private long mobileNo;
    private Optional<Address> address;

    public Student(String name, long mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Optional<Address> getAddress() {
        return address;
    }
}
