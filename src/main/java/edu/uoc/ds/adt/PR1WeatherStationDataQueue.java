package edu.uoc.ds.adt;

import edu.uoc.ds.adt.model.WeatherStationData;
import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;
import edu.uoc.ds.traversal.Iterator;

public class PR1WeatherStationDataQueue {

    public static final int CAPACITY = 1304;

    private Queue<WeatherStationData> queue;

    public PR1WeatherStationDataQueue() {
        newQueue();
    }

    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public Queue<WeatherStationData> getQueue() {
        return this.queue;
    }

    public void add(WeatherStationData data) {
        this.queue.add(data);
    }

    public WeatherStationData poll() {
        return this.queue.poll();
    }

    public double getMeanPrecipitation() {
        if (queue.isEmpty()) return 0;

        double sum = 0;
        int count = 0;
        Iterator<WeatherStationData> iterator = queue.values();
        while (iterator.hasNext()) {
            sum += iterator.next().getPrecipitation();
            count++;
        }
        return count > 0 ? Math.floor((sum / count) * 10.0) / 10.0 : 0;
    }

    public double getMeanAvgAirTemperature() {
        if (queue.isEmpty()) return 0;

        double sum = 0;
        int count = 0;
        Iterator<WeatherStationData> iterator = queue.values();
        while (iterator.hasNext()) {
            sum += iterator.next().getAvgAirTemperature();
            count++;
        }
        return count > 0 ? Math.floor((sum / count) * 10.0) / 10.0 : 0;
    }
}

