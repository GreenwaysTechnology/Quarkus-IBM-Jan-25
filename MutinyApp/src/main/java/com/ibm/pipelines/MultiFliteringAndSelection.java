package com.ibm.pipelines;

import io.smallrye.mutiny.Multi;

import java.util.List;

public class MultiFliteringAndSelection {
    public static void main(String[] args) {
        Multi.createFrom()
                .items(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(data -> data % 2 != 0)
                .select().distinct() //filter duplicate values
                .select().first(2) //take first 2 items
                .subscribe().with(System.out::println);

        List<Integer> listDatasource = List.of(2, 3, 56);
        Multi.createFrom().iterable(listDatasource).filter(data -> data % 2 == 0).subscribe().with(System.out::println);

    }
}
