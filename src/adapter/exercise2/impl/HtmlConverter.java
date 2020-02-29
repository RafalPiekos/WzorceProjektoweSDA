package adapter.exercise2.impl;

import adapter.exercise2.Converter;

public class HtmlConverter implements Converter {
    @Override
    public void convert() {
        System.out.println("Converting .html to .pdf");
    }
}
