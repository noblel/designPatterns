package facade;

/**
 * @author Noblel
 */
class MobilePhone {
    private Phone mPhone = new PhoneImpl();
    private Camera mCamera = new CameraImpl();

    public void call() {
        mPhone.call();
    }

    public void videoChat() {
        System.out.println("---》视频聊天接通中");
        mCamera.open();
        mPhone.call();
    }

    public void hangUp() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePic();
    }

    public void closeCamera() {
        mCamera.close();
    }
}
