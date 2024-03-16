package com.buildlive.companyservice.controller;

import com.buildlive.companyservice.dto.PartyDto;
import com.buildlive.companyservice.dto.PartyResponse;
import com.buildlive.companyservice.entity.library.Party;
import com.buildlive.companyservice.service.PartyService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/company")
public class PartyController {


    @Autowired
    PartyService partyService;
    @PostMapping("/create-party")
    public ResponseEntity<PartyResponse> addParties(@RequestBody PartyDto party){
        System.out.println("creating coming ");
//        System.out.println(party.getPartyName());
      return   ResponseEntity.ok( partyService.createParty(party));
    }
}
