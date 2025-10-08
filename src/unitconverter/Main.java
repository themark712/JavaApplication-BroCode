package unitconverter;

import java.io.FileReader;
import java.io.FileWriter;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import java.util.Iterator;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {
    readJson("units.json");
  }

  /*
     * Java Method to read JSON From File
   */
  public static void readJson(String file) {
    JSONParser parser = new JSONParser();

    try {
      System.out.println("Reading JSON file from Java program");
      FileReader fileReader = new FileReader(file);
      JSONObject json = (JSONObject) parser.parse(fileReader);
      
      JSONArray units = (JSONArray) json.get("units");
      Iterator i = units.iterator();

      while (i.hasNext()) {
        JSONObject slide = (JSONObject) i.next();
        String title = (String) slide.get("name");

        System.out.println(title);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  /*
     * Java Method to write JSON String to file
   */
  public static void writeJson(String file) {
    JSONObject json = new JSONObject();
    json.put("title", "Harry Potter and Half Blood Prince");
    json.put("author", "J. K. Rolling");
    json.put("price", 20);

    JSONArray jsonArray = new JSONArray();
    jsonArray.add("Harry");
    jsonArray.add("Ron");
    jsonArray.add("Hermoinee");

    json.put("characters", jsonArray);

    try {
      System.out.println("Writting JSON into file ...");
      System.out.println(json);
      FileWriter jsonFileWriter = new FileWriter(file);
      jsonFileWriter.write(json.toJSONString());
      jsonFileWriter.flush();
      jsonFileWriter.close();
      System.out.println("Done");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
