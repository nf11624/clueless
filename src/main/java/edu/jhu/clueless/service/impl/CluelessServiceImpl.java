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
    study = newStudy;
    
    Hallway newStudyHallHallway = new Hallway(new int[0][1]);
    studyHallHallway = newStudyHallHallway;
    
    Room newHall = new Room(new int[0][2]);
    hall = newHall;
    
    Hallway newHallLoungeHallway = new Hallway(new int[0][3]);
    hallLoungeHallway = newHallLoungeHallway;
    Set<Player> playerSet = new HashSet<Player>();
    playerSet.add(missScarlet);
    hallLoungeHallway.setOccupyingPlayers(playerSet);
    

    
    Room newLounge = new Room(new int[0][4]);
    lounge = newLounge;
    

    /*
     * Second row
     */
    Hallway newStudyLibraryHallway = new Hallway(new int[1][0]);
    studyLibraryHallway = newStudyLibraryHallway;
    playerSet = new HashSet<Player>();
    playerSet.add(profPlum);
    studyLibraryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newHallBillardRoomHallway = new Hallway(new int[1][2]);
    hallBillardRoomHallway = newHallBillardRoomHallway;
    
    Hallway newLoungeDinningRoomHallway = new Hallway(new int[1][4]);
    loungeDinningRoomHallway = newLoungeDinningRoomHallway;
    playerSet = new HashSet<Player>();
    playerSet.add(colMustard);
    loungeDinningRoomHallway.setOccupyingPlayers(playerSet);
    
    /*
     * Third row
     */
    Room newLibrary = new Room(new int[2][0]);
    library = newLibrary;
    
    Hallway newLibraryBillardRoomHallway = new Hallway(new int[2][1]);
    libraryBillardRoomHallway = newLibraryBillardRoomHallway;
    
    Room newBillardRoom = new Room(new int[2][2]);
    billardRoom = newBillardRoom;
    
    Hallway newBillardDinningRoomHallway = new Hallway(new int[2][3]);
    billardDinningRoomHallway = newBillardDinningRoomHallway;
    
    Room newDinningRoom = new Room(new int[2][4]);
    dinningRoom = newDinningRoom;

    /*
     * Forth row
     */
    Hallway newLibraryConservatoryHallway = new Hallway(new int[3][0]);
    libraryConservatoryHallway = newLibraryConservatoryHallway;
    playerSet = new HashSet<Player>();
    playerSet.add(mrsPeacock);
    libraryConservatoryHallway.setOccupyingPlayers(playerSet);
    
    Hallway newBillardRoomBallRoomHallway = new Hallway(new int[3][2]);
    billardRoomBallRoomHallway = newBillardRoomBallRoomHallway;
    
    Hallway newDinningRoomKitchenHallway = new Hallway(new int[3][4]);
    dinningRoomKitchenHallway = newDinningRoomKitchenHallway;
    
    
    /*
     * Fifth row
     */
    Room newConservatory = new Room(new int[4][0]);
    conservatory = newConservatory;
    
    Hallway newConservatoryBallRoomHallway = new Hallway(new int[4][1]);
    conservatoryBallRoomHallway = newConservatoryBallRoomHallway;
    playerSet = new HashSet<Player>();
    playerSet.add(mrGreen);
    conservatoryBallRoomHallway.setOccupyingPlayers(playerSet);
    
    Room newBallRoom = new Room(new int[4][2]);
    ballRoom = newBallRoom;
    
    Hallway newBallRoomKitchenHallway = new Hallway(new int[4][3]);
    ballRoomKitchenHallway = newBallRoomKitchenHallway; 
    playerSet = new HashSet<Player>();
    playerSet.add(mrsWhite);
    ballRoomKitchenHallway.setOccupyingPlayers(playerSet);
    
    Room newKitchen = new Room(new int[4][4]);
    kitchen = newKitchen;
  
    ConfidentialFile newConfidentialFile = createNewConfidentialFile();
    myConfidentialFile = newConfidentialFile;

    InitResponseDTO myInitResponseDTO = new InitResponseDTO();
    
    myInitResponseDTO.setMessage("Successful");
    
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
    myConfidentialFile.setMurderWeapon(new Weapon("Revolver"));
    
    return myConfidentialFile;
  }
  
}
