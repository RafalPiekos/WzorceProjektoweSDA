package adapter.exercise2;

import adapter.exercise2.impl.AdapterImp;
import adapter.exercise2.impl.DocConverter;

public class Application {

    public static void main(String[] args) {

        Converter converter = new DocConverter();
        Pdf pdf = new Pdf();

        Adapter adapter = new AdapterImp(converter);

        pdf.convert(adapter);

    }

}
