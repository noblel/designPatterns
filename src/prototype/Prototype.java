package prototype;

import java.io.*;

/**
 * @author Noblel
 * 原型模式
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String string;

    /**
     * 浅复制,修改为public
     */
    @Override
    public Object clone() {
        Prototype proto = null;
        try {
            proto = (Prototype) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proto;
    }

    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

}

