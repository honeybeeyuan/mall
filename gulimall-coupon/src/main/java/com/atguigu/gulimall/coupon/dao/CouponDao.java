package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author linfeng
 * @email 951243590@qq.com
 * @date 2021-06-05 15:48:40
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
