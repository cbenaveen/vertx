package org.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class HelloWorldVerticle extends AbstractVerticle {
    @Override
    public void start(Promise<Void> promise) {
        System.out.println("MyVerticle started!");
        promise.complete();
    }

    @Override
    public void stop(Promise promise) throws Exception {
        System.out.println("MyVerticle stopped!");
        promise.complete();
    }
}
