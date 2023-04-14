package day21_arrays;

public class Store {
    public static void main(String[] args) {
        // Hat
        String [] items = {"Shoes", "Jacket", "Gloves", "Hat", "Dress", "Sunglass"};
        boolean hasHat = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("hat")) {
                hasHat = true;
                break;
            }

        }

        if(hasHat) {
            System.out.println("Hat item is available.");
        } else {
            System.out.println("hat is out of stock");
        }


        //This is just extra to recap ternary
        System.out.println(hasHat ? "Hat item is available." :"hat is out of stock");





    }


}
