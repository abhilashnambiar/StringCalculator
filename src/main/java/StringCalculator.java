public class StringCalculator {

    private final StringBuilder negExcept = new StringBuilder("negatives not allowed -> ");

    public int Add(String numbers) {

        if (numbers.isEmpty())
            return 0;

        StringBuilder delimiter = new StringBuilder("[\n,]");

        boolean neg = false;

        if (numbers.charAt(0) == '/') {

            delimiter = new StringBuilder("\n|");

            if (numbers.charAt(3) == '\n')
                delimiter.append(numbers.charAt(2));
            else {
                for (int i = 2; numbers.charAt(i) != '\n'; ++i) {
                    if (numbers.charAt(i) == '[')
                        delimiter.append('(');
                    else if (numbers.charAt(i) == ']')
                        delimiter.append(')');
                    else
                        delimiter.append("\\").append(numbers.charAt(i));
                }
            }
        }

        int sum = 0;
        int number = 0;

        String[] numberArray = numbers.split(delimiter.toString());

        for(String i:numberArray) {

            try {
                number = Integer.parseInt(i);
            }
            catch (NumberFormatException ignored) {}

            if (number < 0) {
                negExcept.append(i).append(",");
                neg = true;
                continue;
            }
            else if (number > 1000) continue;
            sum += number;

        }

        if (neg) throw new NumberFormatException(negExcept.toString());
        return sum;
    }

}
