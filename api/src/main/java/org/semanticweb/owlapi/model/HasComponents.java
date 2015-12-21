package org.semanticweb.owlapi.model;

import java.util.stream.Stream;

/**
 * An interface for objects that have a set of components - this is useful for
 * all those situations where a generic action has to be performed on all
 * components of an object, such as hashcode and equals computations, or
 * rendering in a syntax.
 */
public interface HasComponents {

    /** @return components as a stream */
    Stream<?> components();
}
