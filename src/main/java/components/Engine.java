package components;

public abstract class Engine {

    private String engineType;

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}
