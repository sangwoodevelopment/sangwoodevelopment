package com.example.nutri_well.SignUp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;
@Slf4j
@Service
public class MemberServiceImpl implements MemberService {
    //erp jpa 참고
    //중복체크, 널체크, 정보저장

    @Autowired
    private MemberRepository memberRepository;

    @Override
    @Transactional
    //이메일 중복 체크
    public Member registerUser(MemberSignUpDTO memberSignUpDTO){
        log.debug("memberSignUpDTO={}",memberSignUpDTO);
        System.out.println("memberSignUpDTO={}"+memberSignUpDTO);
        if (memberRepository.findByEmail(memberSignUpDTO.getEmail()).isPresent()) {

            throw new IllegalArgumentException("이미 사용 중인 이메일입니다");
        }
        //널체크
        if (memberSignUpDTO.getUsername() == null || memberSignUpDTO.getEmail() == null || memberSignUpDTO.getGender() == null || memberSignUpDTO.getPassword() == null) {

            throw new IllegalArgumentException("필수 입력 필드가 누락되었습니다");
        }
            SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
            Date birthDate;
        try{
            birthDate = sf.parse(memberSignUpDTO.getBirth());
        }catch (ParseException e){
            throw new IllegalArgumentException("유효하지 않은 생년월일 형식입니다 yyyy/MM/dd");
        }

                Member member = Member.builder()
                        .username(memberSignUpDTO.getUsername())
                        .email(memberSignUpDTO.getEmail())
                        .password(memberSignUpDTO.getPassword())
                        .birth(birthDate)
                        .gender(memberSignUpDTO.getGender())
                        .weight(Float.parseFloat(memberSignUpDTO.getWeight()))
                        .height(Float.parseFloat(memberSignUpDTO.getHeight()))
                        .tel(memberSignUpDTO.getTel())
                        .picture(memberSignUpDTO.getPicture())
                        .build();
        return memberRepository.save(member);
    }

    @Override
    public Optional<Member> findByemail(String email) {
        return memberRepository.findByEmail(email);
    }

    @Override
    public Optional<Member> findBypassword(String password) {
        return memberRepository.findByPassword(password);
    }

    @Override
    public Optional<Member> findBygender(String gender) {
        return memberRepository.findByGender(gender);
    }

    @Override
    public Optional<Member> findByweight(float weight) {
        return memberRepository.findByWeight(weight);
    }

    @Override
    public Optional<Member> findByheight(float height) {
        return memberRepository.findByHeight(height);
    }

    @Override
    public Optional<Member> findBytel(String tel) {
        return memberRepository.findByTel(tel);
    }

    @Override
    public Optional<Member> findBypicture(String picture) {
        return memberRepository.findByPicture(picture);
    }


    @Override
    @Transactional
    //업데이트
    public Member updateUser(Long id, Member updateUserProfile) {
        Member oldMemberProfile = memberRepository.findById(id).orElseThrow(()
                -> new IllegalArgumentException("사용자를 찾을 수 없습니다"));
        //이메일 중복 체크
        if (!oldMemberProfile.getEmail().equals(updateUserProfile.getEmail()) &&
                memberRepository.findByEmail(updateUserProfile.getEmail()).isPresent()) {
            throw new IllegalArgumentException("이미 사용 중인 이메일입니다");
        }
            oldMemberProfile.setEmail(updateUserProfile.getEmail());
            oldMemberProfile.setPassword(updateUserProfile.getPassword());
            oldMemberProfile.setGender(updateUserProfile.getGender());
            oldMemberProfile.setWeight(updateUserProfile.getWeight());
            oldMemberProfile.setHeight(updateUserProfile.getHeight());
            oldMemberProfile.setTel(updateUserProfile.getTel());
            oldMemberProfile.setPicture(updateUserProfile.getPicture());

        return memberRepository.save(oldMemberProfile);
    }
        @Override
        @Transactional
        //삭제
        public void deleteUser (Long id){
            if(!memberRepository.existsById(id)){
                throw new IllegalArgumentException("사용자를 찾을 수 없습니다");
            }
            memberRepository.deleteById(id);
        }
    }
