package com.ibm.rest.response.thread;

import com.ibm.rest.api.responses.Item;
import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("nonblocking")
public class NonBlockingResource {

    @GET
    public Uni<String> hello() {
        System.out.println(Thread.currentThread().getName());
        return Uni.createFrom().item("Hello");
    }
    @GET
    @Path("item")
    public Uni<Item> getItem() {
        System.out.println(Thread.currentThread().getName());
        return Uni.createFrom().item(new Item(1, "Book"));
    }
    @GET
    @Path("items")
    public Uni<List<Item>> getItems() {
        System.out.println(Thread.currentThread().getName());
        return Uni.createFrom().item(List.of(new Item(1, "book")));
    }
}
