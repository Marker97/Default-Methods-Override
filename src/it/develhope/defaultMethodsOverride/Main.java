package it.develhope.defaultMethodsOverride;

public class Main {
    public static void main(String[] args) {
        SmartphonePrice smartphonePriceProducer1 = new SmartphonePrice("Euro", 400.00);
        SmartphonePrice smartphonePriceProducer2 = new SmartphonePrice("Euro", 200.00);
        SmartphonePrice smartphonePriceRetail1 = new SmartphonePrice("Euro", 800.00);
        SmartphonePrice smartphonePriceRetail2 = new SmartphonePrice("Euro", 400.00);

        Smartphone iphone = new Smartphone("Apple", "Iphone14", 4000, smartphonePriceProducer1, smartphonePriceRetail1);
        Smartphone samsung = new Smartphone("Samsung", "S22", 4000 , smartphonePriceProducer2, smartphonePriceRetail2);

        System.out.println("-----PRICE LIST SMARTPHONES-----");

        System.out.println(iphone.toString());

        System.out.println("---------------------");

        System.out.println(samsung.toString());

        System.out.println("---------------------");

        if(iphone.equals(samsung)){
            System.out.println("Smartphones are equals");
        }else{
            System.out.println("Smartphones are not equals");
        }
        System.out.println("---------------------");

        Smartphone cloneSmartphone = null;

        try{
            cloneSmartphone = (Smartphone) samsung.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("Error");
        }

        System.out.println("Dispositivo clonato: \n" + cloneSmartphone);

        System.out.println("---------------------");

        if(samsung.equals(cloneSmartphone)){
            System.out.println("The Samsung S22 and the Cloned Smartphone are equals");
        }
}






    }

