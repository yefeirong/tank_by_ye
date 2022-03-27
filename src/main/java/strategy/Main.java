package strategy;

/**
 * @author: yefeirong
 * @date: 2022/3/27 16:21
 * @describe:
 */
public class Main {
    public static void main(String[] args) {
//        Sorter sorter = new Sorter();
//        Cat[] arr = {new Cat(3,3),new Cat(4,4),new Cat(1,1)};
//        sorter.sort(arr);
        SorterComparator sorter = new SorterComparator();
        Cat[] arr = {new Cat(3,3),new Cat(4,4),new Cat(1,1)};
        sorter.sort(arr,new CatComparator() );
    }
}
