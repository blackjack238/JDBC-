package org.example;

public class YoungestAndEldest {
    public YoungestAndEldest(String type, String name, String birthaday) {
        this.type = type;
        this.name = name;
        this.birthaday = birthaday;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getBirthaday() {
        return birthaday;
    }

    private String type;
    private String name;
    private String birthaday;

    @Override
    public String toString() {
        return "YoungestAndEldest{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", birthaday='" + birthaday + '\'' +
                '}';
    }
}
