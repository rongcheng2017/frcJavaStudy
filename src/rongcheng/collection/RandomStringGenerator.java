package rongcheng.collection;


import java.util.*;

/**
 * 随机数迭代器
 *
 * @param <T>
 */
public class RandomStringGenerator<T> implements Iterable<T> {
    public List<T> list;

    public RandomStringGenerator(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                //总是有
                return true;
            }

            @Override
            public T next() {
                return list.get((int) (list.size() * Math.random()));
            }
        };
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("List", "Tree", "Array");
        RandomStringGenerator<String> randomStrings = new RandomStringGenerator<>(strings);
        for (String randomString : randomStrings) {
            System.out.println(randomString);
        }

        ArrayList<String> arr=new ArrayList<String>();
        arr.add("123");
        arr.toArray(new String[0]);
        arr.toArray(String[]::new);
    }
}
