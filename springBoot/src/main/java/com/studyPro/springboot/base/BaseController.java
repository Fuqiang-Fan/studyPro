package com.studyPro.springboot.base;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 范富强
 * @description
 * @date 2018/1/10 10:22
 */
public class BaseController {

    // 把spring data的page进行转换，变成easyui需要的数据
    public <T> Map<String, Object> toEasyUIData(Page<T> page) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("rows", page.getRows());
        map.put("total", page.getCount());
        return map;
    }
}
