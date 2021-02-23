package top.parak;

import java.util.*;
import java.util.function.Supplier;

/**
 * <p> Project: Test </p>
 * <p> Package: top.parak </p>
 * <p> FileName: CollectionTypeTest <p>
 * <p> Description: <p>
 * <p> Created By IntelliJ IDEA </p>
 *
 * @author KHighness
 * @since 2020/12/14
 */

public class CollectionTypeTest {
    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<String>(),
                new HashMap<String, String>().values()
        };
        Super subToSuper = new Sub();
        for (Collection<?> collection : collections) {
            System.out.println(subToSuper.getType(collection));
        }
    }

    abstract static class Super {
        public static String getType(Collection<?> collection) {
            return "Super:collection";
        }

        public String getType(List<?> list) {
            return "Super:list";
        }

        public String getType(ArrayList<?> list) {
            return "Super:arrayList";
        }

        public String getType(HashSet<?> set) {
            return "Super:hashSet";
        }

        public String getType(HashMap<?, ?> map) {
            return "Super:hashMap";
        }
    }

    static class Sub extends Super {
        public static String getType(Collection<?> collection) {
            return "Sub:collection";
        }
    }

}


