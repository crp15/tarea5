package edu.tep.tarea5;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

    /**
     * @param args the command line arguments
     */
    /*cargamos un documento desde la url*/
    public static void main(String[] args) throws IOException {
        
        Document doc = (Document) Jsoup.connect("https://pucmm.edu.do/").get();

        /*Extraemos los atributos desde el html*/
        Elements parrafos = doc.select("p");
        Elements media = doc.select("[src]");
        Elements lineas = doc.select("br");
        Elements formularios = doc.select("form");
        Elements inputs = doc.select("input");
/* buscamos las ocurrencias de imagenes*/
 System.out.printf("\nImagenes: (%d)", media.size());
     /*   for (Element src : media) {
            if (src.tagName().equals("img"))
                print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            else
                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }*/
/*buscamos las ocurrencias de parrafos */
System.out.printf("\nParrafos: (%d)", parrafos.size());
        for (Element p : parrafos) {
            System.out.printf(" * p...");
            
        }
        
/*buscamos las ocurrencias de lineas */
System.out.printf("\nLineas: (%d)", lineas.size());
        for (Element br : lineas) {
            System.out.printf(" * br...");
        }
/*buscamos las ocurrencias de formularios */
        System.out.printf("\nFormulario: (%d)", formularios.size());
        for (Element form : formularios) {
            System.out.printf(" *formulario...");
        }

/*buscamos las ocurrencias de inputs */
        System.out.printf("\nInputs: (%d)", inputs.size());
        for (Element input : inputs) {
            System.out.printf(" *input...");
        }

    }

  
}
