package com.design.patterns.learning.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory extends File {

    private List<File> files = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println(getName());
        files.forEach(File::ls);
    }

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public File[] getFiles() {
        return files.toArray(new File[files.size()]);
    }

    @Override
    public boolean removeFile(File file) {
        return files.remove(file);
    }

}
