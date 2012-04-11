package com.chriscarr.bang;

public class Player {

	public static final int SHERIFF = 0;
	public static final int OUTLAW = 1;
	public static final int DEPUTY = 2;
	public static final int RENEGADE = 3;
	
	private Figure figure;
	private Hand hand;
	private InPlay inPlay;
	private int role;
	private int maxHealth;
	private int health;	

	public void setInPlay(InPlay inPlay) {
		this.inPlay = inPlay;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public void setFigure(Figure figure) {
		this.figure = figure;
	}

	public Figure getFigure() {
		return figure;
	}

	public int getRole() {
		return role;
	}

	public Hand getHand() {
		return hand;
	}

	public InPlay getInPlay() {
		return inPlay;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		this.health = maxHealth;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getHealth(){
		return health;
	}

}
