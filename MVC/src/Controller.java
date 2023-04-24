public class Controller {
    private Car model;
    private CarView view;

    public Controller(Car model, CarView view) {
        this.model = model;
        this.view = view;
    }

    public void setName(String name) {
        model.setName(name);
    }

    public String getName() {
        return model.getName();
    }

    public void setEngine(String engine) {
        model.setEngine(engine);
    }

    public String getEngine() {
        return model.getEngine();
    }

    public void updateView(){
        view.printCarDetails(model.getName(), model.getEngine());
    }
}
