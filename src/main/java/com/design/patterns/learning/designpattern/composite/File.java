package com.design.patterns.learning.designpattern.composite;

public abstract class File {

    private String name;

    protected File(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void ls();

    public abstract void addFile(File file);

    public abstract File[] getFiles();

    public abstract boolean removeFile(File file);

}
