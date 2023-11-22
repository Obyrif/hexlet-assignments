package exercise;

import io.javalin.Javalin;

import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });
        app.get("/phones", ctx -> {
            List<String> phones = Data.getPhones();
            // Преобразование списка телефонов в формат JSON
            String jsonPhones = new ObjectMapper().writeValueAsString(phones);
            ctx.result(jsonPhones).contentType("application/json");
        });

        // Обработчик для маршрута /domains
        app.get("/domains", ctx -> {
            List<String> domains = Data.getDomains();
            // Преобразование списка доменов в формат JSON
            String jsonDomains = new ObjectMapper().writeValueAsString(domains);
            ctx.result(jsonDomains).contentType("application/json");
        });
        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
