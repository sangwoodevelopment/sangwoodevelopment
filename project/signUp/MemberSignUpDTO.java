package com.example.nutri_well.SignUp;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemberSignUpDTO {
    private String username;
    private String userid;
    private String password;
    private String gender;
    private String height;
    private String weight;
    private String birth;
    private String tel;
    private int basel_metabolism;
    private String picture;

}
