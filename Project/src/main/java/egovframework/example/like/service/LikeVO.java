package egovframework.example.like.service;

import java.util.Date;

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
public class LikeVO extends Criteria {
    private int likeId;      // PK (시퀀스)
    private int boardId;     // 게시글 FK
    private int memberIdx;   // 회원 FK
    private Date likeDate;   // 등록일
}
