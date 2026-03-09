// Lowkey got messy but had to have two seperate arrays so that all logs had the same material but could have different weight values

package finalProjectCS141;

public class RecycleLog {
    // global materials
    public static final int maxMaterials = 20;
    private static Recyclable[] globalMaterials = new Recyclable[maxMaterials];
    private static int globalSize = 0;

    // not global materials
    private Recyclable[] materials;
    private int size;

    // adds base materials
    static {
        addMaterial("Paper", 0.46);
        addMaterial("Plastic", 1.7);
        addMaterial("Metal", 4);
        addMaterial("Glass", 0.3);
    }

    public RecycleLog() {
        // copies materials from global materials
        
        size = globalSize;
        materials = new Recyclable[size];
        for (int i = 0; i < size; i++) {
            Recyclable t = globalMaterials[i];
            materials[i] = new Recyclable(t.getName(), t.getCarbonOutput());
        }
    }

    // adds a material globally
    public static void addMaterial(String name, double carbonOutput) {
        if (globalSize < globalMaterials.length) {
            globalMaterials[globalSize] = new Recyclable(name, carbonOutput);
            globalSize++;
        }
    }

    // adds weight to a material in grams
    public void addWeight(int index, double amount) {
        materials[index].add(amount);
    }

    public Recyclable getMaterial(int index) { 
        return materials[index]; 
    }

    public int getSize() { 
        return size; 
    }

    public double getCarbonSaved() {
        // loops through all materials and gets their carbon saved val
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += materials[i].getCarbonSaved();
        }
        return total;
    }

    public void displayLog() {
        //loops through all materials and displays their name, weight and carbon saved
        System.out.println(Main.divider);
        for(int i = 0; i < size; i++) {
            System.out.println(i+1 + ". " + materials[i].getName() + " | " + materials[i].getWeight() + " grams | Carbon Saved: " + materials[i].getCarbonSaved() + " kg");
        }
        System.out.println("Total carbon saved: " + getCarbonSaved() + " kg");
        System.out.println(Main.divider);
    }
}