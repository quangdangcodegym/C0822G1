package user;

import utils.DateUtils;

import java.time.Instant;
import java.util.Date;

public class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private long phone;
    private Date createAt;
    private Instant updateAt;
    public static int count = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    public User(){}

    public User(String name, String email, String address, long phone, Date createAt, Instant updateAt) {
        count++;
        this.id = count;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        String dateCreateAt = DateUtils.formatDateToString(this.createAt);
        String dateUpdateAt = DateUtils.formatInstantToString(this.updateAt);
        return "id: " + getId() + ", name: " + getName() + ", email: " + getEmail() + ", address: " +getEmail()
                + ", phone: " + getPhone() + ", create at: " + getCreateAt() + ", update at: " + updateAt + "\n";
    }
}
