package org.choongang.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.core.ApplicationServletRegistration;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Member {
    @Id // Primary Key: 기본키
    private Long userNo;
    private String userId;
    @JsonIgnore
    private String userPw;
    private String userNm;
    private String email;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm")
    private LocalDateTime regDt;

    @JsonFormat(pattern = "yyyy.MM.dd HH:mm")
    private LocalDateTime modDt;
}
