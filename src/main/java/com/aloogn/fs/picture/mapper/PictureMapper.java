package com.aloogn.fs.picture.mapper;

import com.aloogn.fs.picture.bean.Picture;
import com.aloogn.fs.picture.bean.PictureCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PictureMapper {
    long countByExample(PictureCriteria example);

    int deleteByExample(PictureCriteria example);

    int deleteByPrimaryKey(String account);

    int insert(Picture record);

    int insertSelective(Picture record);

    List<Picture> selectByExample(PictureCriteria example);

    Picture selectByPrimaryKey(String account);

    int updateByExampleSelective(@Param("record") Picture record, @Param("example") PictureCriteria example);

    int updateByExample(@Param("record") Picture record, @Param("example") PictureCriteria example);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}