package com.example.nutri_well.SignUp;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
//notnull 라이브러리 추가필요


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//사용자가 주는 요청
public class RequestDTO {
    //회원가입 추가
    //DB에 넣고 싶은 값
    @Column(nullable = false) //유니크
    private String username;

    @Column(nullable = false) //= 로그인 시 사용할 계정명
//    ex) 1234@naver.com , pass:1234
    private String email;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String birth;

    private String nickName;

    private float weight;

    private float height;

    private String tel;

    private String picture;

}

