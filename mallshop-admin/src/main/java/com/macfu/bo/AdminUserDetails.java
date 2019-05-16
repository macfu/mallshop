package com.macfu.bo;

import com.macfu.model.po.UmsAdmin;
import com.macfu.model.po.UmsPermission;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author macfu
 * @description: SpringSecurity需要的用户详情
 * @date 2019/5/16
 */
public class AdminUserDetails implements UserDetails {
    private UmsAdmin umsAdmin;
    private List<UmsPermission> permissionList;

    public AdminUserDetails(UmsAdmin umsAdmin, List<UmsPermission> umsPermissionLis) {
        this.umsAdmin = umsAdmin;
        this.permissionList = umsPermissionLis;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // 返回当前用户的权限
        return permissionList.stream().filter(umsPermission -> umsPermission.getValue() != null)
                .map(umsPermission -> new SimpleGrantedAuthority(umsPermission.getValue()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
