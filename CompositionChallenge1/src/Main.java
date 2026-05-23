public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(false,true,true);
        kitchen.doKitchenWork();
//
//        kitchen.getBrewMaster().setHasWorkToDo(true);
//        kitchen.getIceBox().setHasWorkToDo(true);
//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getDishWasher().dishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffe();
    }
}
