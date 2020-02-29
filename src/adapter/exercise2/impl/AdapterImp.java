package adapter.exercise2.impl;

import adapter.exercise2.Adapter;
import adapter.exercise2.Converter;

public class AdapterImp implements Adapter {

    private Converter converter;

    public AdapterImp(Converter converter) {
        this.converter = converter;
    }

    @Override
    public void convert() {
        this.converter.convert();
    }
}
