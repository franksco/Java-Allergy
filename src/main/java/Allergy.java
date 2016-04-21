import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import spark.ModelAndView;
import static java.lang.System.out;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.util.Random;


public class Allergy {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String score = request.queryParams("score");
      Integer scoreInt = Integer.parseInt(score);
      String outputString = "";
      String finalString = allergyTest(score);

      model.put("score", score);
      model.put("scoreInt", scoreInt);
      model.put("finalString", finalString);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
  public static String allergyTest(String score) {
    HashMap<Integer,String> hOfA =  new HashMap<Integer,String>();
      hOfA.put(1, "eggs");
      hOfA.put(2, "peanuts");
      hOfA.put(4, "shellfish");
      hOfA.put(8, "strawberries");
      hOfA.put(16, "tomatoes");
      hOfA.put(32, "chocolate");
      hOfA.put(64, "pollen");
      hOfA.put(128, "cats");
    String list = "";
    Integer newScore = Integer.parseInt(score);
    Integer[] arrayOfAllergies = {128, 64, 32, 16, 8, 4, 2, 1};
    for(int i = 0; i<8; i++){
      if(newScore - arrayOfAllergies[i] >=0){
        list += (hOfA.get(arrayOfAllergies[i]) + ", ");
        newScore = newScore - arrayOfAllergies[i];
      }
    }
    return list;

  }
}
