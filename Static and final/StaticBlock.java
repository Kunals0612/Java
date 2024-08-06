class Practice {
    // Constructor for the Practice class
    public Practice() {
        System.out.println("Hello");
    }
    
    // Static block 1: Executes when the class is first loaded
    static {
        System.out.println("Block 1");
    }
    
    // Static block 2: Executes when the class is first loaded, after static block 1
    static {
        System.out.println("Block 2");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        // Creating an instance of the Practice class
        Practice p = new Practice();
        // This will call the constructor of Practice class, printing "Hello"
        
        // Print statement in the main method
        System.out.println("Main");
    }
}

