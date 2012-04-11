package com.chriscarr.bang;

import java.util.List;

public interface UserInterface {

	int askDiscard(Player player);

	int askPlay(Player player);

	int askPlayer(Player player, List<Player> otherPlayers);

	boolean respondBang(Player player, int bangs);

	boolean respondMiss(Player miss, int misses, int missesRequired);

	int chooseGeneralStoreCard(Player player,
			List<Object> cards);

	int askOthersCard(Player player, InPlay inPlay);

	boolean respondBeer(Player player, int beers);

	boolean chooseDiscard(Player player);

	int respondBangMiss(Player otherPlayer, int bangs, int misses, int missesRequired);

	List<Object> chooseTwoDiscardForLife(Player sidKetchum);

}
