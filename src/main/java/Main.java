import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {

        //Javalin app = Javalin.create().start(7000); // Start without front end

        // uncomment after first exercise, index.html needs to be in the resources/public new folder
        Javalin app = Javalin.create(config -> {
            // Serve static files from: src/main/resources/public
            config.staticFiles.add("public"); // Points to static files that our front end can see
        }).start(7000);

        ShoppingCartController.registerRoutes(app); // Register controller
    }
}