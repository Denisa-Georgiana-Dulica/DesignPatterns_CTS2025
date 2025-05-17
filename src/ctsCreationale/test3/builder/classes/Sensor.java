package ctsCreationale.test3.builder.classes;

public class Sensor implements AbstractAirQualitySensor{

    private int levelPm25;
    private int levelPm10;
    private int temperature;
    private int humidity;

    Sensor() {
    }

    @Override
    public int getPM10() {
        return this.levelPm10;
    }

    @Override
    public int getTemperatura() {
        return this.temperature;
    }

    @Override
    public int getUmiditate() {
        return this.humidity;
    }

    @Override
    public int getPM25() {
        return this.levelPm25;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "levelPm25=" + levelPm25 +
                ", levelPm10=" + levelPm10 +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    public static class SensorBuilder{
        private Sensor sensor=null;

        public SensorBuilder() {
            this.sensor = new Sensor();
        }

        public SensorBuilder addLevelPm25(int levelPm25)
        {
            this.sensor.levelPm25=levelPm25;
            return this;
        }

        public SensorBuilder addLevelPm10(int levelPm10)
        {
            this.sensor.levelPm10=levelPm10;
            return this;
        }

        public SensorBuilder addTemperature(int levelTemperature)
        {
            this.sensor.temperature=levelTemperature;
            return this;
        }

        public SensorBuilder addHumidity(int humidity)
        {
            this.sensor.humidity=humidity;
            return this;
        }

        public Sensor build()
        {
            Sensor copy=sensor;
            sensor=new Sensor();
            return copy;
        }
    }
}
