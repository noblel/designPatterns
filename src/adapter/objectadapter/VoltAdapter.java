package adapter.objectadapter;

/**
 * @author Noblel
 */
class VoltAdapter implements FiveVolt{
    Volt220 mVolt220;

    public VoltAdapter(Volt220 volt220) {
        mVolt220 = volt220;
    }

    public Volt220 getVolt220() {
        return mVolt220;
    }


    @Override
    public int getVolt5() {
        return 5;
    }
}
