package edu.jhu.clueless.service;

import java.io.IOException;
import org.json.JSONException;

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

/**
 * Service facade interface for clueless operations.
 */
public interface CluelessService {
  
  

    InitResponseDTO initGame(InitRequestDTO myInitRequestDTO) throws IOException, JSONException;
    
    MoveResponseDTO move(MoveRequestDTO myMoveRequestDTO) throws IOException, JSONException;
    
    EndTurnResponseDTO endTurn(EndTurnRequestDTO myEndTurnRequestDTO) throws IOException, JSONException;
    
    AccuseResponseDTO accuse(AccuseRequestDTO myAccuseRequestDTO) throws IOException, JSONException;
    
    SuggestResponseDTO suggest(SuggestRequestDTO mySuggestRequestDTO) throws IOException, JSONException;
    
    public LegalMovesDTO getLegalMoves(Integer player);

}
