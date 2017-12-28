package memo.multimode;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Noblel
 */
public class BeanUtils {
    public static Map<String, Object> backupProp(Object bean) {
        Map<String, Object> result = new HashMap<>(10);
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                String fieldName = des.getName();
                Method getter = des.getReadMethod();
                Object fieldValue = getter.invoke(bean);
                if (!"class".equalsIgnoreCase(fieldName)) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void restoreProp(Object bean, Map<String, Object> propMap) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                String filedName = des.getName();
                if (propMap.containsKey(filedName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, propMap.get(filedName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
