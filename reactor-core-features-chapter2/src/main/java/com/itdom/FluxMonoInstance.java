package com.itdom;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FluxMonoInstance {
    public static void main(String[] args) {
        Flux<String> seql = Flux.just("foo", "bar", "footbar");
        List<String> iterable = Arrays.asList("foo", "bar", "footbar");
        Flux<Integer> numbersFromFiveToSeven = Flux.range(5, 3);
        seql.toStream().forEach(System.out::println);
        iterable.forEach(System.out::println);
        numbersFromFiveToSeven.toStream().forEach(System.out::println);

        System.out.println("-------------------------------------------------------------");
        Mono<Object> empty = Mono.empty();
        Mono<String> dmeo = Mono.just("dmeo");
        dmeo.flux().toStream().forEach(System.out::println);
        empty.flux().toStream().forEach(System.out::println);

    }
}
