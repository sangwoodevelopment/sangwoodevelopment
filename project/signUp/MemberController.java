package com.example.nutri_well.SignUp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//뷰에서 요청 -> 요청을 받아주는 역활
//서비스에 있는 메소드를 부르면서 연결
@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/signup")
    public String signUp(Model model){
        model.addAttribute("member",new Member());
        return "signup/signup";
    }
    @PostMapping("/signup")
    public String registerUser(@ModelAttribute("member") Member member, Model model) {
        try {
            memberService.registerUser(member);
            return "redirect:/member/signUpsuccess";
        } catch (IllegalArgumentException e) {
            model.addAttribute("에러메세지","회원가입실패"+e.getMessage());
            return "signup/signup";
        }
    }

    @GetMapping("/signUpsuccess")
    public String signupSuccess(){
        //회원가입성공시 success페이지로 이동
        return "signUpsuccess";
    }
    @GetMapping("/error")
    public String signupError(@RequestParam("signUp_error")String loginError, Model model){
        //회원가입실패시 signup페이지에 머무르기
        model.addAttribute("errorMsg","회원가입실패");
        return "signUp/signup";
    }
    @GetMapping("/main")
    public String main(){

        return "index";
    }
}
