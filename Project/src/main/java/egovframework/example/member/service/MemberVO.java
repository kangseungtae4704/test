package egovframework.example.member.service;

import egovframework.example.common.Criteria;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class MemberVO extends Criteria {
    private Long memberIdx;     // 회원 고유번호 (PK)
    private String id;          // 사용자 ID (로그인용)
    private String password;    // 비밀번호
    private String email;       // 이메일 주소
    private String role;        // 사용자 권한
    private String nickname;    // 닉네임 (DB 컬럼 추가됨)

    // 프론트 처리용 입력값
    private String emailCode;   // 이메일 인증 코드 (입력값)
} 
