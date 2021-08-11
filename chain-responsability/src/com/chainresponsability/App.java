package com.chainresponsability;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.chainresponsability.middleware.Middleware;
import com.chainresponsability.middleware.RoleCheckMiddleware;
import com.chainresponsability.middleware.ThrottlingMiddleware;
import com.chainresponsability.middleware.UserExistsMiddleware;
import com.chainresponsability.server.Server;

public class App {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws Exception {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Enter password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
