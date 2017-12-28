package state;

/**
 * @author Noblel
 * 状态设计模式
 */
class Client {
    public static void main(String[] args) {
        TvController tvController = new TvController();
        //设置开机状态
        tvController.powerOn();
        //下一个频道
        tvController.nextChannel();
        //调高音量
        tvController.turnUp();
        //设置关机状态
        tvController.powerOff();
        //调高音量
        tvController.turnUp();
    }
}
