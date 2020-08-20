package com.aninda.practice.structural.proxy;

public class Property<T> {
	private T value;

	public Property(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		//apply operation on this property proxy
		this.value = value;
	}

	@Override
	public int hashCode() {
		return value != null ? value.hashCode() : 0;
	}

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    Property<?> property = (Property<?>) o;

	    return value != null ? value.equals(property.value) : property.value == null;
	}
	
}
