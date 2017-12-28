package state;

/**
 * @author Noblel
 * 电源操作接口
 */
interface PowerController {
    /**
     * 开机
     */
    void powerOn();

    /**
     * 关机
     */
    void powerOff();
}
