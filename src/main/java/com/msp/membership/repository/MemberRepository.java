package com.msp.membership.repository;

import com.msp.membership.entity.Member;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByUserid(String Userid);

    boolean existsByUserid(String userid);


    @EntityGraph(attributePaths = "authorities")
    Optional<Member> findOneWithAuthoritiesByUserid(String userid);
}
