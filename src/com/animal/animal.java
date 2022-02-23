package com.animal;

public abstract class animal {
    private String name;

    public animal(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        return makeSound();
    }

    public abstract String makeSound();
}
