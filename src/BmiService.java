public class BmiService {
    public int calculate(int weightkg, double heightmetr) {
        int result = (int) (weightkg / (heightmetr * heightmetr));

        return result;

    }
    
}
