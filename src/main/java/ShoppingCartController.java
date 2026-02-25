import io.javalin.Javalin;
import java.util.Map;

public class ShoppingCartController {

    private static final ShoppingCart cart = new ShoppingCart();

    static {
        // starter data so GET shows something
        cart.addItem("Milk");
    }

    public static void registerRoutes(Javalin app) {

        app.get("/health", ctx ->
                ctx.json(Map.of("status", "ok"))
        );

        app.get("/items", ctx ->
                ctx.json(cart.getItems())
        );

        app.get("/cart", ctx -> ctx.json(cart));

        app.post("/items", ctx -> {
            String item = ctx.body(); // ctx = Communication object
            cart.addItem(item);
            ctx.status(201); // 201 means “created”
        });

        app.delete("/items/{name}", ctx -> { // “name” is a placeholder in the URL
            String name = ctx.pathParam("name"); // extracts “Bread”
            boolean removed = cart.removeItem(name); // how do I learn about the return value here?
            if (removed) {
                ctx.status(204); // success, no body
            } else {
                ctx.status(404);
            }
        });
    }
}
