package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import system.helpers.DriverManager;

public class Hooks {

    @Before
    public void inicializar(){
        System.out.println("Inicia driver");
        DriverManager.getDriver();
        DriverManager.getDriver().manage().window().maximize();

    }
    @After
    public void finalizar(){
        System.out.println("finalizar driver");
        DriverManager.endSession();

    }

}
