package com.example.nutri_well.SignUp;

import com.example.nutri_well.SignUp.Member;
import com.example.nutri_well.SignUp.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
    ResponseDTO registerMember(RequestDTO requestdto);

}
