package com.vw.ide.shared.servlet.projectmanager.specific;

import java.io.Serializable;

/**
 * Interperter's description
 * @author Oleg
 *
 */
@SuppressWarnings("serial")
public class InterpreterDescription implements Serializable {
	public static final int SEQUENTIAL_INTERPRETER_ID = 0x0;
	public static final int REACTIVE_INTERPRETER_ID   = 0x1;
	public static final int PARALLEL_INTERPRETER_ID   = 0x2;
	public static final String SEQUENTIAL = "sequential";
	public static final String REACTIVE = "reactive";
	public static final String PARALLEL = "parallel";

	private int nodesPerRing = DEF_NODES_PER_RING;
	private String name = REACTIVE;
	@SuppressWarnings("unused")
	private String key = null;
	
	public static final int DEF_NODES_PER_RING = 50;

	public InterpreterDescription() {
		
	}
	
	public InterpreterDescription(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKey() {
		return name;
	}

	public void setKey(String key) {
	}
	
	@Override
	public String toString() {
		return name;
	}

	public String readable() {
		return "InterpreterDescription [name=" + name + "]";
	}
	
	public int getNodesPerRing() {
		return nodesPerRing;
	}

	public void setNodesPerRing(int nodesPerRing) {
		this.nodesPerRing = nodesPerRing;
	}
}