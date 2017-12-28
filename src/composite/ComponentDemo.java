package composite;

/**
 * @author Noblel
 */
class ComponentDemo {
    public static void main(String[] args) {
        //创造根节点
        Composite rootComposite = new Composite();
        rootComposite.name = "根节点";

        //左节点
        Composite compositeLeft = new Composite();
        compositeLeft.name = "左节点";

        //右节点,添加两个叶子节点,也就是子部件
        Composite compositeRight = new Composite();
        compositeRight.name = "右节点";
        Leaf leaf1 = new Leaf();
        leaf1.name = "右-子节点1";
        Leaf leaf2 = new Leaf();
        leaf2.name = "右-子节点2";
        compositeRight.add(leaf1);
        compositeRight.add(leaf2);

        //左右节点加入根节点
        rootComposite.add(compositeRight);
        rootComposite.add(compositeLeft);

        rootComposite.eachChild();

    }
}
