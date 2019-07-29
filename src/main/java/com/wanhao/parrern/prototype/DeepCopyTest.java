package com.wanhao.parrern.prototype;

/**
 * Created by LiuLiHao on 2019/7/29 0029 下午 09:27
 * @author : LiuLiHao
 * 描述：
 */
public class DeepCopyTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(11);
        animal.setName("老虎");
        ZooKeeper zooKeeper = new ZooKeeper();
        zooKeeper.setAge(22);
        zooKeeper.setName("饲养");
        animal.setZooKeeper(zooKeeper);

        //复制
        Animal animal1 = animal.deepCopy();
        Animal animal2 = animal.deepCopy();

        System.out.println(animal1==animal2);
        System.out.println(animal.getZooKeeper()==animal2.getZooKeeper());
    }
}
