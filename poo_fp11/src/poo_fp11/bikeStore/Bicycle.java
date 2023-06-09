package poo_fp11.bikeStore;

public class Bicycle {
    private int id, numberOfGears;
    private String mainColor;
    private float wheelSize, bikeLength, price;
    private boolean adjustableSeatPost;

    public Bicycle(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatPost) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.bikeLength = bikeLength;
        this.price = price;
        this.adjustableSeatPost = adjustableSeatPost;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public float getBikeLength() {
        return bikeLength;
    }

    public float getPrice() {
        return price;
    }

    public boolean isAdjustableSeatPost() {
        return adjustableSeatPost;
    }
}
