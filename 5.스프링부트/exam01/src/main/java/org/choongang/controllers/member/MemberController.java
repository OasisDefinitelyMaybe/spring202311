package org.choongang.controllers.member;

import lombok.extern.slf4j.Slf4j;
import org.choongang.entities.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {
    @GetMapping("/join")
    public String join() {
        log.info("로그 메세지!");
        log.info("로그 {}, {}", "값1", "값2");
        return "member/join";
    }
    @ResponseBody
    @GetMapping("/info")
    public Member info() {
        Member member = Member.builder()
                .userNo(1L)
                .userPw("12345678")
                .userId("user01")
                .userNm("사용자01")
                .email("user01@test.org")
                .regDt(LocalDateTime.now())
                .modDt(LocalDateTime.now())
                .build();

        return member;
    }

    @GetMapping("/list")
    public List<Member> list() {
        List<Member> members = IntStream.rangeClosed(1,10)
                .mapToObj(i -> Member.builder()
                        .userNo(Long.valueOf(i))
                        .userId("user" + i)
                        .userNm("사용자" + i)
                        .userPw("12345678")
                        .email("user" + i + "@test.org")
                        .regDt(LocalDateTime.now())
                        .modDt(LocalDateTime.now())
                        .build()
                ).toList();
        return members;
    }


    @GetMapping("/message")
    public String message() {
        return "안녕하세요!";
    }

    @GetMapping("/process")
    public void process() {
        System.out.println("처리....");
    }
}
