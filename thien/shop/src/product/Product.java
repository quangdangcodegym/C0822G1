package product;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Product {
    private long id;
    private String name;
    private float price;
    private int quantity;
    private String manufacturer;
    private Date createAt;
    private Instant updateAt;
    public static int count = 0;

    public Product(){}
    public Product(String name, float price, int quantity, String manufacturer, Date createAt, Instant updateAt){
        count++;
        this.id = count;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    @Override
    public String toString() {
        String pattern = "dd-MM-yyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String dateCreateAt = simpleDateFormat.format(this.createAt);
        String dateUpdateAt = simpleDateFormat.format(Date.from(this.updateAt));
        return String.format("%5s, %15s, %5s, %5s,  %5s, %5s, %5s", this.id, this.name, this.price, this.quantity,
                this.manufacturer, dateCreateAt, dateUpdateAt);
    }
}
