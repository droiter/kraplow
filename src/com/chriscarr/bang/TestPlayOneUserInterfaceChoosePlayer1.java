package com.chriscarr.bang;

import java.util.List;

public class TestPlayOneUserInterfaceChoosePlayer1 implements UserInterface {

	public int askDiscard(Player player) {
		return 0;
	}

	public int askPlay() {
		return 0;
	}
	
	public int choosePlayer(List<Player> players){
		return 0;
	}

	public boolean respondBang(Player indianPlayer, int bangs) {
		return false;
	}

	public boolean respondMiss(Player gatlingPlayer, int misses) {
		return false;
	}

	@Override
	public int chooseGeneralStoreCard(Player generalPlayer,
			List<Object> generalStoreCards) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int askPlayer(Player player, List<Player> otherPlayers) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int askOthersCard(Player player, InPlay inPlay) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean respondBeer(Player player, int beers) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Object> chooseTwoDiscardForLife(Player sidKetchum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int respondBangMiss(Player otherPlayer, int bangs, int misses,
			int missesRequired) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean respondMiss(Player miss, int misses, int missesRequired) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int askPlay(Player player) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean chooseDiscard(Player player) {
		// TODO Auto-generated method stub
		return false;
	}

}
