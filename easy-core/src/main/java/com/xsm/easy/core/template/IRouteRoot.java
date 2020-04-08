package com.xsm.easy.core.template;

import java.util.Map;

/**
 * Author: aaa
 * Date: 2018/3/29 0029
 * Email: xiasem@163.com
 * Description:
 */

public interface IRouteRoot {
    void loadInto(Map<String, Class<? extends IRouteGroup>> routes);
}
