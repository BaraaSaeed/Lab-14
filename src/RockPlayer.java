/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class RockPlayer extends Player {

	public RockPlayer(String name) {
		super(name);
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.ROCK;
	}

}
