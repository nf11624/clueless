/**
 * 
 */
package edu.jhu.clueless.controllers;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.jhu.clueless.DTO.InitRequestDTO;
import edu.jhu.clueless.DTO.InitResponseDTO;
import edu.jhu.clueless.service.CluelessService;

@RestController
@RequestMapping("${application.base-path}/api")
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
    @PostMapping("/init")
    ResponseEntity<InitResponseDTO> getDocumentsWithBiasingBOQ(@RequestBody InitRequestDTO myInitRequestDTO) throws IOException, JSONException 
    {
      InitResponseDTO result = myCluelessService.initGame(myInitRequestDTO);
      return ResponseEntity.ok().body(result);
    }

}