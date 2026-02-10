// John Chiero
// 2/9/2026
// Cat class for my Cat objects.

public class Cat {
    private String name;
    private boolean clawsTrimmed;
    private String eyeColor;

    public Cat() {            // default constructor
        name = "Unknown";
        clawsTrimmed = false;
        eyeColor = "Yellow";
    }

    public Cat(String name, boolean clawsTrimmed, String eyeColor) { // parameterized constructor
        this.name = name;
        this.clawsTrimmed = clawsTrimmed;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Cat{name='" + name + "', clawsTrimmed=" + clawsTrimmed + ", eyeColor='" + eyeColor + "'}";
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public boolean getClawsTrimmed() { return clawsTrimmed; }
    public void setClawsTrimmed(boolean clawsTrimmed) { this.clawsTrimmed = clawsTrimmed; }

    public String getEyeColor() { return eyeColor; }
    public void setEyeColor(String eyeColor) { this.eyeColor = eyeColor; }
}