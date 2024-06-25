package com.example.nutri_well.SignUp;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MemberService {
    //회원가입, 정보 조회, 수정
    //addmember시 boolean도 추가해줘야함
    Member registerUser(MemberSignUpDTO MemberProfile);
    Optional<Member> findByemail(String email);
    Optional<Member> findBypassword(String password);
    Optional<Member> findBygender(String gender);
    Optional<Member> findByweight(float weight);
    Optional<Member> findByheight(float height);
    Optional<Member> findBytel(String tel);
    Optional<Member> findBypicture(String picture);
    Member updateUser(Long id, Member updateUserProfile);
    void deleteUser(Long id);
}
