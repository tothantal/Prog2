package artifactid;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XmlMapPlotter {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        
    	String input = "";
    	String output = "";
    	
    	if (args.length > 2) {
        	System.out.println("Usage: javac XmlMapPlotter.java [input.xml] [output.svg]");
        } else if(args.length == 2){
        	input = args[0];
        	output = args[1];
        } else {
        	input = "input.xml";
        	output = "map.svg";
        }
    	
    	XmlReader reader = new SaxXmlReader(new FileInputStream(input));
        List<City> cities = reader.getCities();
        MapImage image = new SvgMapImage(800, 600);
        cities.forEach(city -> city.plot(image));
        image.save(new FileWriter(output));
    }
}