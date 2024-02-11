package app.controller;

import app.model.AirRangeModel;
import app.view.AirRangeView;

public class AirRangeController {
    private AirRangeView airRangeView = new AirRangeView();
    private AirRangeModel airRangeModel = new AirRangeModel();

    public void run(){
        airRangeView.printAirIndicator(airRangeModel.getAirRange(airRangeView.dataInput()));
    }
}
