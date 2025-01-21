package com.ibm.pipelines;

import io.smallrye.mutiny.Uni;

import java.time.Duration;

public class UniPipeLines {
    public static void main(String[] args) {
        Uni.createFrom().item("hello")
                //attach transformation pipeline api(operator)
                .onItem()
                .transform(data->data.toUpperCase())
                .onItem()
                .delayIt().by(Duration.ofMillis(1000))
                .subscribe().with(System.out::println);
    }
}
