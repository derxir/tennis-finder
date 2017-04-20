package com.derxir.domain.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by justin on 4/20/17.
 */
public class Connector {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Connector.class);

    private String name;
    private List<Component> components;
    private Map<Component, Object> inputMap;
    private Map<Component, Object> outputMap;


    public Connector(String name, List<Component> components) {
        this.name = name;
        this.components = components;
    }

    public Connector(String name) {
        this(name, Collections.emptyList());
    }

    public Object execute(Object input) {
        final long t1 = System.currentTimeMillis();
        Object data = input;
        for (Component component : components) {
            inputMap.put(component, data);
            data = component.execute(this, data);
            outputMap.put(component, data);

        }
        final long t2 = System.currentTimeMillis();
        LOG.info("Connector completed in :" + (t2 - t1) + "mills");
        return data;
    }

    public String getName() {
        return name;
    }


    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }
}
