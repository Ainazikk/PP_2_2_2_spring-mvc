package web.model;

public class Car {

    private String carBrand;
    private String carModel;

    public Car(String carBrand, String carModel) {
        this.carBrand = carBrand;
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}