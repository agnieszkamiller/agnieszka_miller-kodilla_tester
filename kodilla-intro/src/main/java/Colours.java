public enum Colours {
    CZARNY("C"),
    POMARANCZOWY("P"),
    BIALY("B"),
    ZIELONY("Z");
//    NIEBIESKI("N");
//    FIOLETOWY("F");
//    ROZOWY("R");

    String colourName;

    Colours(String colourName) {
        this.colourName = colourName;
    }

    public String getColourName() {
        return colourName;
    }


}
