package com.example.nutri_well.SignUp;

public class ResponseDTO {
    private String id;
    private String username;
    private String email;
    private String nickname;
    private String gender;
    private double weight;
    private double height;
    private String tel;
    private String excludedFoods;

    public ResponseDTO(String id, String username, String email, String nickname, String gender, double weight, double height, String tel, String excludedFoods) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.nickname = nickname;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.tel = tel;
        this.excludedFoods = excludedFoods;
    }
}
