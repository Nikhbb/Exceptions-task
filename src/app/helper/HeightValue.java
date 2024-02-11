package app.helper;

public enum HeightValue {
    MIN_HEIGHT(120), MAX_HEIGHT(355);

    private int value;

    HeightValue(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
