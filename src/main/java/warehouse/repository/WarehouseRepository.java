package warehouse.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import warehouse.model.WarehouseData;

import java.util.List;

public interface WarehouseRepository extends MongoRepository<WarehouseData, String> {
    WarehouseData findByWarehouseId(String warehouseId);
    List<WarehouseData> findByProductsProductName(String productName);
}
