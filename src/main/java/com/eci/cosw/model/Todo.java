package com.eci.cosw.model;

/**
 * @author Santiago Carrillo
 *         1/31/17.
 */
public class Todo {

    private final String name;

    private final String description;

    private final int priority;

    public Todo(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
