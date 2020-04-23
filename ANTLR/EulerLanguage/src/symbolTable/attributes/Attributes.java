package symbolTable.attributes;

import java.util.ArrayList;

public abstract class Attributes {
    public String name;
    public String kind;
    public Attributes var;                  // Next declaration with same name
    public ArrayList<Attributes> level;     // Reference to scope level
    public int depth;

    public Attributes() {

    }

    public Attributes(String name) {
        this.name = name;
    }

    public Attributes(String name, String kind) {
        this(name);
        this.kind = kind;
    }
}
