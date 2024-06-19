package com.example.nutri_well.SignUp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
//사용자가 주는 요청
public class RequestDTO {

    private String id;
    private String username;
    private String email;
    private String password;
    private String nickname;
    private String gender;
    private double weight;
    private double height;
    private String tel;
    private String excludedFoods;
}
