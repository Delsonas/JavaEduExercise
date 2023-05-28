public class OutgoingDocument extends Document {
    private String adrOfOut;
    private String wayOfOut;

    @Override
    public String toString() {
        return "Исходящий документ [" +
                "Адресат = " + adrOfOut +
                ", Способ доставки = " + wayOfOut + "]";
    }

    @Override
    public String getName() {
        return ("Исходящий");
    }

    public void setAdrOfOut(String adrOfOut) {
        this.adrOfOut = adrOfOut;
    }

    public void setWayOfOut(String wayOfOut) {
        this.wayOfOut = wayOfOut;
    }
}
