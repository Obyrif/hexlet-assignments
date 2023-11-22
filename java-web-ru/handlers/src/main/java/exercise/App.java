package exercise;

import io.javalin.Javalin;

import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN

        // Получаем список телефонов
        List<String> phones = Data.getPhones();
        // Получаем список доменных имен
        List<String> domains = Data.getDomains();

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/phones", ctx -> {
            ctx.json(phones);
            System.out.println("GET /phones requested");
        });

        app.post("/domains", ctx -> {
            ctx.json(domains);
            System.out.println("POST /domains requested");
        });
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
