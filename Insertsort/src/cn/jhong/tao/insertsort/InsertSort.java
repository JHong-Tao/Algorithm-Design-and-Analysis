package cn.jhong.tao.insertsort;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Author: JHong.Tao
 * Date: 2019-10-12-19:41
 * Version：1.0.0
 * Description:
 */
public class InsertSort {

    /**
     * 插入排序算法
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr){
        int temp;   // temp为中间变量也就是担任哨兵
        // i从1开始计数，默认将未进行排序的序列的第一个数当做已经拍好序的序列
        for (int i = 1;i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                temp = arr[i];  // 获取数组将要被插入已经拍好序的未排序元素
                // 遍历已经排好序的序列，寻找需要被插入的元素在已经排好序的元素的位置
                for (int j = i; j >= 0; j--){
                    if(j > 0 && arr[j-1] > temp){
                        arr[j] = arr[j-1];
                    }else {
                        arr[j] = temp;
                        break;  // 找到位置就退出循环
                    }
                }
            }
            System.out.println("第"+i+"轮排序的结果："+Arrays.toString(arr));
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]  = {13,6,3,31,9,27,5,11};
        System.out.println("排序前："+Arrays.toString(arr));
        int arrSort[] = insertSort(arr);
        System.out.println("排序后："+Arrays.toString(arr));
    }
}
