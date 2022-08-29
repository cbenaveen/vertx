package org.vertx;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

import java.util.concurrent.CyclicBarrier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final DeploymentOptions deploymentOptions = new DeploymentOptions();
        deploymentOptions.setInstances(4);

        final Vertx vertx = Vertx.vertx();
        Future<String> deployVerticle = vertx.deployVerticle(HelloWorldVerticle.class,
          deploymentOptions);


        Runtime.getRuntime().addShutdownHook(new Thread(vertx::close));
    }
}
