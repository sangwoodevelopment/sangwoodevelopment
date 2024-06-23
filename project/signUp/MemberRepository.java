package com.example.nutri_well.SignUp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
    Optional<Member> findByPassword(String password);
    Optional<Member> findByTel(String tel);
    Optional<Member> findByGender(String gender);
    Optional<Member> findByWeight(float weight);
    Optional<Member> findByHeight(float height);
    Optional<Member> findByPicture(String picture);

}
