package animal;

public abstract class Animal{
    String voice;
    String color;
    String eyes;

    public String getColor() {
        return color;
    }

    public String getVoice() {
        return voice;
    }

    public String getEyes() {
        return eyes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "voice='" + voice + '\'' +
                ", color='" + color + '\'' +
                ", eyes='" + eyes + '\'' +
                '}';
    }
}
