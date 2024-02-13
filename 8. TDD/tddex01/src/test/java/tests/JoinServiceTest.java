package tests;

import member.controllers.Member;
import member.service.BadRequestException;
import member.service.JoinService;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("회원가입 기능 테스트")
public class JoinServiceTest {

    private JoinService joinService;

    @BeforeEach
    void init() {
        joinService = new JoinService();
    }

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccess() {
        System.out.println("joinSuccess");
        JoinService joinService = new JoinService();
        Member member = Member.builder().build();
        assertDoesNotThrow(() -> {
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 입력항목(userId, userPw, confirmPw, userNm) 검증, 실패시에는 BadRequestException 발생")
    void requiredField() {
        System.out.println("requiredField");
        JoinService joinService = new JoinService();
        assertThrows(BadRequestException.class, () -> {
            Member member = Member.builder()
                    .userPw("123456")
                    .confirmPw("123456")
                    .userNm("사용자01")
                    .build();

            joinService.join(member);
        });
    }
}