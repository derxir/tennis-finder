package com.derxir.domain.framework;

/**
 * Created by justin on 4/20/17.
 */
public interface Component<I,O> {

    O execute(Connector connector, I input);

}
