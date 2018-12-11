/**
 * 
 */
package edu.jhu.clueless.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.springframework.stereotype.Component;

import edu.jhu.clueless.DTO.AccuseRequestDTO;
import edu.jhu.clueless.DTO.AccuseResponseDTO;
import edu.jhu.clueless.DTO.EndTurnRequestDTO;
import edu.jhu.clueless.DTO.EndTurnResponseDTO;
import edu.jhu.clueless.DTO.InitRequestDTO;
import edu.jhu.clueless.DTO.InitResponseDTO;
import edu.jhu.clueless.DTO.LegalMovesDTO;
import edu.jhu.clueless.DTO.MoveRequestDTO;
import edu.jhu.clueless.DTO.MoveResponseDTO;
import edu.jhu.clueless.DTO.StatusResponseDTO;
import edu.jhu.clueless.DTO.SuggestRequestDTO;
import edu.jhu.clueless.DTO.SuggestResponseDTO;
import edu.jhu.clueless.domain.Card;
import edu.jhu.clueless.domain.ConfidentialFile;
import edu.jhu.clueless.domain.Hallway;
import edu.jhu.clueless.domain.Location;
import edu.jhu.clueless.domain.Pair;
import edu.jhu.clueless.domain.Player;
import edu.jhu.clueless.domain.Room;
import edu.jhu.clueless.domain.Weapon;
import edu.jhu.clueless.service.CluelessService;

/**
 * @author davidbess
 *
 */
@Component
public class CluelessServiceImpl implements CluelessService
{

	/*
	 * Initialize Weapons
	 */
	private static Weapon revolver = new Weapon("revolver");
	private static Weapon rope = new Weapon("rope");
	private static Weapon leadPipe = new Weapon("leadPipe");
	private static Weapon knife = new Weapon("knife");
	private static Weapon wrench = new Weapon("wrench");
	private static Weapon candlestick = new Weapon("candlestick");


	/*
	 * Initialize Locations
	 */

	/*
	 * Top row
	 */
	private static Room study = new Room();
	private static Hallway studyHallHallway = new Hallway();
	private static Room hall = new Room();
	private static Hallway hallLoungeHallway = new Hallway();
	private static Room lounge = new Room();


	/*
	 * Second row
	 */
	private static Hallway studyLibraryHallway = new Hallway();
	private static Hallway hallbilliardRoomHallway = new Hallway();
	private static Hallway loungediningRoomHallway = new Hallway();

	/*
	 * Third row
	 */
	private static Room library = new Room();
	private static Hallway librarybilliardRoomHallway = new Hallway();
	private static Room billiardRoom = new Room();
	private static Hallway billiarddiningRoomHallway = new Hallway();
	private static Room diningRoom = new Room();


	/*
	 * Forth row
	 */
	private static Hallway libraryConservatoryHallway = new Hallway();
	private static Hallway billiardRoomBallRoomHallway = new Hallway();
	private static Hallway diningRoomKitchenHallway = new Hallway();

	/*
	 * Fifth row
	 */
	private static Room conservatory = new Room();
	private static Hallway conservatoryBallRoomHallway = new Hallway();
	private static Room ballRoom = new Room();
	private static Hallway ballRoomKitchenHallway = new Hallway();
	private static Room kitchen = new Room();


	/*
	 * Initialize Players
	 */
	private static Player missScarlet = new Player("missScarlet", null);
	private static Player profPlum = new Player("profPlum", null);
	private static Player colMustard = new Player("colMustard", null);
	private static Player mrsPeacock = new Player("mrsPeacock", null);
	private static Player mrGreen = new Player("mrGreen", null);
	private static Player mrsWhite = new Player("mrsWhite", null);

	//   private static Map<Integer, Player> playerMapping = new HashMap<>();
	private static Map<String, Player> playerNameMapping = new HashMap<>();
	private static Map<String, Weapon> weaponNameMapping = new HashMap<>();
	private static Map<String, Location> locationNameMapping = new HashMap<>();
	//   private static Map<Pair, Location> locationMapping = new HashMap<>();
	private static Map<Integer, Player> turnOrder = new HashMap<>();
	/*
	 * Initialize Confidential File
	 */
	private static ConfidentialFile myConfidentialFile = new ConfidentialFile();



	@Override
	public InitResponseDTO initGame(InitRequestDTO myInitRequestDTO)
			throws IOException, JSONException
	{
		/*
		 * Re-Initialize Locations
		 */

		/*
		 * Top row
		 */
		study = new Room("Study", new Pair(0, 0));
		studyHallHallway = new Hallway("Study - Hall Hallway", new Pair(0, 1));
		hall = new Room("Hall", new Pair(0, 2));    
		hallLoungeHallway = new Hallway("Hall - Lounge Hallway", new Pair(0, 3));
		lounge = new Room("Lounge", new Pair(0, 4));
		// Second Row
		studyLibraryHallway = new Hallway("Study - Library Hallway", new Pair(1, 0));
		hallbilliardRoomHallway = new Hallway("Hall - Billaird Room Hallway", new Pair(1, 2));
		loungediningRoomHallway = new Hallway("Lounge - Dining Room Hallway", new Pair(1, 4));

		// Third Row
		library = new Room("Library", new Pair(2, 0));
		librarybilliardRoomHallway = new Hallway("Library - Billiard Room Hallway", new Pair(2, 1));
		billiardRoom = new Room("Billiard Room", new Pair(2, 2));
		billiarddiningRoomHallway = new Hallway("Billiard Room - Dining Room Hallway", new Pair(2, 3));
		diningRoom = new Room("Dining Room", new Pair(2, 4));

		// Fourth Row
		libraryConservatoryHallway = new Hallway("Library - Conservatory Hallway", new Pair(3, 0));
		billiardRoomBallRoomHallway = new Hallway("Billiard Room - Ball Room Hallway", new Pair(3, 2));
		diningRoomKitchenHallway = new Hallway("Dining Room - Kitchen Hallway", new Pair(3, 4));

		// Fifth Row
		ballRoom = new Room("Ball Room", new Pair(4, 2));
		ballRoomKitchenHallway = new Hallway("Ball Room - Kitchen Hallway", new Pair(4, 3));
		conservatory = new Room("Conservatory", new Pair(4, 0));
		conservatoryBallRoomHallway = new Hallway("Conservatory - Ball Room Hallway", new Pair(4, 1));   
		kitchen = new Room("Kitchen", new Pair(4, 4));

		// Add locations to weapons
		knife.setLocation(kitchen);
		rope.setLocation(hall);
		candlestick.setLocation(ballRoom);
		leadPipe.setLocation(library);
		wrench.setLocation(diningRoom);
		revolver.setLocation(study);

		/*****
		// Player initialization
		 */
		List<Card> missScarletCardSet = new LinkedList<Card>();
		missScarletCardSet.add(kitchen);
		missScarletCardSet.add(conservatory);
		missScarletCardSet.add(mrGreen);
		missScarletCardSet.add(candlestick);
		missScarlet.setPlayerCards(missScarletCardSet);
		playerNameMapping.put(missScarlet.getPlayerName(), missScarlet);
		hallLoungeHallway.addOccupyingPlayer(missScarlet);

		/*
		 * Second row
		 */
		List<Card> profPlumCardSet = new LinkedList<Card>();
		profPlumCardSet.add(library);
		profPlumCardSet.add(missScarlet);
		profPlumCardSet.add(rope);
		profPlum.setPlayerCards(profPlumCardSet);
		playerNameMapping.put(profPlum.getPlayerName(), profPlum);
		studyLibraryHallway.addOccupyingPlayer(profPlum);

		List<Card> colMustardCardSet = new LinkedList<Card>();
		colMustardCardSet.add(hall);
		colMustardCardSet.add(mrsPeacock);
		colMustardCardSet.add(leadPipe);
		colMustard.setPlayerCards(colMustardCardSet);
		playerNameMapping.put(colMustard.getPlayerName(), colMustard);
		loungediningRoomHallway.addOccupyingPlayer(colMustard);

		/*
		 * Third row
		 */


		/*
		 * Forth row
		 */
		List<Card> mrsPeacockCardSet = new LinkedList<Card>();
		mrsPeacockCardSet.add(study);
		mrsPeacockCardSet.add(colMustard);
		mrsPeacockCardSet.add(knife);
		mrsPeacock.setPlayerCards(mrsPeacockCardSet);
		playerNameMapping.put(mrsPeacock.getPlayerName(), mrsPeacock);
		libraryConservatoryHallway.addOccupyingPlayer(mrsPeacock);

		/*
		 * Fifth row
		 */
		List<Card> mrGreenCardSet = new LinkedList<Card>();
		mrGreenCardSet.add(diningRoom);
		mrGreenCardSet.add(mrsWhite);
		mrGreenCardSet.add(wrench);
		mrGreen.setPlayerCards(mrGreenCardSet);
		playerNameMapping.put(mrGreen.getPlayerName(), mrGreen);
		conservatoryBallRoomHallway.addOccupyingPlayer(mrGreen);

		List<Card> mrsWhiteCardSet = new LinkedList<Card>();
		mrsWhiteCardSet.add(lounge);
		mrsWhiteCardSet.add(billiardRoom);
		mrsWhiteCardSet.add(mrGreen);
		mrsWhite.setPlayerCards(mrGreenCardSet);
		playerNameMapping.put(mrsWhite.getPlayerName(), mrsWhite);
		ballRoomKitchenHallway.addOccupyingPlayer(mrsWhite);


		kitchen.addConnectedLocation(ballRoomKitchenHallway);
		kitchen.addConnectedLocation(diningRoomKitchenHallway);
		kitchen.addConnectedLocation(study);

		ballRoom.addConnectedLocation(ballRoomKitchenHallway);
		ballRoom.addConnectedLocation(billiardRoomBallRoomHallway);
		ballRoom.addConnectedLocation(conservatoryBallRoomHallway);

		conservatory.addConnectedLocation(conservatoryBallRoomHallway);
		conservatory.addConnectedLocation(libraryConservatoryHallway);
		conservatory.addConnectedLocation(lounge);

		library.addConnectedLocation(librarybilliardRoomHallway);
		library.addConnectedLocation(studyLibraryHallway);
		library.addConnectedLocation(libraryConservatoryHallway);

		study.addConnectedLocation(studyHallHallway);
		study.addConnectedLocation(studyLibraryHallway);

		hall.addConnectedLocation(hallbilliardRoomHallway);
		hall.addConnectedLocation(hallLoungeHallway);
		hall.addConnectedLocation(studyHallHallway);

		lounge.addConnectedLocation(loungediningRoomHallway);
		lounge.addConnectedLocation(hallLoungeHallway);

		diningRoom.addConnectedLocation(loungediningRoomHallway);
		diningRoom.addConnectedLocation(diningRoomKitchenHallway);
		diningRoom.addConnectedLocation(billiarddiningRoomHallway);

		billiardRoom.addConnectedLocation(billiardRoomBallRoomHallway);
		billiardRoom.addConnectedLocation(billiarddiningRoomHallway);
		billiardRoom.addConnectedLocation(librarybilliardRoomHallway);
		billiardRoom.addConnectedLocation(hallbilliardRoomHallway);

		// Rooms
		locationNameMapping.put(kitchen.getRoomName(), kitchen);
		locationNameMapping.put(ballRoom.getRoomName(), ballRoom);
		locationNameMapping.put(conservatory.getRoomName(), conservatory);
		locationNameMapping.put(study.getRoomName(), study);
		locationNameMapping.put(hall.getRoomName(), hall);
		locationNameMapping.put(billiardRoom.getRoomName(), billiardRoom);
		locationNameMapping.put(library.getRoomName(), library);
		locationNameMapping.put(diningRoom.getRoomName(), diningRoom);
		locationNameMapping.put(lounge.getRoomName(), lounge);
		// Hallways
		// Billiard Room
		locationNameMapping.put(billiarddiningRoomHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(billiardRoomBallRoomHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(hallbilliardRoomHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(librarybilliardRoomHallway.getName(), loungediningRoomHallway);
		// Lounge
		locationNameMapping.put(loungediningRoomHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(hallLoungeHallway.getName(), hallLoungeHallway);
		// Study
		locationNameMapping.put(studyHallHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(studyLibraryHallway.getName(), loungediningRoomHallway);
		// conservatory
		locationNameMapping.put(conservatoryBallRoomHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(libraryConservatoryHallway.getName(), loungediningRoomHallway);
		// kitchen
		locationNameMapping.put(diningRoomKitchenHallway.getName(), loungediningRoomHallway);
		locationNameMapping.put(ballRoomKitchenHallway.getName(), loungediningRoomHallway);


		weaponNameMapping.put(revolver.getWeaponName(), revolver);
		weaponNameMapping.put(candlestick.getWeaponName(), candlestick);
		weaponNameMapping.put(rope.getWeaponName(), rope);
		weaponNameMapping.put(knife.getWeaponName(), knife);
		weaponNameMapping.put(leadPipe.getWeaponName(), leadPipe);
		weaponNameMapping.put(wrench.getWeaponName(), wrench);

		ConfidentialFile newConfidentialFile = createNewConfidentialFile();
		myConfidentialFile = newConfidentialFile;

		InitResponseDTO myInitResponseDTO = new InitResponseDTO();

		myInitResponseDTO.setStatusMessage("Successful");
		myInitResponseDTO.setColMustard(colMustard);
		myInitResponseDTO.setMissScarlet(missScarlet);
		myInitResponseDTO.setMrGreen(mrGreen);
		myInitResponseDTO.setMrsPeacock(mrsPeacock);
		myInitResponseDTO.setProfPlum(profPlum);
		myInitResponseDTO.setMrsWhite(mrsWhite);

		turnOrder.put(1, missScarlet);
		turnOrder.put(2, colMustard);
		turnOrder.put(3, mrGreen);
		turnOrder.put(4, mrsPeacock);
		turnOrder.put(5, profPlum);
		turnOrder.put(6, mrsWhite);

		return myInitResponseDTO;
	}



	@Override
	public MoveResponseDTO move(MoveRequestDTO myMoveRequestDTO)
			throws IOException, JSONException
	{
		// This method assumes that @getLegalMoves() has already been called
		// If that method returns zero legal moves and the player calls this method he'll be stuck here
		int playerNumber = myMoveRequestDTO.getPlayer();
		Player player = turnOrder.get(playerNumber);
		Location currentLocation = player.getLocation();
		Pair position = currentLocation.getPosition();

		int requestedDirection = myMoveRequestDTO.getDirection();
		Location requestedLocation = locationNameMapping.get(myMoveRequestDTO.getRoom());
		//getNextLocation(requestedDirection, position);

		MoveResponseDTO response = new MoveResponseDTO("Initial Response");

		//		// Determine if the move lands the player on the board
		//		if (requestedLocation == null)
		//		{
		//			response.setMessage("The requested direction is invalid given your position.");
		//			return response;
		//		}

		//		// Check if the requested direction is occupied
		//		if (requestedLocation.isOccupied())
		//		{
		//			response.setMessage("The requested location is currently occupied by another player.");
		//			return response;
		//		}

		// The move is valid and the location is not occupied so we may move the player
		currentLocation.removeOccupyingPlayer(player);
		player.setLocation(requestedLocation);
		requestedLocation.addOccupyingPlayer(player);

		response.setMessage(player.getPlayerName() + " has moved successfully to the " + requestedLocation.getName() + ".");
		response.setResult(true);
		return response;
	}


	// Determines whether the requested direction given the current player location will land the player in a valid location on the board
	// If it is a valid location, it will return that location, otherwise it will return null
	private Location getNextLocation(int requestedDirection, Pair currentPosition)
	{
		Location requestedLocation = null;
		Pair requestedPosition = null;

		switch (requestedDirection)
		{
		case 0: // LEFT
			requestedPosition = new Pair(currentPosition.getRow(), currentPosition.getColumn() - 1);
			break;

		case 1: // RIGHT
			requestedPosition = new Pair(currentPosition.getRow(), currentPosition.getColumn() + 1);
			break;

		case 2: // UP
			requestedPosition = new Pair(currentPosition.getRow() + 1, currentPosition.getColumn());
			break;

		case 3: // DOWN
			requestedPosition = new Pair(currentPosition.getRow() - 1, currentPosition.getColumn());
			break;

		case 4: // DIAGONAL
			if (currentPosition.getRow() == 0 && currentPosition.getColumn() == 0)
			{
				requestedPosition = new Pair(4, 4);
			}
			else if (currentPosition.getRow() == 0 && currentPosition.getColumn() == 4)
			{
				requestedPosition = new Pair(4, 0);
			}
			else if (currentPosition.getRow() == 4 && currentPosition.getColumn() == 0)
			{
				requestedPosition = new Pair(0, 4);
			}
			else if (currentPosition.getRow() == 4 && currentPosition.getColumn() == 4)
			{
				requestedPosition = new Pair(0, 0);
			}
			else
			{
				requestedPosition = new Pair(-1, -1);
			}
			break;

		default: // INVALID DIRECTION
			requestedPosition = new Pair(-1, -1);
			break;
		}

		//    requestedLocation = locationMapping.get(requestedPosition);
		return requestedLocation;
	}

	@Override
	public EndTurnResponseDTO endTurn(EndTurnRequestDTO myEndTurnRequestDTO)
			throws IOException, JSONException
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccuseResponseDTO accuse(AccuseRequestDTO myAccuseRequestDTO)
			throws IOException, JSONException
	{
		AccuseResponseDTO outgoingDTO = new AccuseResponseDTO();
		SuggestResponseDTO resp = suggest(myAccuseRequestDTO);
		if (resp.isCorrect()) {
			outgoingDTO.setCorrect(resp.isCorrect());
			outgoingDTO.setMessage("YOU WIN");
		}
		else {
			outgoingDTO.setCorrect(false);
			outgoingDTO.setMessage("You failed to find the murderer");
		}
		return outgoingDTO;
	}

	@Override
	public SuggestResponseDTO suggest(AccuseRequestDTO mySuggestRequestDTO)
			throws IOException, JSONException
	{
		SuggestResponseDTO mySuggestResponseDTO = new SuggestResponseDTO();
		ConfidentialFile suggestion = new ConfidentialFile();

		Player currentPlayer = turnOrder.get(mySuggestRequestDTO.getAccusingPlayer());
		Player suggestedPlayer = turnOrder.get(mySuggestRequestDTO.getAccusedPlayer());
		suggestion.setMurderingPlayer(suggestedPlayer);

		if (!(currentPlayer.getLocation() instanceof Room)) {
			mySuggestResponseDTO.setResult("Cannot make a suggestion from a non-Room.");
		}

		else {
			Room suggestedRoom = (Room) currentPlayer.getLocation();
			suggestedRoom.addOccupyingPlayer(suggestedPlayer);
			suggestion.setMurderLocation(suggestedRoom);

			Weapon suggestedWeapon = weaponNameMapping.get(mySuggestRequestDTO.getMurderWeapon());
			suggestion.setMurderWeapon(suggestedWeapon);

			if(suggestion.getMurderingPlayer().getPlayerName() == myConfidentialFile.getMurderingPlayer().getPlayerName() &&
					suggestion.getMurderLocation().getRoomName() == myConfidentialFile.getMurderLocation().getRoomName() && 
					suggestion.getMurderWeapon().getWeaponName() == myConfidentialFile.getMurderWeapon().getWeaponName())
			{
				mySuggestResponseDTO.setResult("true");
				mySuggestResponseDTO.setCardRevealMessage("No cards revealed");
			}
			else
			{
				mySuggestResponseDTO.setResult("false");
			}
		}
		return mySuggestResponseDTO;
	}


	private ConfidentialFile createNewConfidentialFile()
	{
		ConfidentialFile myConfidentialFile = new ConfidentialFile();

		myConfidentialFile.setMurderingPlayer(colMustard);
		myConfidentialFile.setMurderLocation(ballRoom);
		myConfidentialFile.setMurderWeapon(new Weapon("revolver"));

		return myConfidentialFile;
	}

	// clueless/moves 
	public LegalMovesDTO getLegalMoves(Integer player) {
		Player p = turnOrder.get(player);
		Location l = p.getLocation();
		LegalMovesDTO dto = new LegalMovesDTO();
		List<Location> legalMoveLocations = new LinkedList<>();
		for (Location possibleMove : l.getConnectedLocations()) {
			if (possibleMove instanceof Hallway) {
				if (!possibleMove.isOccupied()) {
					legalMoveLocations.add(possibleMove);
				}
			}
			else {
				legalMoveLocations.add(possibleMove);
			}
		}
		// Sort move locations for consistency
		legalMoveLocations.sort( (a, b) -> {
			return a.getName().compareTo(b.getName());
		});
		dto.setLegalMoves(legalMoveLocations);
		return dto;
	}

	public StatusResponseDTO status(Integer currentPlayer) {
		List<Player> players = new LinkedList<>();
		players.addAll(playerNameMapping.values());

		List<Card> weapons = new LinkedList<>();
		weapons.addAll(weaponNameMapping.values());

		StatusResponseDTO dto = new StatusResponseDTO();
		dto.setCurrentPlayer(turnOrder.get(currentPlayer));
		dto.setPlayers(players);
		dto.setWeapons(weapons);
		return dto;


	}
}
