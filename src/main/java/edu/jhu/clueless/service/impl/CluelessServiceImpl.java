/**
 * 
 */
package edu.jhu.clueless.service.impl;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONException;

import edu.jhu.clueless.DTO.AccuseRequestDTO;
import edu.jhu.clueless.DTO.AccuseResponseDTO;
import edu.jhu.clueless.DTO.EndTurnRequestDTO;
import edu.jhu.clueless.DTO.EndTurnResponseDTO;
import edu.jhu.clueless.DTO.InitRequestDTO;
import edu.jhu.clueless.DTO.InitResponseDTO;
import edu.jhu.clueless.DTO.MoveRequestDTO;
import edu.jhu.clueless.DTO.MoveResponseDTO;
import edu.jhu.clueless.DTO.SuggestRequestDTO;
import edu.jhu.clueless.DTO.SuggestResponseDTO;
import edu.jhu.clueless.domain.Card;
import edu.jhu.clueless.domain.ConfidentialFile;
import edu.jhu.clueless.domain.Hallway;
import edu.jhu.clueless.domain.Player;
import edu.jhu.clueless.domain.Room;
import edu.jhu.clueless.domain.Weapon;
import edu.jhu.clueless.service.CluelessService;

/**
 * @author davidbess
 *
 */
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
   private static Player missScarlet = new Player("missScarlet");
   private static Player profPlum = new Player("profPlum");
   private static Player colMustard = new Player("colMustard");
   private static Player mrsPeacock = new Player("mrsPeacock");
   private static Player mrGreen = new Player("mrGreen");
   private static Player mrsWhite = new Player("mrsWhite");
   
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
    Room newStudy = new Room(new int[0][0]);
    newStudy.setOccupied(false);
    study = newStudy;
    
    Hallway newStudyHallHallway = new Hallway(new int[0][1]);
    newStudyHallHallway.setOccupied(false);
    studyHallHallway = newStudyHallHallway;
    
    Room newHall = new Room(new int[0][2]);
    newHall.setOccupied(false);
    hall = newHall;
    
    Hallway newHallLoungeHallway = new Hallway(new int[0][3]);
    hallLoungeHallway = newHallLoungeHallway;
    
    Set<Card> missScarletCardSet = new HashSet<Card>();
    missScarletCardSet.add(kitchen);
    missScarletCardSet.add(conservatory);
    missScarletCardSet.add(mrGreen);
    missScarletCardSet.add(candlestick);
    missScarlet.setPlayerCards(missScarletCardSet);

    Set<Player> playerSet = new HashSet<Player>();    
    playerSet.add(missScarlet);
    
    hallLoungeHallway.setOccupied(true);
    hallLoungeHallway.setOccupyingPlayers(playerSet);
    
    
    Room newLounge = new Room(new int[0][4]);
    newLounge.setOccupied(false);
    lounge = newLounge;
    

    /*
     * Second row
     */
    Hallway newStudyLibraryHallway = new Hallway(new int[1][0]);
    studyLibraryHallway = newStudyLibraryHallway;
    
    Set<Card> profPlumCardSet = new HashSet<Card>();
    profPlumCardSet.add(library);
    profPlumCardSet.add(missScarlet);
    profPlumCardSet.add(rope);
    profPlum.setPlayerCards(profPlumCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(profPlum);
    
    studyLibraryHallway.setOccupied(true);
    studyLibraryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newHallBillardRoomHallway = new Hallway(new int[1][2]);
    newHallBillardRoomHallway.setOccupied(false);
    hallBillardRoomHallway = newHallBillardRoomHallway;
    
    Hallway newLoungeDinningRoomHallway = new Hallway(new int[1][4]);
    loungeDinningRoomHallway = newLoungeDinningRoomHallway;
    
    Set<Card> colMustardCardSet = new HashSet<Card>();
    colMustardCardSet.add(hall);
    colMustardCardSet.add(mrsPeacock);
    colMustardCardSet.add(leadPipe);
    colMustard.setPlayerCards(colMustardCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(colMustard);
    
    loungeDinningRoomHallway.setOccupied(true);
    loungeDinningRoomHallway.setOccupyingPlayers(playerSet);
    
    /*
     * Third row
     */
    Room newLibrary = new Room(new int[2][0]);
    newLibrary.setOccupied(false);
    library = newLibrary;
    
    Hallway newLibraryBillardRoomHallway = new Hallway(new int[2][1]);
    newLibraryBillardRoomHallway.setOccupied(false);
    libraryBillardRoomHallway = newLibraryBillardRoomHallway;
    
    Room newBillardRoom = new Room(new int[2][2]);
    newBillardRoom.setOccupied(false);
    billardRoom = newBillardRoom;
    
    Hallway newBillardDinningRoomHallway = new Hallway(new int[2][3]);
    newBillardDinningRoomHallway.setOccupied(false);
    billardDinningRoomHallway = newBillardDinningRoomHallway;
    
    Room newDinningRoom = new Room(new int[2][4]);
    newDinningRoom.setOccupied(false);
    dinningRoom = newDinningRoom;

    /*
     * Forth row
     */
    Hallway newLibraryConservatoryHallway = new Hallway(new int[3][0]);
    libraryConservatoryHallway = newLibraryConservatoryHallway;

    
    Set<Card> mrsPeacockCardSet = new HashSet<Card>();
    mrsPeacockCardSet.add(study);
    mrsPeacockCardSet.add(colMustard);
    mrsPeacockCardSet.add(knife);
    mrsPeacock.setPlayerCards(mrsPeacockCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrsPeacock);
    
    libraryConservatoryHallway.setOccupied(true);
    libraryConservatoryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newBillardRoomBallRoomHallway = new Hallway(new int[3][2]);
    newBillardRoomBallRoomHallway.setOccupied(false);
    billardRoomBallRoomHallway = newBillardRoomBallRoomHallway;
    
    Hallway newDinningRoomKitchenHallway = new Hallway(new int[3][4]);
    newDinningRoomKitchenHallway.setOccupied(false);
    dinningRoomKitchenHallway = newDinningRoomKitchenHallway;
    
    
    /*
     * Fifth row
     */
    Room newConservatory = new Room(new int[4][0]);
    newConservatory.setOccupied(false);
    conservatory = newConservatory;
    
    Hallway newConservatoryBallRoomHallway = new Hallway(new int[4][1]);
    conservatoryBallRoomHallway = newConservatoryBallRoomHallway;
    
    Set<Card> mrGreenCardSet = new HashSet<Card>();
    mrGreenCardSet.add(dinningRoom);
    mrGreenCardSet.add(mrsWhite);
    mrGreenCardSet.add(wrench);
    mrGreen.setPlayerCards(mrGreenCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrGreen);
    
    conservatoryBallRoomHallway.setOccupied(false);
    conservatoryBallRoomHallway.setOccupyingPlayers(playerSet);
    
    Room newBallRoom = new Room(new int[4][2]);
    newBallRoom.setOccupied(false);
    ballRoom = newBallRoom;
    
    Hallway newBallRoomKitchenHallway = new Hallway(new int[4][3]);
    ballRoomKitchenHallway = newBallRoomKitchenHallway; 
    
    Set<Card> mrsWhiteCardSet = new HashSet<Card>();
    mrsWhiteCardSet.add(lounge);
    mrsWhiteCardSet.add(billardRoom);
    mrsWhiteCardSet.add(mrGreen);
    mrsWhite.setPlayerCards(mrGreenCardSet);

    playerSet = new HashSet<Player>(); 
    playerSet.add(mrsWhite);
    
    ballRoomKitchenHallway.setOccupied(true);
    ballRoomKitchenHallway.setOccupyingPlayers(playerSet);
    
    Room newKitchen = new Room(new int[4][4]);
    newKitchen.setOccupied(false);
    kitchen = newKitchen;
  
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
  
  
}
