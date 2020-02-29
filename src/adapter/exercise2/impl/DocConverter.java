package adapter.exercise2.impl;

import adapter.exercise2.Converter;

public class DocConverter implements Converter {

    @Override
    public void convert() {
        System.out.println("Converting .doc to .pdf");
    }
}
