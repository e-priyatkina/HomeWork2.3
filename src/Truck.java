public class Truck extends Transport implements HasTyres, HasEngine, HasTruck {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void check() {
        checkTyres(this);
        checkEngine();
        checkTrailer();
    }
}
