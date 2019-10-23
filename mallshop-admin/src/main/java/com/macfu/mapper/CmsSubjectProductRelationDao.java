package com.macfu.mapper;

import com.macfu.model.po.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CmsSubjectProductRelationDao {
    int insert(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
