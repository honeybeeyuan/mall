package com.atguigu.gulimall.product;


import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;

import com.aliyun.oss.OSSClientBuilder;
import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    OSSClient ossClient;

    @Autowired
    CategoryService categoryService;

    @Test
    public void testFindPath(){
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径：{}", Arrays.asList(catelogPath));
    }

    @Test
    public void testUpload() throws FileNotFoundException {

        InputStream inputStream = new FileInputStream("/Users/wangziyuan/Pictures/1.jpg");
        ossClient.putObject("gulimall-zyuan", "1.jpg", inputStream);

// 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传完成");

    }



    @Test
    public void contextLoads() {
//        BrandEntity brandEntity   = new BrandEntity();
////        brandEntity.setName("pingguo");
////        brandService.save(brandEntity);
        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        System.out.println(brand_id);
        //  System.out.println("保存");
    }

}
