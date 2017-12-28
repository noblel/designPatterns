package iterator;

/**
 * @author Noblel
 */
interface Aggregate {

    void add(Object object);

    void remove(Object object);

    Iterator iterator();
}
