package UdemyPractice;

import java.util.Locale;

public class ExampleOfAccessSpecifier {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if (validModel.equals("carrera"))
        {
            this.model=validModel;
        }else {
            this.model="Unknown";
        }

    }

    public String getModel() {

        return this.model;

    }

}
