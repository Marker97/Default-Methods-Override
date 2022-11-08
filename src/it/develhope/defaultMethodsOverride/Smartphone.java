package it.develhope.defaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable{
    public String brandName;
    public String modelName;
    public int batterymAh;
    public SmartphonePrice producerPrice;
    public SmartphonePrice retailPrice;

    public Smartphone (String brandName,String modelName, int batterymAh, SmartphonePrice producerPrice, SmartphonePrice retailPrice){
        this.brandName = brandName;
        this.modelName = modelName;
        this.batterymAh =  batterymAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "Smartphone: " + "\n" +
                "Brand: " + brandName + "\n" +
                "Model: " + modelName + "\n" +
                "Battery: " + batterymAh + "\n" +
                "Producer: " + producerPrice + "\n" +
                "Retail Price: " + retailPrice;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batterymAh == that.batterymAh && Objects.equals(brandName, that.brandName) && Objects.equals(modelName, that.modelName) && Objects.equals(producerPrice, that.producerPrice) && Objects.equals(retailPrice, that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batterymAh, producerPrice, retailPrice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
}
