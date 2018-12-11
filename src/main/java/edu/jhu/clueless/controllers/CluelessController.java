/**
 * 
 */
package edu.jhu.clueless.controllers;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
import edu.jhu.clueless.service.CluelessService;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping("/api")
public class CluelessController 
{
    private final CluelessService myCluelessService;

    public CluelessController(CluelessService myCluelessService)
    {
      this.myCluelessService = myCluelessService;
    }



    /**
     * 
     * @param myInitRequestDTO
     * @return
     * @throws IOException
     * @throws JSONException
     */
    @RequestMapping(method = {RequestMethod.GET}, path = {"/init"})
//    ResponseEntity<InitResponseDTO> initGame(@RequestBody InitRequestDTO myInitRequestDTO) throws IOException, JSONException
    public String initGame() throws JSONException, IOException
    {
      InitResponseDTO result = myCluelessService.initGame(new InitRequestDTO("TEST"));
      System.err.println(result.toString());
      return ResponseEntity.ok().body(result).toString();
    }
    
    @RequestMapping(method = {RequestMethod.GET}, path = {"/moves"})
    ResponseEntity<LegalMovesDTO> getLegalMovesForPlayer(@RequestParam int player) {
    	return ResponseEntity.ok(myCluelessService.getLegalMoves(player));
    }
  
    @PostMapping("/init")
    ResponseEntity<InitResponseDTO> initGame(InitRequestDTO myInitRequestDTO) throws IOException, JSONException 
    {
        InitResponseDTO result = myCluelessService.initGame(myInitRequestDTO);
        return ResponseEntity.ok().body(result);
    }
    
    @PostMapping("/move")
    ResponseEntity<MoveResponseDTO> move(MoveRequestDTO myMoveRequestDTO) throws IOException, JSONException 
    {
      MoveResponseDTO result = myCluelessService.move(myMoveRequestDTO);
      return ResponseEntity.ok().body(result);
    }
    
    @PostMapping("/endturn")
    ResponseEntity<EndTurnResponseDTO> move(EndTurnRequestDTO myEndTurnRequestDTO) throws IOException, JSONException 
    {
      EndTurnResponseDTO result = myCluelessService.endTurn(myEndTurnRequestDTO);
      return ResponseEntity.ok().body(result);
    }
    
    @PostMapping("/accuse")
    ResponseEntity<AccuseResponseDTO> move(AccuseRequestDTO myAccuseRequestDTO) throws IOException, JSONException 
    {
      AccuseResponseDTO result = myCluelessService.accuse(myAccuseRequestDTO);
      return ResponseEntity.ok().body(result);
    }
    
    @PostMapping("/suggest")
    ResponseEntity<SuggestResponseDTO> move(SuggestRequestDTO mySuggestRequestDTO) throws IOException, JSONException 
    {
      SuggestResponseDTO result = myCluelessService.suggest(mySuggestRequestDTO);
      return ResponseEntity.ok().body(result);
    }    
    

}