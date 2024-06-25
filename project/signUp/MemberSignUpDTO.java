package com.example.nutri_well.SignUp;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Getter
@Data
public class MemberSignUpDTO {
    private String username;
    private String email;
    private String password;
    private String birth;
    private String gender;
    private String weight;
    private String height;
    private String tel;
    private int basel_metabolism;
    private String picture;

}
