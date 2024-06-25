package org.example.RefrenceOperator;

public class ConstuRef {
    private String name;

    public ConstuRef(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ConstuRef{" +
                "name='" + name + '\'' +
                '}';
    }
}
