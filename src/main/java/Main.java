import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.mitreTactic;
import objects.Dev;


public class Main {

    static ArrayList<mitreTactic> tactics = new ArrayList<>();
    static ArrayList<Dev> devs = new ArrayList<>();

    public static void main(String[] args) {
      
      tactics.add
        (new mitreTactic("Reconnaissance", "TA0043", "The adversary is trying to gather the information they can use to plan future operations."));
      devs.add(new Dev("Nicholas Johnson", "https://www.linkedin.com/in/kioniwankenobi/"));
      

      Javalin app = Javalin.create().start(4100);
        
      app.get("/", ctx -> ctx.render("index.jte"));
   
      
      app.get("/dev", ctx -> {
        ctx.render("dev.jte", Collections.singletonMap("devs", devs));
      });
  
      app.get("/viewTechTac", ctx -> {
          ctx.render("viewTechTac.jte", Collections.singletonMap("tactics", tactics));
      });

        app.get("/addTac", getTac);
        app.post("/addTac", postTac);

    }

    public static Handler getTac = ctx -> {
        
        ctx.render("addTac.jte");

    };

    public static Handler postTac = ctx -> {

        String name = ctx.formParam("name");
        String id = ctx.formParam("id");
        String description = ctx.formParam("description");

        tactics.add(new mitreTactic(name, id, description));

        ctx.redirect("/");
    };

 

  
}
