public enum Planet {
    EARTH("Жер планетасында жан бар жана орточо температурасы 14,8С"),
    MARS("Марс жер планетасына окшош"),
    SATURN("Сатурн Кундон алыстыгы боюнча 6 оорунда турат кун" +
            " системасында чондугу боюнча Юпитерден кийинки экинчи планета ");
    private  String planet;

    Planet(String planet) {
        this.planet = planet;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }
}
