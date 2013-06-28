package th.co.dminer.service;

/**
 * Created with IntelliJ IDEA.
 * User: boyone
 * Date: 6/28/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class BaseEntityService<T, V> {
    public V doService(T input) throws Exception {

        long beginTime = System.currentTimeMillis();

        try {
            return this.process(input);
        } finally {
            long stopTime = System.currentTimeMillis();
            System.out.println(getEntityName()+" :" + (stopTime - beginTime));
        }
    }

    protected abstract String getEntityName();

    protected abstract V process(T input) throws Exception;
}
