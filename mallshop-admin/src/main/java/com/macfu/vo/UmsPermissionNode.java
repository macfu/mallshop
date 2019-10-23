package com.macfu.vo;

import com.macfu.model.po.UmsPermission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UmsPermissionNode extends UmsPermission {
    @Getter
    @Setter
    private List<UmsPermissionNode> children;
}
