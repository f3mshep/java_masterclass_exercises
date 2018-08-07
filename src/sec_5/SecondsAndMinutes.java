public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0 || (seconds < 0 || seconds > 59 )) return "Invalid Value";
        int hours = 0;
        if (minutes > 59){
            hours = minutes / 60;
            minutes = minutes % 60;
        }
        String hourStr = String.format("%02d", hours);
        String minStr = String.format("%02d", minutes);
        String secondStr = String.format("%02d", seconds);
        return  hourStr + "h " + minStr + "m " + secondStr +"s";
    }

    public static String getDurationString(int seconds){
        if (seconds < 0) return "Invalid Value";
        int min = 0;
        if (seconds > 59) {
            min = seconds / 60;
            seconds = seconds % 60;
        }
        return getDurationString(min, seconds);
    }


    public static void main(String[] args){
        System.out.println(getDurationString(3667));

    }

}
