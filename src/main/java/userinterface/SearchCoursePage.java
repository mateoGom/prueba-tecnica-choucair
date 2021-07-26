package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage  {
    public static final Target BUTTON_UC =Target.the("selecciona la universida choucair").located(By.xpath("//div[@id='certificaciones']//strong"));
    public static final Target INPUT_OCURSE = Target. the("Buscar el curso").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO=Target.the("Da click para buscar el curso").located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE=Target.the("Da click para buscar el curso").located(By.xpath("//a[(text()='Metodología Bancolombia')]"));
    public static final Target NAME_COURSE=Target.the("Extrae el nombre del curso").located(By.xpath("//h1[contains(text(),'Metodología Bancolombia')]"));



}

