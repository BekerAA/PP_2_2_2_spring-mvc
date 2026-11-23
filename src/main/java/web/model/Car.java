package web.model;

public class Car {

    private String model;

    private String seria;

    private int yearsModel;

    public Car(String model, String seria, int yearsModel) {
        this.model = model;
        this.seria = seria;
        this.yearsModel = yearsModel;
    }

    public String getModel() {
        return model;
    }

    public String getSeria() {
        return seria;
    }

    public int getYearsModel() {
        return yearsModel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public void setYearsModel(int yearsModel) {
        this.yearsModel = yearsModel;
    }
}
