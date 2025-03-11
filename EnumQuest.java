public class EnumQuest {
    
    public enum Day{
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false),
        SUNDAY(false);

        private final boolean isWeekDay;

        private Day(boolean isWeekDay) {
            this.isWeekDay = isWeekDay;
        }

        public String getType(){
            return isWeekDay ? "Weekday" : "weekend";
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Printing all the days of week");

        for(Day day : Day.values()){
            System.out.println(day +" : " + day.getType());
        }
    }

}
