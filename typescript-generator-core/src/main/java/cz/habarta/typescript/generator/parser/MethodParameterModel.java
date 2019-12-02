
package cz.habarta.typescript.generator.parser;

import java.lang.reflect.Type;


public class MethodParameterModel {

    private final String name;
    private final Type type;
    private final boolean optional;

    public MethodParameterModel(String name, Type type, boolean optional) {
        this.name = name;
        this.type = type;
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isOptional() {
        return optional;
    }
}
