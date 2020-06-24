public enum Colours {
    CZARNY("C"),
    POMARANCZOWY("P"),
    BIALY("B"),
    ZIELONY("Z");

    String colourName;

    Colours(String colourName) {
        this.colourName = colourName;
    }

    public String getColourName() {
        return colourName;
    }
}
