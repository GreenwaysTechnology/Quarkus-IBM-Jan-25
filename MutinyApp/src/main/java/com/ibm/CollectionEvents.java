package com.ibm;

import io.smallrye.mutiny.Multi;

import java.util.List;

public class CollectionEvents {
    public static void main(String[] args) {
        List mylist = List.of(1, 2, 3, 4, 5, 6, 8, 9, 10);
        Multi.createFrom().iterable(mylist).subscribe().with(System.out::println);
    }
}
