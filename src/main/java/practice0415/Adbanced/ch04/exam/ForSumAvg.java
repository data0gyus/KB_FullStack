package practice0415.Adbanced.ch04.exam;

public class ForSumAvg {
    public static void main(String[] args) {
        int [][] array = {
                {95, 86},
                {83,92, 96},
                {78,83,93,87,88}
        };

        int sum = 0;
        int count = 0;
        for (int x = 0; x<array.length; x++){
            for (int y = 0; y<array[x].length; y++){
                sum += array[x][y];
                count++;
            }
        }
        int avg = sum/count;
        System.out.println("전체 합 : " + sum);
        System.out.println("전체 평균 : " + avg);
    }
}
