public class Main {
        public boolean makeBricks(int small, int big, int goal) {
    if (big * 5 + small == goal) {
        return true;
    } else if (big * 5 + small > goal) {
        if (goal % 5 <= small) {
            return true;
        }
    }
    return false;
}
