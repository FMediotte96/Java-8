package org.formacion;

import java.util.Collection;

public interface Agrupador {

	void add (Object elemento);
	
	int numeroElementos();
	
	default void addAll(Collection<Object> collection) {
		collection.forEach(item -> add(item));
	}
	
}
