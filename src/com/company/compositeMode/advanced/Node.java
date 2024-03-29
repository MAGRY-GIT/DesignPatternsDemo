package com.company.compositeMode.advanced;

/**
 * 将文件与目录统一看作是一类节点，做一个抽象类来定义这种节点，然后以其实现类来区分文件与目录，在实现类中分别定义各自的具体实现内容
 *
 * @author MGARY
 * @date 2019-11-27 下午4:19
 */
public abstract class Node {
    /**
     * 名称
     */
    protected String name;

    /**
     * @param name 构造器赋名
     */
    public Node(String name) {
        this.name = name;
    }

    /**
     * 新增节点：文件节点无此方法，目录节点重写此方法
     *
     * @param node 节点
     * @throws Exception
     */
    public void addNode(Node node) throws Exception {
        throw new Exception("Invalid exception");
    }

    /**
     * 显示节点：文件与目录均实现此方法
     */
    abstract void display();
}
