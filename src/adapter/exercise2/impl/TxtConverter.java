package adapter.exercise2.impl;

import adapter.exercise2.Converter;

public class TxtConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("Converting .txt to .pdf");
    }
}
