/**
 * 
 */
package edu.jhu.clueless.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
  private static Hallway hallBillardRoomHallway = new Hallway();
  private static Hallway loungeDinningRoomHallway = new Hallway();
  
  /*
   * Third row
   */
  private static Room library = new Room();
  private static Hallway libraryBillardRoomHallway = new Hallway();
  private static Room billardRoom = new Room();
  private static Hallway billardDinningRoomHallway = new Hallway();
  private static Room dinningRoom = new Room();
  

  /*
   * Forth row
   */
  private static Hallway libraryConservatoryHallway = new Hallway();
  private static Hallway billardRoomBallRoomHallway = new Hallway();
  private static Hallway dinningRoomKitchenHallway = new Hallway();
  
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
   
   private static Map<Integer, Player> playerMapping = new HashMap<>();
   private static Map<String, Player> playerNameMapping = new HashMap<>();
   private static Map<String, Weapon> weaponNameMapping = new HashMap<>();
   private static Map<String, Location> locationNameMapping = new HashMap<>();
   private static Map<Pair, Location> locationMapping = new HashMap<>();
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
    Room newStudy = new Room(new Pair(0, 0));
    study = newStudy;
    
    Hallway newStudyHallHallway = new Hallway(new Pair(0, 1));
    studyHallHallway = newStudyHallHallway;
    
    Room newHall = new Room(new Pair(0, 2));
    hall = newHall;
    
    Hallway newHallLoungeHallway = new Hallway(new Pair(0, 3));
    hallLoungeHallway = newHallLoungeHallway;
    
    List<Card> missScarletCardSet = new LinkedList<Card>();
    missScarletCardSet.add(kitchen);
    missScarletCardSet.add(conservatory);
    missScarletCardSet.add(mrGreen);
    missScarletCardSet.add(candlestick);
    missScarlet.setPlayerCards(missScarletCardSet);
    playerNameMapping.put(missScarlet.getPlayerName(), missScarlet);
    List<Player> playerList = new LinkedList<Player>();    
    playerList.add(missScarlet);
    hallLoungeHallway.setOccupyingPlayers(playerList);
    

    
    Room newLounge = new Room(new Pair(0, 4));
    newLounge.setOccupied(false);
    lounge = newLounge;
    

    /*
     * Second row
     */
    Hallway newStudyLibraryHallway = new Hallway(new Pair(1, 0));
    studyLibraryHallway = newStudyLibraryHallway;
    
    List<Card> profPlumCardSet = new LinkedList<Card>();
    profPlumCardSet.add(library);
    profPlumCardSet.add(missScarlet);
    profPlumCardSet.add(rope);
    profPlum.setPlayerCards(profPlumCardSet);

    playerNameMapping.put(profPlum.getPlayerName(), profPlum);
    playerList = new LinkedList<Player>(); 
    playerList.add(profPlum);
    
    studyLibraryHallway.setOccupied(true);
    studyLibraryHallway.setOccupyingPlayers(playerList);
    
    Hallway newHallBillardRoomHallway = new Hallway(new Pair(1, 2));
    newHallBillardRoomHallway.setOccupied(false);
    hallBillardRoomHallway = newHallBillardRoomHallway;
    
    Hallway newLoungeDinningRoomHallway = new Hallway(new Pair(1, 4));
    loungeDinningRoomHallway = newLoungeDinningRoomHallway;
    
    List<Card> colMustardCardSet = new LinkedList<Card>();
    colMustardCardSet.add(hall);
    colMustardCardSet.add(mrsPeacock);
    colMustardCardSet.add(leadPipe);
    colMustard.setPlayerCards(colMustardCardSet);
    playerNameMapping.put(colMustard.getPlayerName(), colMustard);

    playerList = new LinkedList<Player>(); 
    playerList.add(colMustard);
    
    loungeDinningRoomHallway.setOccupied(true);
    loungeDinningRoomHallway.setOccupyingPlayers(playerList);
    
    /*
     * Third row
     */
    Room newLibrary = new Room(new Pair(2, 0));
    newLibrary.setOccupied(false);
    library = newLibrary;
    
    Hallway newLibraryBillardRoomHallway = new Hallway(new Pair(2, 1));
    newLibraryBillardRoomHallway.setOccupied(false);
    libraryBillardRoomHallway = newLibraryBillardRoomHallway;
    
    Room newBillardRoom = new Room(new Pair(2, 2));
    newBillardRoom.setOccupied(false);
    billardRoom = newBillardRoom;
    
    Hallway newBillardDinningRoomHallway = new Hallway(new Pair(2, 3));
    newBillardDinningRoomHallway.setOccupied(false);
    billardDinningRoomHallway = newBillardDinningRoomHallway;
    
    Room newDinningRoom = new Room(new Pair(2, 4));
    newDinningRoom.setOccupied(false);
    dinningRoom = newDinningRoom;

    /*
     * Forth row
     */
    Hallway newLibraryConservatoryHallway = new Hallway(new Pair(3, 0));
    libraryConservatoryHallway = newLibraryConservatoryHallway;

    
    List<Card> mrsPeacockCardSet = new LinkedList<Card>();
    mrsPeacockCardSet.add(study);
    mrsPeacockCardSet.add(colMustard);
    mrsPeacockCardSet.add(knife);
    mrsPeacock.setPlayerCards(mrsPeacockCardSet);
    playerNameMapping.put(mrsPeacock.getPlayerName(), mrsPeacock);
    playerList = new LinkedList<Player>(); 
    playerList.add(mrsPeacock);
    
    libraryConservatoryHallway.setOccupied(true);
    libraryConservatoryHallway.setOccupyingPlayers(playerList);
    
    Hallway newBillardRoomBallRoomHallway = new Hallway(new Pair(3, 2));
    newBillardRoomBallRoomHallway.setOccupied(false);
    billardRoomBallRoomHallway = newBillardRoomBallRoomHallway;
    
    Hallway newDinningRoomKitchenHallway = new Hallway(new Pair(3, 4));
    newDinningRoomKitchenHallway.setOccupied(false);
    dinningRoomKitchenHallway = newDinningRoomKitchenHallway;
    
    
    /*
     * Fifth row
     */
    Room newConservatory = new Room(new Pair(4, 0));
    newConservatory.setOccupied(false);
    conservatory = newConservatory;
    
    Hallway newConservatoryBallRoomHallway = new Hallway(new Pair(4, 1));
    conservatoryBallRoomHallway = newConservatoryBallRoomHallway;
    
    List<Card> mrGreenCardSet = new LinkedList<Card>();
    mrGreenCardSet.add(dinningRoom);
    mrGreenCardSet.add(mrsWhite);
    mrGreenCardSet.add(wrench);
    mrGreen.setPlayerCards(mrGreenCardSet);
    playerNameMapping.put(mrGreen.getPlayerName(), mrGreen);
    playerList = new LinkedList<Player>(); 
    playerList.add(mrGreen);
    
    conservatoryBallRoomHallway.setOccupied(false);
    conservatoryBallRoomHallway.setOccupyingPlayers(playerList);
    
    Room newBallRoom = new Room(new Pair(4, 2));
    newBallRoom.setOccupied(false);
    ballRoom = newBallRoom;
    
    Hallway newBallRoomKitchenHallway = new Hallway(new Pair(4, 3));
    ballRoomKitchenHallway = newBallRoomKitchenHallway; 
    
    List<Card> mrsWhiteCardSet = new LinkedList<Card>();
    mrsWhiteCardSet.add(lounge);
    mrsWhiteCardSet.add(billardRoom);
    mrsWhiteCardSet.add(mrGreen);
    mrsWhite.setPlayerCards(mrGreenCardSet);
    playerNameMapping.put(mrsWhite.getPlayerName(), mrsWhite);
    playerList = new LinkedList<Player>(); 
    playerList.add(mrsWhite);
    
    ballRoomKitchenHallway.setOccupied(true);
    ballRoomKitchenHallway.setOccupyingPlayers(playerList);
    
    
    
    
    
    
    
    
    Room newKitchen = new Room(new Pair(4, 4));
    newKitchen.setOccupied(false);
    kitchen = newKitchen;
  
    /*
     * Map all of the locations coordinates to their Locations
     */
    locationMapping.put(kitchen.getPosition(), kitchen);
    locationMapping.put(ballRoom.getPosition(), ballRoom);
    locationMapping.put(conservatory.getPosition(), conservatory);
    locationMapping.put(study.getPosition(), study);
    locationMapping.put(hall.getPosition(), hall);
    locationMapping.put(billardRoom.getPosition(), billardRoom);
    locationMapping.put(library.getPosition(), library);
    locationMapping.put(dinningRoom.getPosition(), dinningRoom);
    locationMapping.put(lounge.getPosition(), lounge);
    //hallways
    locationMapping.put(ballRoomKitchenHallway.getPosition(), ballRoomKitchenHallway);
    locationMapping.put(billardDinningRoomHallway.getPosition(), billardDinningRoomHallway);
    locationMapping.put(billardRoomBallRoomHallway.getPosition(), billardRoomBallRoomHallway);
    locationMapping.put(conservatoryBallRoomHallway.getPosition(), conservatoryBallRoomHallway);
    locationMapping.put(dinningRoomKitchenHallway.getPosition(), dinningRoomKitchenHallway);
    locationMapping.put(hallBillardRoomHallway.getPosition(), hallBillardRoomHallway);
    locationMapping.put(hallLoungeHallway.getPosition(), hallLoungeHallway);
    locationMapping.put(libraryBillardRoomHallway.getPosition(), libraryBillardRoomHallway);
    locationMapping.put(libraryConservatoryHallway.getPosition(), libraryConservatoryHallway);
    locationMapping.put(loungeDinningRoomHallway.getPosition(), loungeDinningRoomHallway);
    locationMapping.put(studyHallHallway.getPosition(), studyHallHallway);
    locationMapping.put(studyLibraryHallway.getPosition(), studyLibraryHallway);
    
    locationNameMapping.put(kitchen.getRoomName(), kitchen);
    locationNameMapping.put(ballRoom.getRoomName(), ballRoom);
    locationNameMapping.put(conservatory.getRoomName(), conservatory);
    locationNameMapping.put(study.getRoomName(), study);
    locationNameMapping.put(hall.getRoomName(), hall);
    locationNameMapping.put(billardRoom.getRoomName(), billardRoom);
    locationNameMapping.put(library.getRoomName(), library);
    locationNameMapping.put(dinningRoom.getRoomName(), dinningRoom);
    locationNameMapping.put(lounge.getRoomName(), lounge);
    
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
    myInitResponseDTO.setColMustard(colMustard.toString());
    myInitResponseDTO.setMissScarlet(missScarlet.toString());
    myInitResponseDTO.setMrGreen(mrGreen.toString());
    myInitResponseDTO.setMrsPeacock(mrsPeacock.toString());
    myInitResponseDTO.setProfPlum(profPlum.toString());
    
    return myInitResponseDTO;
  }

  

  @Override
  public MoveResponseDTO move(MoveRequestDTO myMoveRequestDTO)
      throws IOException, JSONException
  {
    // This method assumes that @getLegalMoves() has already been called
    // If that method returns zero legal moves and the player calls this method he'll be stuck here
    int playerNumber = myMoveRequestDTO.getPlayer();
    Player player = playerMapping.get(playerNumber);
    Location currentLocation = player.getLocation();
    Pair position = currentLocation.getPosition();
    
    int requestedDirection = myMoveRequestDTO.getDirection();
    Location requestedLocation = getNextLocation(requestedDirection, position);
    
    MoveResponseDTO response = new MoveResponseDTO("Initial Response");
    
    // Determine if the move lands the player on the board
    if (requestedLocation == null)
    {
      response.setMessage("The requested direction is invalid given your position.");
      return response;
    }
    
    // Check if the requested direction is occupied
    if (requestedLocation.isOccupied())
    {
      response.setMessage("The requested location is currently occupied by another player.");
      return response;
    }
    
    // The move is valid and the location is not occupied so we may move the player
    currentLocation.removeOccupyingPlayer(player);
    player.setLocation(requestedLocation);
    requestedLocation.addOccupyingPlayer(player);
    
    response.setMessage(player.getPlayerName() + "has moved successfully.");
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
    
    requestedLocation = locationMapping.get(requestedPosition);
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
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public SuggestResponseDTO suggest(SuggestRequestDTO mySuggestRequestDTO)
      throws IOException, JSONException
  {
    ConfidentialFile suggestion = new ConfidentialFile();
    
    Player suggestedPlayer = playerNameMapping.get(mySuggestRequestDTO.getSuggestedPlayerName());
    suggestion.setMurderingPlayer(suggestedPlayer);
    
    Room suggestedRoom = (Room) locationNameMapping.get(mySuggestRequestDTO.getSuggestedRoomName());
    suggestion.setMurderLocation(suggestedRoom);
    
    Weapon suggestedWeapon = weaponNameMapping.get(mySuggestRequestDTO.getSuggestedWeaponName());
    suggestion.setMurderWeapon(suggestedWeapon);
    
    SuggestResponseDTO mySuggestResponseDTO = new SuggestResponseDTO();
    
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
  
  public LegalMovesDTO getLegalMoves(Integer player) {
	  Player p = playerMapping.get(player);
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
	  dto.setLegalMoves(legalMoveLocations);
	  return dto;
  }
}
