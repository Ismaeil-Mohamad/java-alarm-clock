//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "HH:mm:ss");

    LocalTime alarmTime;

    while (true){
        try {
            System.out.println("Enter an alarm time (HH:mm:ss) ");
            String inputTime = scanner.nextLine();
            alarmTime = LocalTime.parse(inputTime,formatter);
            System.out.println(" Alarm set for  " + alarmTime);
            break;
        } catch (DateTimeParseException e) {
            System.out.println("Invalid format. Please use HH:mm:ss ");
        }
    }

AlarmClock alarmClock = new AlarmClock(alarmTime);
Thread alarmThread = new Thread(alarmClock);
alarmThread.start();

    scanner.close();

}
