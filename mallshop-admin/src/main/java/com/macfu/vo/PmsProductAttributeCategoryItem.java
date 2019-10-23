package com.macfu.vo;

import com.macfu.model.po.PmsProductAttribute;
import com.macfu.model.po.PmsProductAttributeCategory;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含有分类下属性的dto
 */
@Getter
@Setter
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    private List<PmsProductAttribute> productAttributeList;
}
