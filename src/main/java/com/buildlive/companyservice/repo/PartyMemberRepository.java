package com.buildlive.companyservice.repo;

import com.buildlive.companyservice.entity.company.Company;
import com.buildlive.companyservice.entity.library.Party;
import com.buildlive.companyservice.entity.library.PartyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PartyMemberRepository extends JpaRepository<PartyMember, UUID> {

//    Optional<PartyMember> findByPartyEmail(String partyEmail);

//    Optional<PartyMember> findByPartyEmail(String partyEmail);


//    Optional<PartyMember> findByParty(Party party);

//    Optional<PartyMember> findByPartyEmailAndParty(String partyMemberEmail, Party party);




    List<PartyMember> findByParty(Party party);


    @Query("SELECT pm FROM PartyMember pm WHERE pm.party_email = :email")
    Optional<PartyMember> findByPartyEmail(@Param("email") String email);
}

