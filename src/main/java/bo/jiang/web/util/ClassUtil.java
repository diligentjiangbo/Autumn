package bo.jiang.web.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author shumpert.jiang
 * @date 2017/5/16 0016 9:23
 * 类操作工具类
 */
public final class ClassUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(ClassUtil.class);

  /**
   * 获取类加载器
   */
  public static ClassLoader getClassLoader() {
    return Thread.currentThread().getContextClassLoader();
  }

  /**
   * 加载类
   */
  public static Class<?> loadClass(String className, boolean isInitialized) {
    Class<?> cls;
    try {
      cls = Class.forName(className, isInitialized, getClassLoader());
    } catch (ClassNotFoundException e) {
      LOGGER.error("load class failure", e);
      throw new RuntimeException(e);
    }
    return cls;
  }

}
