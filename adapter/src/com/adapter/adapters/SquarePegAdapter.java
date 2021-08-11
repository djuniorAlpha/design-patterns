package com.adapter.adapters;

import com.adapter.round.RoundPeg;
import com.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
	public SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
		this.peg = peg;
	}
	
	@Override
	public double getRadius() {
		double result;
		result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
		return result;
	}
}
