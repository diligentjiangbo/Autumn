package bo.jiang.web.util;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * @author shumpert.jiang
 * @date 2017/5/11 0011 16:05
 * 集合工具类
 */
public final class CollectionUtil {

  /**
   * 判断Collection是否为空
   */
  public static boolean isEmpty(Collection<?> collection) {
    return CollectionUtils.isEmpty(collection);
  }

  /**
   * 判断Collection是否非空
   */
  public static boolean isNotEmpty(Collection<?> collection) {
    return !isEmpty(collection);
  }

  /**
   * 判断Map是否为空
   */
  public static boolean isEmpty(Map<?, ?> map) {
    return MapUtils.isEmpty(map);
  }

  /**
   * 判断Map是否非空
   */
  public static boolean isNotEmpty(Map<?, ?> map) {
    return !isEmpty(map);
  }
}
