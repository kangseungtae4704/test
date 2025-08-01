package egovframework.example.like.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.common.Criteria;
import egovframework.example.like.service.LikeVO;

@Mapper
public interface LikeMapper {
    List<LikeVO> selectLikeList(Criteria criteria);
    int selectLikeListTotCnt(Criteria criteria);

    List<LikeVO> selectLikeListByBoardId(@Param("boardId") int boardId);

    int countLikes(@Param("boardId") int boardId);
    int existsLike(LikeVO likevo);
    int checkLike(LikeVO likevo);

    void insertLike(LikeVO likevo);
    void deleteLike(LikeVO likevo);
}
