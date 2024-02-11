package app.model;

import app.helper.HeightException;

public class AirRangeModel {
    public static final int MIN_HEIGHT = 120, MAX_HEIGHT = 355;

    public String getAirRange(int height) {
        String airRange = "-1";

        try {
            validateHeight(height);

            if (height >= 120 && height < 200) {
                airRange = "air is bad";
            } else if (height >= 200 && height < 300) {
                airRange = "air is normal";
            } else if (height >= 300 && height <= 355) {
                airRange = "air is good";
            }
            return airRange;
        } catch (HeightException e) {
            return e.getMessage();
        }
    }

    private void validateHeight(int height) {
        if (height < MIN_HEIGHT || height > MAX_HEIGHT) {
            throw new HeightException("the height should be from " + MIN_HEIGHT + " to " + MAX_HEIGHT + " meters inclusive");
        }
    }

}
