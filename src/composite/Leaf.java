package composite;

/**
 * @author Noblel
 * 组合部件类
 */
class Leaf extends Component {
    /**
     * 叶子节点不具备添加能力所以不实现
     */
    @Override
    public void add(Component component) {
        System.out.println();
    }

    /**
     * 叶子节点不具备删除能力所以不实现
     */
    @Override
    public void remove(Component component) {
        System.out.println();
    }

    /**
     * 叶子节点没有子节点所以显示自己的执行结果
     */
    @Override
    public void eachChild() {
        System.out.println(name + "执行了");
    }
}
