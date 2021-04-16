public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;
        int sum = 0;
        String[] numberArray = numbers.split("[,]");
        for(String i:numberArray) {
            sum += Integer.parseInt(i);
        }
        return sum;
    }

}
