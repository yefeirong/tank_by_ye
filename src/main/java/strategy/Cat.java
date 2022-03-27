package strategy;

/**
 * @author: yefeirong
 * @date: 2022/3/27 16:21
 * @describe:
 */
public class Cat implements Comparable<Cat>{
    int height ,weight;
    public Cat(int height,int weight){
        this.height=height;
        this.weight=weight;

    }
    public int compareTo(Cat c){
            if (this.weight<c.weight)return -1;
            if (this.weight>c.weight)return 1;
            else {return 0;}
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
