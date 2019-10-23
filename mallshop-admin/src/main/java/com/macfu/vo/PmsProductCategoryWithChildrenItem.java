package com.macfu.vo;

import com.macfu.model.po.PmsProductCategory;
import lombok.Data;

import java.util.List;

@Data
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory {
    private List<PmsProductCategory> child;
}
