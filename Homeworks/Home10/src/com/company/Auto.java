package com.company;

public class Auto {
    private int pathAmount;
    private int maxSpeed;
    private String color;
    private int fuelCapacity;
    private int price;
    private String countryBuilded;
    private int horses;
    private String name;

        private Auto(Builder builder){
            this.pathAmount = builder.pathAmount;
            this.maxSpeed = builder.maxSpeed;
            this.color = builder.color;
            this.fuelCapacity = builder.fuelCapacity;
            this.price = builder.price;
            this.countryBuilded = builder.countryBuilded;
            this.horses = builder.horses;
            this.name = builder.name;
        }


        public void printAuto(){
            System.out.println("Пробег - " + pathAmount);
            System.out.println("Максимальная скорость - " + maxSpeed);
            System.out.println("Цвет - " + color);
            System.out.println("Бак - " + fuelCapacity);
            System.out.println("Цена - " + price);
            System.out.println("Страна-производитель + " + countryBuilded);
            System.out.println("Лошадки - " + horses);
            System.out.println("Имя - " + name);
        }

    public static class Builder {
        private int pathAmount;
        private int maxSpeed;
        private String color;
        private int fuelCapacity;
        private int price;
        private String countryBuilded;
        private int horses;
        private String name;


        public Builder name (String name){
               if (name != null) {
                   this.name = name;
                   return this;
               }
            System.out.println("Ошибка: теперь ваша машина - Запор");
               String temp = "Запор";
               this.name = temp;
               return this;
        }
        public Builder pathAmount(int pathAmount){
            if (pathAmount > 0) {
                this.pathAmount = pathAmount;
                return this;
            }
            System.out.println("Ошибка");
            this.pathAmount = 0;
            return this;
        }
        public Builder maxSpeed (int maxSpeed){
            if (maxSpeed > 0 ) {
                this.maxSpeed = maxSpeed;
                return this;
            }
            System.out.println("Ошибка");
            this.maxSpeed = 0;
            return this;
        }
        public Builder color (String color){
            if (color != null){
            this.color = color;
            return this;
        }
            System.out.println("Ошибка, цвет выставлен на Чёрный");
            String temp = "Чёрный";
            this.color.equals(temp);
            return this;
    }
        public Builder fuelCapacity (int fuelCapacity){
        if (fuelCapacity > 0){
            this.fuelCapacity = fuelCapacity;
            return this;
        }
            System.out.println("Ошибка");
            this.fuelCapacity = 1;
            return this;
        }
        public Builder price(int price) {
            if (price > 0 ){
                this.price = price;
                return this;
            }
            System.out.println("Ошибка");
            this.price = 1000;
            return this;
        }
        public Builder countryBuilded (String countryBuilded){
        if (countryBuilded != null){
            this.countryBuilded = countryBuilded;
            return this;
        }
            System.out.println("Ошибка: страна - Россия");
            String temp = "Россия";
            this.countryBuilded.equals(temp);
            return this;
        }
        public Builder horses (int horses){
            if (horses > 0 ){
                this.horses = horses;
                return this;
            }
            System.out.println("Ошибка");
            this.horses = 1;
            return this;
        }
        public Auto build() {
            return new Auto(this);
        }
        }
    public static Builder builder() {
        return new Builder();
    }
    public String getCountryBuilded() {
        return countryBuilded;
    }

    public void setCountryBuilded(String countryBuilded) {
        this.countryBuilded = countryBuilded;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }

    public int getPathAmount() {
        return pathAmount;
    }

    public void setPathAmount(int pathAmount) {
        this.pathAmount = pathAmount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
