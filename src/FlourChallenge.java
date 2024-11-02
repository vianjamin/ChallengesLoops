public class FlourChallenge {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));

    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //bigCount = 5kilo && smallCount = 1kilo && goal = sum of small and bigCount
        if (goal < 0 || smallCount < 0 || bigCount < 0) return false;
        int bigAmount = bigCount * 5;
        int sum = bigAmount + smallCount;
        if (sum == goal) {
            return true;
        } else if ((sum > goal) && (bigAmount < goal)) {
            return true;
        } else return false;

    }
}
