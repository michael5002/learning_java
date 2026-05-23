public class SmartKitchen {

    private CoffeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public void setKitchenState(boolean coffeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);

    }

    public void doKitchenWork(){
        brewMaster.brewCoffe();
        iceBox.orderFood();
        dishWasher.dishes();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}

class CoffeMaker{

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffe(){
        if(hasWorkToDo)
            System.out.println("Brewing coffe.");
        hasWorkToDo = false;

    }
}

class Refrigerator{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo)
            System.out.println("Ordering food.");
        hasWorkToDo = false;
    }
}

class DishWasher{
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void dishes(){
        if(hasWorkToDo)
            System.out.println("Washing dishes.");
        hasWorkToDo = false;
    }
}


