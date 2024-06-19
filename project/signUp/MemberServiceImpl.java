package com.example.nutri_well.SignUp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    //erp jpa 참고
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public ResponseDTO registerMember(RequestDTO requestdto) {
        Member member = new Member();
        member.setUsername(requestdto.getUsername());
        member.setPassword(requestdto.getPassword());
        member.setEmail(requestdto.getEmail());
        member.setNickname(requestdto.getNickname());
        member.setGender(requestdto.getGender());
        member.setWeight(requestdto.getWeight());
        member.setHeight(requestdto.getHeight());
        member.setTel(requestdto.getTel());
        member.setExcludedFoods(requestdto.getExcludedFoods());

        Member saveMember = memberRepository.save(member);
        return new ResponseDTO(
                saveMember.getId(),
                saveMember.getUsername(),
                saveMember.getEmail(),
                saveMember.getNickname(),
                saveMember.getGender(),
                saveMember.getWeight(),
                saveMember.getHeight(),
                saveMember.getTel(),
                saveMember.getExcludedFoods()

        );
    }
}
