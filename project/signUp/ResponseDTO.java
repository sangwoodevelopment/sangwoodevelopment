package com.example.nutri_well.SignUp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseDTO {
    private Long id;
    private String username;
    private String email;

    public ResponseDTO(Member member){
        this.id = member.getId();
        this.username = member.getUsername();
        this.email = member.getEmail();
    }

}
