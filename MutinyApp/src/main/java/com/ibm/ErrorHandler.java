package com.ibm;

import io.smallrye.mutiny.Uni;

import java.time.Duration;

public class ErrorHandler {
    public static void main(String[] args) {
        Uni.createFrom().failure(new RuntimeException("oops")).subscribe().with(data -> {
        }, err -> {
            System.out.println(err);
        });
        //errors can be converted as positive response
        Uni.createFrom().failure(new RuntimeException("oops"))
                .onFailure().recoverWithItem("fallback")
                .onItem().delayIt().by(Duration.ofMillis(5000))
                .subscribe().with(data -> {
                    System.out.println(data);
                });
    }
}
