package com.ibm;

import io.smallrye.mutiny.Uni;

class Auth {
    public static Uni auth(String userName, String password) {
        if (userName.equals("admin") && password.equals("admin")) {
            return Uni.createFrom().item("Login success");
        }
        return Uni.createFrom().failure(new RuntimeException("Login failed"));
    }
}

public class Login {
    public static void main(String[] args) {
        Auth.auth("admin", "admin").subscribe().with(data -> {
            System.out.println(data);
        }, err -> {
            System.out.println(err);
        });

        Auth.auth("xx", "adsfadf").subscribe().with(data -> {
            System.out.println(data);
        }, err -> {
            System.out.println(err);
        });
    }
}
