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

    private Member getMember() {
        return Member.builder()
                .userId("user" + System.currentTimeMillis())
                .userPw("12345678")
                .confirmPw("12345678")
                .userNm("사용자")
                .build();
    }

    @Test
    @DisplayName("회원 가입 성공시 예외 발생 없음")
    void joinSuccess() {
        JoinService joinService = new JoinService();
        Member member = Member.builder().build();
        assertDoesNotThrow(() -> {
            joinService.join(member);
        });
    }

    @Test
    @DisplayName("필수 입력항목(userId, userPw, confirmPw, userNm) 검증, 실패시에는 BadRequestException 발생")
    void requiredField() {
        JoinService joinService = new JoinService();
        assertThrows(BadRequestException.class, () -> {
            /* userId 검증 - null, 빈값 */
            Member member = getMember();
            member.setUserId(null);
            joinService.join(member);

            member = getMember();
            member.setUserId("     ");
            joinService.join(member);
        });
    }
}