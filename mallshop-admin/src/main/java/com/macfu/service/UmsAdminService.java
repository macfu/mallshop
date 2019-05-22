package com.macfu.service;

import com.macfu.model.po.UmsAdmin;
import com.macfu.model.po.UmsPermission;
import com.macfu.model.po.UmsRole;
import com.macfu.vo.UmsAdminVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author macfu
 * @description: 后台管理员service
 * @date 2019/5/16
 */
public interface UmsAdminService {

    /**
     * 根据用户名获取后台管理员
     *
     * @param username
     * @return
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     *
     * @param umsAdminVo
     * @return
     */
    UmsAdmin register(UmsAdminVo umsAdminVo);

    /**
     * 登录
     *
     * @param username
     * @param password
     * @return
     */
    String login(String username, String password);

    /**
     * 刷新token
     *
     * @param oldToken
     * @return
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     *
     * @param id
     * @return
     */
    UmsAdmin getItem(Long id);

    /**
     * 根据用户名或昵称分页查询用户
     *
     * @param name
     * @param pageSize
     * @param pageNum
     * @return
     */
    List<UmsAdmin> list(String name, Integer pageSize, Integer pageNum);

    /**
     * 修改指定用户信息
     *
     * @param id
     * @param admin
     * @return
     */
    int update(Long id, UmsAdmin admin);

    /**
     * 删除指定用户
     *
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 修改用户角色表
     *
     * @param adminId
     * @param roleIds
     * @return
     */
    @Transactional
    int updateRole(Long adminId, List<Long> roleIds);

    /**
     * 获取用户对应角色
     *
     * @param adminId
     * @return
     */
    List<UmsRole> getRoleList(Long adminId);

    /**
     * 修改用户+-权限
     *
     * @param adminId
     * @param peremissionIds
     * @return
     */
    @Transactional
    int updatePermission(Long adminId, List<Long> peremissionIds);

    /**
     * 获取用户所有权限(包括角色权限和+-权限)
     *
     * @param adminId
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
