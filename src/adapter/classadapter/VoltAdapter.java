package adapter.classadapter;

/**
 * @author Noblel
 */
class VoltAdapter extends Volt220 implements FiveVolt{
    @Override
    public int getVolt5() {
        return 5;
    }
}
