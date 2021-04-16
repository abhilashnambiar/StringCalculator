public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String delimiter = "[\n,]";
        if (numbers.charAt(0) == '/') delimiter = "[\n," + numbers.charAt(2) + "]";
        int sum = 0;
        String[] numberArray = numbers.split(delimiter);
        for(String i:numberArray) {
            try {
                sum += Integer.parseInt(i);
            } catch (NumberFormatException ignored) {}
        }
        return sum;
    }

}
