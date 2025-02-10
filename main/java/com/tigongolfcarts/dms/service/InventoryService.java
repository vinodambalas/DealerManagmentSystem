@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public List<Vehicle> getAllVehicles() {
        return inventoryRepository.findAll();
    }

    public Vehicle saveVehicle(Vehicle vehicle) {
        return inventoryRepository.save(vehicle);
    }

    public void deleteVehicle(Long id) {
        inventoryRepository.deleteById(id);
    }
}
