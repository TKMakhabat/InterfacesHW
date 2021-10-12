package com.makhabatusen.mobile;

public class Model extends SiemensMobile {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setNetWork(String netWork) {
        System.out.printf("\nModel: %s \nModel's Network: %s", getModel(), netWork);
    }

    public void setNetWork(String model, String netWork) {
        System.out.printf("\nModel: %s \nModel's Network: %s", model, netWork);
    }
}
