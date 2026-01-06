public class ActivityTracker{
    private int goal; 
    private int sessions = 0;
    private int minutes = 0;
    private int maxMinutes = 0;
    public ActivityTracker( int goal ){
        this.goal = goal;
    }

    public void logMinutes( int minutes){
        this.minutes += minutes;
        this.sessions += 1;
        if ( minutes > maxMinutes){
            maxMinutes = minutes;
        }
    }
    public int getSessions(){
        return sessions;
    }
    public int getTotalMinutes(){
        return minutes;
    }

    public int getMaxMinutes(){
        return maxMinutes;
    }
    public boolean goalAchieved(){
        if (minutes >= goal ) {
            return true;
        }
        else {
            return false;
        }
    }
}