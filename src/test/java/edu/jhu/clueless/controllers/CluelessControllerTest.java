/**
 * 
 */
package edu.jhu.clueless.controllers;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;

import edu.jhu.clueless.DTO.InitRequestDTO;
import edu.jhu.clueless.DTO.InitResponseDTO;
import edu.jhu.clueless.controllers.*;
import edu.jhu.clueless.service.CluelessService;
import edu.jhu.clueless.service.impl.CluelessServiceImpl;

/**
 * @author davidbess
 *
 */
public class CluelessControllerTest
{
  
  /**
   * @param args
   * @throws JSONException 
   * @throws IOException 
   */
  public static void main(String[] args) throws IOException, JSONException
  {
    final CluelessService myCluelessService = new CluelessServiceImpl();
    
    CluelessController myCluelessController = new CluelessController(myCluelessService);
    
    
      InitRequestDTO myInitRequestDTO = new InitRequestDTO("testGame");
      
      ResponseEntity<InitResponseDTO> myInitResponseDTO = myCluelessController.initGame(myInitRequestDTO);
      
      System.out.println(myInitResponseDTO);

    
    
  }
  
}
