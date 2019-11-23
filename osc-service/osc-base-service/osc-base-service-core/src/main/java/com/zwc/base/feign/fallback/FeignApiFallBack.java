package com.zwc.base.feign.fallback;

import com.zwc.base.feign.FeignApi;
import org.springframework.stereotype.Component;

/*
 * @ClassName FeignApi
 * @Desc TODO   fallback
 * @Date 2019/5/20 23:21
 * @Version 1.0
 */
@Component
public class FeignApiFallBack implements FeignApi {

    /*
     * @ClassName FeignApiFallBack
     * @Desc TODO   调用 log-service 服务中的 b() 方法失败时执行
     * @Date 2019/5/20 23:31
     * @Version 1.0
     */
    @Override
    public String b() {
        return "Hello！aUseB fail";
    }

}
