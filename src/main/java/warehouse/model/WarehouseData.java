package warehouse.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Document(collection = "warehouse")
public class WarehouseData {

    @Id
    private String warehouseId;
    private String warehouseName;
    private Date timestamp;
    private int warehousePostalCode;
    private String warehouseCity;
    private String warehouseCountry;
    private List<ProductData> products = new ArrayList<>();

    public WarehouseData() {
    }

    public String getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public int getWarehousePostalCode() {
        return warehousePostalCode;
    }

    public void setWarehousePostalCode(int warehousePostalCode) {
        this.warehousePostalCode = warehousePostalCode;
    }

    public String getWarehouseCity() {
        return warehouseCity;
    }

    public void setWarehouseCity(String warehouseCity) {
        this.warehouseCity = warehouseCity;
    }

    public String getWarehouseCountry() {
        return warehouseCountry;
    }

    public void setWarehouseCountry(String warehouseCountry) {
        this.warehouseCountry = warehouseCountry;
    }

    public List<ProductData> getProducts() {
        return products;
    }

    public void setProducts(List<ProductData> products) {
        this.products = products;
    }

    public void addProduct(ProductData product) {
        this.products.add(product);
    }

    public void removeProduct(ProductData product) {
        this.products.remove(product);
    }

    public void updateProduct(ProductData product) {
        for (ProductData p : this.products) {
            if (p.getProductId().equals(product.getProductId())) {
                p.setProductName(product.getProductName());
                p.setProductQuantity(product.getProductQuantity());
            }
        }
    }
}
