package com.atguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author linfeng
 * @email 951243590@qq.com
 * @date 2021-06-05 15:48:40
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

