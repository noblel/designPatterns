package iterator;

/**
 * @author Noblel
 */
interface Iterator {

    /**
     * 返回下一个元素
     * @return 下一个元素
     */
    Object next();

    /**
     * 判断是否还有元素
     * @return 是否还有元素
     */
    boolean hasNext();
}
