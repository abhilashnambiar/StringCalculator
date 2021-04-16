public class StringCalculator {

    public int Add(String numbers) {
        if (numbers.isEmpty()) return 0;
        String delimiter = "[\n,]";
        boolean neg = false;
        StringBuilder negExcept = new StringBuilder("negatives not allowed -> ");
        if (numbers.charAt(0) == '/') delimiter = "[\n" + numbers.charAt(2) + "]";
        int sum = 0;
        String[] numberArray = numbers.split(delimiter);
        for(String i:numberArray) {
            try {
                if (Integer.parseInt(i) < 0) {
                    negExcept.append(i).append(",");
                    neg = true;
                    continue;
                }
                sum += Integer.parseInt(i);
            } catch (NumberFormatException ignored) {}
        }
        if (neg) throw new NumberFormatException(negExcept.toString());
        return sum;
    }

}
