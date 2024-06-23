package com.example.nutri_well.SignUp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "NUTRI")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "member_seq")
    @SequenceGenerator(name = "member_seq",sequenceName = "member_sequence", allocationSize = 1)
    private Long id;

    @Column(nullable = false) //유니크
    private String username;

    @Column(nullable = false) //= 로그인 시 사용할 계정명
//    ex) 1234@naver.com , pass:1234
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String birth;

    @Column(nullable = false)
    private String gender;

    private float weight;

    private float height;

    private String tel;

    private String picture;

//    @Column(nullable = false)
//    private boolean state;
//    //회원탈퇴

//    role
    //스프링시큐리티에서 사용하는데 일반회원인지 관리자회원인지 역활구분
    private int basel_metabolism;
}
