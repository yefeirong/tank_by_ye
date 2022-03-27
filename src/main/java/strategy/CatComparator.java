package strategy;

/**
 * @author: yefeirong
 * @date: 2022/3/27 17:09
 * @describe:
 */
public class CatComparator implements Comparator<Cat>{
    private   int height ,weight;



    @Override
    public int compareTo(Cat o1, Cat o2) {
        if (o1.weight<o2.weight)return -1;
        if (o1.weight>o2.weight)return 1;
        else {return 0;}

    }

    @Override
    public String toString() {
        return "CatComparator{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
