package dev.nomizo.model;

public class Topic {
    private String id;
    private String name;
    private String description;

    // This portion of the code is called No Args Constructor
    public Topic() {
        super();
    }

    // This portion of the code is called a Constructor.  Allows us to create Topic Objects
    public Topic (String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // This portion of the code is called Getter & Setter.  Getter allows us to read data, while Setter allows us to write data.
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    // This portion of the code allows us to pass our data as string.
    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
