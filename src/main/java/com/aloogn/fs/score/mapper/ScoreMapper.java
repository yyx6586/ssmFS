package com.aloogn.fs.score.mapper;

import com.aloogn.fs.score.bean.Score;
import com.aloogn.fs.score.bean.ScoreCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper {
    long countByExample(ScoreCriteria example);

    int deleteByExample(ScoreCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreCriteria example);

    Score selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreCriteria example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreCriteria example);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);
}