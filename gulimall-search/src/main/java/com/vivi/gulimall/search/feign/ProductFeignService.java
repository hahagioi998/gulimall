package com.vivi.gulimall.search.feign;

import com.vivi.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangwei
 * 2020/10/30 20:55
 */
@FeignClient("gulimall-product")
public interface ProductFeignService {

    @RequestMapping("/product/attr/info/{attrId}")
    // @RequiresPermissions("product:attr:info")
    R info(@PathVariable("attrId") Long attrId);

}
