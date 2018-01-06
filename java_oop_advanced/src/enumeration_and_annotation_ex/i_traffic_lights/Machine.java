package enumeration_and_annotation_ex.i_traffic_lights;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Machine{

    List<TrafficLight> trafficLights;

    Machine(String[] strings) {
        this.setTrafficLights(strings);
    }

    public void setTrafficLights(String[] trafficLights) {
        this.trafficLights = new ArrayList<>();
        for (String trafficLight : trafficLights) {
            this.trafficLights.add(TrafficLight.valueOf(trafficLight.toUpperCase()));
        }
    }

    public void setNewLights(){
        List<TrafficLight> newTrafficlights = new ArrayList<>();

        for (TrafficLight currentLight : this.trafficLights) {
             newTrafficlights.add(getNewTrafficLight(currentLight));
        }

        this.trafficLights = newTrafficlights;
    }

    public TrafficLight getNewTrafficLight(TrafficLight trafficLight){
        TrafficLight light = TrafficLight.GREEN;
        switch (trafficLight.name()){
            case "RED":
                light = TrafficLight.GREEN;
                break;
            case "GREEN":
                light = TrafficLight.YELLOW;
                break;
            case "YELLOW":
                light = TrafficLight.RED;
                break;
        }

        return light;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (TrafficLight trafficLight : trafficLights) {
            sb.append(trafficLight).append(" ");
        }
        return sb.toString().trim();
    }
}
