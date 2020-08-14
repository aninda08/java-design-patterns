package com.aninda.practice.structural.composite;

public interface INeuron extends Iterable<Neuron> {
	public default void connectTo(INeuron other) {
		if (this == other) return;

	    for (Neuron from : this)
	      for (Neuron to : other)
	      {
	        from.out.add(to);
	        to.in.add(from);
	      }
	}
}
