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
   
   private static Map<Integer, Player> playerMapping;
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
    
    Set<Card> missScarletCardSet = new HashSet<Card>();
    missScarletCardSet.add(kitchen);
    missScarletCardSet.add(conservatory);
    missScarletCardSet.add(mrGreen);
    missScarletCardSet.add(candlestick);
    missScarlet.setPlayerCards(missScarletCardSet);

    Set<Player> playerSet = new HashSet<Player>();    
    playerSet.add(missScarlet);
    hallLoungeHallway.setOccupyingPlayers(playerSet);
    

    
    Room newLounge = new Room(new Pair(0, 4));
    lounge = newLounge;
    

    /*
     * Second row
     */
    Hallway newStudyLibraryHallway = new Hallway(new Pair(1, 0));
    studyLibraryHallway = newStudyLibraryHallway;
    
    Set<Card> profPlumCardSet = new HashSet<Card>();
    profPlumCardSet.add(library);
    profPlumCardSet.add(missScarlet);
    profPlumCardSet.add(rope);
    profPlum.setPlayerCards(profPlumCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(profPlum);
    studyLibraryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newHallBillardRoomHallway = new Hallway(new Pair(1, 2));
    hallBillardRoomHallway = newHallBillardRoomHallway;
    
    Hallway newLoungeDinningRoomHallway = new Hallway(new Pair(1, 4));
    loungeDinningRoomHallway = newLoungeDinningRoomHallway;
    
    Set<Card> colMustardCardSet = new HashSet<Card>();
    colMustardCardSet.add(hall);
    colMustardCardSet.add(mrsPeacock);
    colMustardCardSet.add(leadPipe);
    colMustard.setPlayerCards(colMustardCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(colMustard);
    loungeDinningRoomHallway.setOccupyingPlayers(playerSet);
    
    /*
     * Third row
     */
    Room newLibrary = new Room(new Pair(2, 0));
    library = newLibrary;
    
    Hallway newLibraryBillardRoomHallway = new Hallway(new Pair(2, 1));
    libraryBillardRoomHallway = newLibraryBillardRoomHallway;
    
    Room newBillardRoom = new Room(new Pair(2, 2));
    billardRoom = newBillardRoom;
    
    Hallway newBillardDinningRoomHallway = new Hallway(new Pair(2, 3));
    billardDinningRoomHallway = newBillardDinningRoomHallway;
    
    Room newDinningRoom = new Room(new Pair(2, 4));
    dinningRoom = newDinningRoom;

    /*
     * Forth row
     */
    Hallway newLibraryConservatoryHallway = new Hallway(new Pair(3, 0));
    libraryConservatoryHallway = newLibraryConservatoryHallway;

    
    Set<Card> mrsPeacockCardSet = new HashSet<Card>();
    mrsPeacockCardSet.add(study);
    mrsPeacockCardSet.add(colMustard);
    mrsPeacockCardSet.add(knife);
    mrsPeacock.setPlayerCards(mrsPeacockCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrsPeacock);
    libraryConservatoryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newBillardRoomBallRoomHallway = new Hallway(new Pair(3, 2));
    billardRoomBallRoomHallway = newBillardRoomBallRoomHallway;
    
    Hallway newDinningRoomKitchenHallway = new Hallway(new Pair(3, 4));
    dinningRoomKitchenHallway = newDinningRoomKitchenHallway;
    
    
    /*
     * Fifth row
     */
    Room newConservatory = new Room(new Pair(4, 0));
    conservatory = newConservatory;
    
    Hallway newConservatoryBallRoomHallway = new Hallway(new Pair(4, 1));
    conservatoryBallRoomHallway = newConservatoryBallRoomHallway;
    
    Set<Card> mrGreenCardSet = new HashSet<Card>();
    mrGreenCardSet.add(dinningRoom);
    mrGreenCardSet.add(mrsWhite);
    mrGreenCardSet.add(wrench);
    mrGreen.setPlayerCards(mrGreenCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrGreen);
    conservatoryBallRoomHallway.setOccupyingPlayers(playerSet);
    
    Room newBallRoom = new Room(new Pair(4, 2));
    ballRoom = newBallRoom;
    
    Hallway newBallRoomKitchenHallway = new Hallway(new Pair(4, 3));
    ballRoomKitchenHallway = newBallRoomKitchenHallway; 
    
    Set<Card> mrsWhiteCardSet = new HashSet<Card>();
    mrsWhiteCardSet.add(lounge);
    mrsWhiteCardSet.add(billardRoom);
    mrsWhiteCardSet.add(mrGreen);
    mrsWhite.setPlayerCards(mrGreenCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrsWhite);
    ballRoomKitchenHallway.setOccupyingPlayers(playerSet);
    
    
    
    
    
    
    
    
    Room newKitchen = new Room(new Pair(4, 4));
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
    // TODO Auto-generated method stub
    return null;
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
    // TODO Auto-generated method stub
    return null;
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
	  for (Location possibleMove : l.getConnectedLocation()) {
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
