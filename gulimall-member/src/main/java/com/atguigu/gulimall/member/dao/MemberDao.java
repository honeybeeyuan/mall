package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author linfeng
 * @email 951243590@qq.com
 * @date 2021-06-05 16:06:57
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
