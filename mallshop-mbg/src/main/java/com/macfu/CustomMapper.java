package com.macfu;

import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * @author macfu
 * @description:
 * @date 2019/5/16
 */
public interface CustomMapper<T> extends Mapper<T>, MySqlMapper<T>, IdsMapper<T> {
}
