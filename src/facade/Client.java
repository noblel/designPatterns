package facade;

/**
 * @author Noblel
 * 外观模式
 */
class Client {
    public static void main(String[] args) {
        MobilePhone nexus6 = new MobilePhone();
        //拍照
        nexus6.takePicture();
        //视频聊天
        nexus6.videoChat();
    }
}
