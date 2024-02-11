package app.model;

import app.helper.HeightException;

import static app.helper.HeightValue.MAX_HEIGHT;
import static app.helper.HeightValue.MIN_HEIGHT;

public class AirRangeModel {
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
        if (height < MIN_HEIGHT.getValue() || height > MAX_HEIGHT.getValue()) {
            throw new HeightException("the height should be from " + MIN_HEIGHT.getValue() + " to " + MAX_HEIGHT.getValue() + " meters inclusive");
        }
    }

}
