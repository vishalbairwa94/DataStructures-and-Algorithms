package PRACTICE.HackerRank;

public class TimeConversion {

    public static String timeConvert(String s){
        String[] timeSplit = s.split(":");
        int[] outputTime = new int[3];

        int hour = Integer.parseInt(timeSplit[0]);
        int minutes = Integer.parseInt(timeSplit[1]);
        int ss = Integer.parseInt(timeSplit[2].substring(0,2));
        String amOrPm = timeSplit[2].substring(2);

        if(hour == 12 && amOrPm.equals("PM")){
            outputTime[0] = hour;
            outputTime[1] = minutes;
            outputTime[2] = ss;
        }

        else if(hour == 12 && amOrPm.equals("AM")){
            outputTime[0] = 0;
            outputTime[1] = minutes;
            outputTime[2] = ss;
        }

        else if(amOrPm.equals("AM")){
            outputTime[0] = hour;
            outputTime[1] = minutes;
            outputTime[2] = ss;
        }
        else if(amOrPm.equals("PM")){
            outputTime[0] = hour+12;
            outputTime[1] = minutes;
            outputTime[2] = ss;
        }

        return String.format("%02d", outputTime[0]) + ":" + String.format("%02d", outputTime[1]) + ":" + String.format("%02d", outputTime[2]);

    }

    public static void main(String args[]){
        System.out.println(timeConvert("07:05:45PM"));
    }
}
